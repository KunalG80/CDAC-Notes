const express = require('express');
const mongoose = require('mongoose');
const app = express();

app.use(express.json);

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

app.get('/users',async(req,res)=>{
   try{
    var result = await userModel.find();
    res.send(result);
   }
   catch(err){
    res.send(err);
   }
});

app.post('/users',async(req,res)=>{
    try{
        const instance =userModel(req.body);
        await instance.save();
        res.send("user added succesfully")
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

app.listen(9000);