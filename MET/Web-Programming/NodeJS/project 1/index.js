const nodemailer = require("nodemailer");

const transporter = nodemailer.createTransport({
  service: 'gmail',
  auth: {
    user: "saranshsharma2103@gmail.com",
    pass: "",
  },
});

const express = require('express');
const mongoose = require('mongoose');
const app = express();

app.use(express.json()); //JSON
app.use(express.urlencoded()); //FORM Tag

const result = require('./db/database.js')

result()
.then(()=>console.log('db Connection'))
.catch(err=>console.log(err))


const Schema = mongoose.Schema;
var userSchema = new Schema({
    name : String,
    age : Number
});

const userModel = mongoose.model('users',userSchema);

// app.get('/users',async(req,res)=>{
//     // res.send('hello')

//    try{
//     var result = await userModel.find();
//     res.send(result);
//    }
//    catch(err){
//     res.send(err);
//    }
// });

app.get('/users',async(req,res)=>{
    // res.send('hello')
   try{
    var result = await userModel.find();
    res.render('showdata.ejs',{data:result});
   }
   catch(err){
    res.send(err);
   }
});

app.get("/add",(req,res)=>{
    res.render('adddata.ejs')
})

// app.post('/users',async(req,res)=>{
//     try{
//         const instance =userModel(req.body);
//         await instance.save();
//         res.send("user added succesfully")
//     }
//     catch(err){
//     res.send(err);
//     }

app.post('/users',async(req,res)=>{
    try{
        const instance =userModel(req.body);
        await instance.save();
        res.redirect("/users")
    }
    catch(err){
    res.send(err);
    }
});

app.put('/users',(req,res)=>{
    res.send("update data from database")
});

app.delete('/users',(req,res)=>{
    res.send("delete data from database")
});

app.post("/email-action",async(req,res)=>{
    const info = await transporter.sendMail({
        from: '<saranshsharma2103@gmail.com>', // sender address
        to: req.body.email, // list of receivers
        subject: req.body.subject, // Subject line
        text: "Hello world?", // plain text body
        html: req.body.message, // html body
      });
    
      console.log("Message sent: %s", info.messageId);
      res.send("Email sent successfully");
})

app.listen(9000);

