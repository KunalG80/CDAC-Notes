npm init -y  //summary of project
creates a package.json file

1.0.0 //major development . minor development . patch(bug fix)

echo \"Error: no test specified\" && exit 1

nodemon
npm i nodemon

express Framework(MVC)
npm i express


-------------------------------------------------------------------------

MongoDB

default port no 27017

Tables are schemaless.
semi-structured database

run-

1. go to the path where mongoDB is installed or file is there.
2. run mongod.exe // Activates mongod server
3. run mongo.exe // Activates mongo client

create c:/data/db folder in c drive.

CMD-

show dbs  // db list

use database_name // create/select db

db //current selected database

db.createCollection('users'); // creates collection(Table)

show collections // shows list of collections

db.users.insert([{"name":"saransh","age":20},{"name":"kunal","age":23},{"name":"ansh","age":27}]) // Insert data into collections

db.users.find(); //shows all data from collection (select * from users)

db.users.find().pretty(); //show all data from collection in formatted

db.users.find({age:23}); //sort out

db.users.find({age:{$gt:23}});    //greater than
db.users.find({age:{$gte:23}});   //greater than equal to
db.users.find({age:{$lt:23}});    //less than
db.users.find({age:{$lte:23}});   //less than equal to
db.users.find({age:{$ne:23}});    //not equal to

db.users.remove({}); //delete all records form collection
db.users.remove({age:27}); //delete particular records

db.users.update({age:23},{$set:{name:'leon'}}) // update the data into collection

