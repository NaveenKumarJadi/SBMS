+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

Thymeleaf 

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

-> We used JSP as a presentation technology in our spring web mvc based applications 

-> JSP can't be executed in browser directley 

-> When the request comes to JSP then internally JSP will be converted to Servlet and that servlet will send response to browser 

-> When we use JSP for presentation then burden will be increased on server because every JSP should be converted into Servlet to produce the response to browser. 

-> To overcome problems of JSP we can use Thymeleaf as a presentation technology 

-> Thymleaf is a template engine that can be used in HTML pages directley 

-> HTML pages can be executed in browser directley 

 (Thymeleaf performance will be fast when compared with jsps) 

-> In general, HTML pages are used for static data. If we use thymleaf in HTML then we can add dynamic nature to HTML pages. 

-> We can develop spring boot application with thymleaf as a presentation technology 

-> To use Thymleaf in spring boot we have below starter 

 'spring-boot-starter-thymleaf'



---------------------------------------------------------------------------------------------- 

Procedure to develop spring boot application with thymeleaf 

--------------------------------------------------------------------------------------------- 

1) Create Spring Starter Project with below dependencies 

 a) web-starter 

 b) thymeleaf-starter 

 c) devtools 

2) Create Controller with required methods ( @Controller ) 

3) Create Theymeleaf templates in src/main/resources/templates folder (file extension .html) 

4) Run the application and test it 


Note: No need to configure view resolver because Spring Boot will detect theymeleaf template files and will process them
