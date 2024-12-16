//Asynchronous Way

const fs = require("fs");

console.log('start');

fs.readFile('home.html','utf-8',(err,data)=>{
    console.log(data);
});

console.log('end');