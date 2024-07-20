Exception Handling In REST API 


-> Exception is an unexpected and unwanted situation occurring in the application 

-> When exception occurred our program will terminate abnormally 

-> To achieve graceful termination of the program we need to handle the exception 

-> In Java we have below keywords to handle the exceptions 

1) try: It is used to keep risky code 

2) catch: Catch block is used to handle the exception 

3) throw: It is used to re-throw the exception 

4) throws: It is used to ignore the exception 

5) finally: It is used to execute clean up logic (closing files, closing connection, release resources....)


Note: When we get exception in REST API we should convey that exception information to client / client application in Json format 

Ex:

{ 

 msg: "Exception Reason" 

 code: "SBI0004" 

} 

Note: In project, for every exception we will use one CODE i.e., exception code

-> In Spring web mvc we can handle exceptions in 2 ways 

1) Controller Based Exception Handling 

 - Exception Handlers applicable for only particular controller 

2) Global Exception Handling 

 - Exception Handlers applicable for all the classes in the project 
