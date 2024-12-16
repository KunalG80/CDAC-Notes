//Synchornous Way

const fs = require("fs");

console.log('start');
var ans = fs.readFileSync('home.html','utf-8');
console.log(ans);
console.log('end');