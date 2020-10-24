const app = require('express')();
const parser = require("body-parser");
const cors = require('cors');
const fs = require("fs");
const dir = __dirname;
app.use(parser.urlencoded({ extended: true }));
app.use(parser.js());
app.use(cors());
let students = [];

function readData(){
    const filename = "student.js";
    const jsonContent = fs.readFileSync(filename, 'utf-8');
    students = JSON.parse(jsonContent);
}

function saveData(){
    const filename = "student.js";
    const jsonData = JSON.stringify(students);
    fs.writeFileSync(filename, jsonData, 'utf-8');
}
app.get("/students", (req, res)=>{
    readData();
    res.send(JSON.stringify(students));    
})

app.get("/students/:id", (req, res)=>{
    const empid = req.params.id;
    if(students.length == 0){
        readData();
    }
    let foundRec = students.find((s) => s.studentId == studentid);
    if(foundRec == null)
        throw "student not found";
    res.send(JSON.stringify(foundRec))
})

app.put("/students", (req, res)=>{
    if(students.length == 0)
        readData();
    let body = req.body;
    
    for (let index = 0; index < students.length; index++) {
        let element = students[index];
        if (element.studentId == body.studentId) {
            element.studentName = body.studentName;
            element.studentAddress = body.studentAddress;
            saveData();
            res.send("student is updated ");
        }
    }
    
})

app.post('/students', (req, res)=>{
    if (students.length == 0)
        readData();
    let body = req.body;
    stdents.push(body);  
    saveData();
    res.send("student added successfully");
})
app.delete("/students/:id", (req, res)=>{
  throw "Do it UR Self!!!!";  
})

app.listen(8118, ()=>{
    console.log("Server available at 8118");
})