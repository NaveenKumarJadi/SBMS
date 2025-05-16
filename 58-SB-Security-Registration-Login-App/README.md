

AppSecurityConfig.java class explanation
BCryptPasswordEncoder -> To encrypt password

UserDetailService --> load user record by name

AuthProvider -> to load user record and give to auth manager

AuthManager -> perform authentication


UsernameAndPasswordToken --> set login credentials for validation







POST: http://localhost:8080/register

RequestBody:
{
    "name": "Ram",
    "email": "ram@gmail.com",
    "pwd": "ram@123",
    "phno": 7897897899
}


POST: http://localhost:8080/login

RequestBody:
{
    "email": "ram@gmail.com",
    "pwd": "ram@123"
}








