POST: http://localhost:8080/sendMail

Request Data:
{
    "recipient": "receiver@gmail.com",
    "msgBody": "Hi Team, Hope you all are doing well",
    "subject": "Simple email message checking"
}


POST: http://localhost:8080/sendMailWithAttachment

Request Data:
{
    "recipient": "receiver@gmail.com",
    "msgBody": "Hi Team, please find below attachment",
    "subject": "Attachment email message checking",
    "attachment": "F:/springlogo.png"
}