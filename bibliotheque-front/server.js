const express = require('express');
const bodyParser = require('body-parser')
const axios = require('axios');
const app = express();
const port = 3000;
const path = __dirname + '/src'


app.use(express.static('public'));
app.use(express.json());
app.use(bodyParser.urlencoded({ extended: true }));

app.get('/', (req, res) => {
  res.sendFile(path + '/index.html');
});


// Author

app.get('/authorList', (req, res) => {
  res.sendFile(path + '/author/authorList.html');
});

app.get('/authorForm', (req, res) => {
  res.sendFile(path + '/author/authorForm.html');
});

app.post('/addAuthor', (req, res) => {
  console.log(req.body);
  axios.post('http://localhost:8080/api/v1/author', req.body);
  res.sendFile(path + '/author/authorAdded.html');
});


// Reader 

app.get('/readerList', (req, res) => {
  res.sendFile(path + '/reader/readerList.html');
});

app.get('/readerForm', (req, res) => {
  res.sendFile(path + '/reader/readerForm.html');
});

app.post('/addReader', (req, res) => {
  console.log(req.body);
  axios.post('http://localhost:8080/api/v1/reader', req.body);
  res.sendFile(path + '/reader/readerAdded.html');
});



// Book 

app.get('/bookList', (req, res) => {
  res.sendFile(path + '/book/bookList.html');
});

app.get('/bookForm', (req, res) => {
  res.sendFile(path + '/book/bookForm.html');
});

app.post('/addBook', (req, res) => {
  let url = 'http://localhost:8080/api/v1/book/';
  if(req.body["type"]){
    req.body["type"] = 'comic';
    url = url + 'comic';
  } else {
    req.body["type"] = 'novel';
    url = url + 'novel';
  }
  console.log(req.body);
  axios.post(url, req.body);
  res.sendFile(path + '/book/bookAdded.html');
});

app.listen(port, () => {
  console.log(`Application exemple à l'écoute sur le port ${port}!`)
});
