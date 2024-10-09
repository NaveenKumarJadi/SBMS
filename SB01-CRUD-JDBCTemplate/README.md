
POST: http://localhost:9091/api/users/addUser

{
    "name": "shiva",
    "email": "shiva@gmail.com"
}

GET: http://localhost:9091/api/users/2

GET: http://localhost:9091/api/users/allUsers

[
    {
        "id": 1,
        "name": "ravi",
        "email": "ravi@gmail.com"
    },
    {
        "id": 2,
        "name": "ram",
        "email": "ram@gmail.com"
    },
    {
        "id": 3,
        "name": "shiva",
        "email": "shiva@gmail.com"
    }
]

PUT: http://localhost:9091/api/users/3

DELETE: http://localhost:9091/api/users/3