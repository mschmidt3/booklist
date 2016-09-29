Booklist
========

A Grails demo application 

Plan
--------------

Domain-Classes
* Book
* Author

Implementation
--------------

Grails 2.5.0
Book and Author with scaffolding controllers

Data with curl
--------------

Post some Data with curl:

```
curl -X POST http://localhost:8080/booklist/author/save --form lastname=Miller --form givenname=Arthur
curl -X POST http://localhost:8080/booklist/author/save --form lastname=Doile --form givenname=Conan

curl -X GET -H 'Content-Type: application/json' http://localhost:8080/booklist/author/show/2.json
```

