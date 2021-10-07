**Create Student**

Method: `POST`

URL: `localhost:8080/api/student/create`

Payload:
`{"name": "Kavita",
"email": "kavita@mail.com",
"departments": { "departmentName": "Computor Engineering", "location": "India"},
"subjects": [{"name": "maths", "mark": "50"}]}`


**Get Student by ID**

Method: `GET`

URL: `localhost:8080/api/student/getById/:id`


**Get all students**

Method: `GET`

URL: `localhost:8080/api/student/all`

**Update Student**

Method: `PUT`

URL: `localhost:8080/api/student/update`

Payload:
`{"id": "sfgagdywdv",
"name": "Kavita",
"email": "kavita@mail.com",
"departments": { "departmentName": "Computor Engineering", "location": "India"},
"subjects": [{"name": "maths", "mark": "50"}]}`
