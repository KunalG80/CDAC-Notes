// custom Modules

const mongoose = require('mongoose');

async function dbConnection(){
    await mongoose.connect('mongodb://127.0.0.1:27017/metcdac2024');
}

module.exports = dbConnection;