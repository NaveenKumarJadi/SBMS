Multipart File Upload and Download Example: 

Files Store in Database:
POST: http://localhost:9090/fileDB

GET: http://localhost:9090/fileDB/flash.png


Files Store in FileSystem: Large file support
No risk of OutOfMemory, because you don’t load entire file into DB, only store a path

POST: http://localhost:9090/filesInFileSystem/upload

GET : http://localhost:9090/filesInFileSystem/NAVIN.jpg


MySQL DB : 
select * from file_data;
select * from image_data;