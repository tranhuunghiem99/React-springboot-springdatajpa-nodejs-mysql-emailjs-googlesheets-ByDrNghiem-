const fs = require('fs');
const express =require("express");



const Excel = require('exceljs')
var app =express()
var cors = require('cors')
var bodyParser = require('body-parser');
app.use(bodyParser.json())
app.use(cors())
app.use(function(req, res, next) {
    res.header("Access-Control-Allow-Origin", "*");
    res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
    next();
  });


  


app.get("/documents/:doc_id",(req,res)=>{
        
            res.header("Access-Control-Allow-Origin", "*");
            res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
            fs.readFile(`files/${req.params.doc_id}.json`, (err, data) => {
                if (err) throw err;
                let student = JSON.parse(data);
                console.log(req.params.doc_id)       
            res.send(student);
            });
     
})


app.get("/data/:doc_id",(req,res)=>{
    
   
    var docId=req.params.doc_id;
    fs.readFile(`files/${docId}.json`, (err, data) => {
        if (err) throw err;
        let ques_data = JSON.parse(data);
        console.log(req.params.doc_id)       
    res.send(ques_data);
    });
})

const path = require('path');




app.get("/get_all_files",(req,res)=>{
    
    const directoryPath = path.join(__dirname, '/files');
  
    fs.readdir(directoryPath, function (err, files) {
       
        if (err) {
            return console.log('Unable to scan directory: ' + err);
        } 
     
     

        res.send(files);
    });
 
 
});

app.post(`/add_questions/:doc_id`,(req,res)=>{
    var docs_data = req.body;
    var name = req.params.doc_id
    console.log(docs_data)
    let data = JSON.stringify(docs_data);
    fs.writeFileSync(`files/${name}.json`, data);
})



app.post(`/student_response/:doc_id`,(req,res)=>{
    var docs_data = req.body;
    var name = req.params.doc_id
    // let data_answer = JSON.stringify(docs_data.answer);
    var d = new Date();
  
 

let workbook = new Excel.Workbook()
var data =req.body.answer_data;
// console.log(data)
// fs.writeFileSync(`submittedforms/${name+" "+d.getTime()}.json`, docs_data);
 
let worksheet = workbook.addWorksheet(`${name}`)





worksheet.columns = [{header:"Time Stamp", "key":"datetime"}, ...docs_data.column ]

  worksheet.columns.forEach(column => {
    column.width = column.header.length < 12 ? 12 : column.header.length
  })
  
  worksheet.getRow(1).font = {bold: true}
 
data.forEach((e, index) => {
    
    const rowIndex = index + 2
  
 
    worksheet.addRow({
      d, ...e
   
    })

  })

  workbook.xlsx.writeFile(`${name}.xlsx`)  

})




app.listen(9000,()=>{console.log("expresss server is running at port nnumber 3000")})
