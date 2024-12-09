//built in module -- http

const http = require('http');
//console.log('http');

const server = http.createServer((req,res)=>{
    res.end('welcome Node JS')
});

server.listen(9000);
//>1024 or <65535

//Run your application in terminal: node http.js
//access ur output using http://localhost:9000