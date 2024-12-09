//
//

const http = require('http');
const fs = require('fs');

const server = http.createServer((req,res)=>{
    switch(req.url){
        case '/':
            var filename="home.html";
            break;
        case '/about':
            var filename="about.html";
            break;
        case '/contact':
            var filename="contact.html";
            break;
        default:
        var filename="home.html";
        break;
    }
    console.log(filename);

    fs.readFile(filename , 'utf-8' , (err, data)=>{
        if (err) throw err;
        res.end(data);
    })
});

server.listen(9000);