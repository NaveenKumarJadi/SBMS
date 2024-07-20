Mono & Flux Objects :

-> Mono means single object 

-> Flux means stream of objects 


-> Create spring boot application with below 3 dependencies 

	1) web-starter 

	2) webflux 

	3) lombok

------------------------------

http://localhost:8080/event

(it will generate only once - “MONO”)

data:{"name":"Navin","createDate":"2023-09-01T05:23:40.987+00:00"}


http://localhost:8080/events 

(it is generating continuously for every 5 seconds – “FLUX”)

data:{"name":"Navin","createDate":"2023-09-01T05:23:40.987+00:00"}

data:{"name":"Navin","createDate":"2023-09-01T05:23:40.987+00:00"}

data:{"name":"Navin","createDate":"2023-09-01T05:23:40.987+00:00"}

data:{"name":"Navin","createDate":"2023-09-01T05:23:40.987+00:00"}

data:{"name":"Navin","createDate":"2023-09-01T05:23:40.987+00:00"}

data:{"name":"Navin","createDate":"2023-09-01T05:23:40.987+00:00"}

data:{"name":"Navin","createDate":"2023-09-01T05:23:40.987+00:00"}

data:{"name":"Navin","createDate":"2023-09-01T05:23:40.987+00:00"}

data:{"name":"Navin","createDate":"2023-09-01T05:23:40.987+00:00"}
