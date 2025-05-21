
++++++++++++++++++
What is Cache ? 
++++++++++++++++++
-> Cache is a temporary storage 
-> When our application wants to access same data frequently then we will use Cache memory 
-> Cache will improve performance of our application by reducing database calls 

Note: Database calls are always costly which will take more time to execute 
-> To reduce no.of round trips between application and database we will use 'Cache'



++++++++++++++++++ 
Redis Cache 
++++++++++++++++++ 
-> Redis is one of the distributed cache available in the market 
-> Redis will store data in key-value pair 
-> Multiple Applications can connect with Redis Cache at a time... 
-> The open source, in-memory data store used by millions of developers as a database, cache, streaming engine, and message broker.


++++++++++++++++++
Redis Setup 
++++++++++++++++++
-> Download Redis Software 
URL : https://redis.io/download/#redis-downloads

-> Run 'redis-server.exe' file 
    Note: By default it runs on '6379' port number 
-> Run 'Redis-cli.exe' file 
-> Type 'ping' command in Redis CLI 

Open command Prompt and run the below command then you can able to see redis prompt
$ redis-cli


Note: Server will respond with 'PONG' as response
127.0.0.2:6379> ping
PONG


1.	@Cacheable
	Used for: Fetching data
•	Checks if the value is in Redis cache.
•	If present → returns the cached value.
•	If not present → calls the method, stores the result in Redis, and returns it.

2. @CachePut
	Used for: Updating the cache when saving or updating data
•	Executes the method always
•	Updates the cache with the returned result

3. @CacheEvict
	Used for: Deleting cache entries
•	Removes the specific entry (or all entries) from the cache

Optional Flags:
•	allEntries = true: removes all cached items from users cache.
•	beforeInvocation = true: evicts cache before method execution.



+++++++++++++++++++++++++++
Spring Boot with Redis Integration 
+++++++++++++++++++++++++++
-> Spring Boot provided starter pom to connect with Redis Server 
-> Create JedisConnectionFactory bean 
-> Create RedisTemplate and Inject JedisConnectionFactory into RedisTemplate 
-> Using RedisTemplate get HashOperations object 
-> Using HashOperations we can perform storing/retrieving/deleting operations with Redis Server 


++++++++++++++
Dependecies:
++++++++++++++
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-cache</artifactId>
</dependency>



+++++++++++++++++++++
Redis commands:
+++++++++++++++++++++
Open command Prompt and run the below command then you can able to see redis prompt
$ redis-cli

C:\Program Files\Redis
Note: Server will respond with 'PONG' as response
127.0.0.2:6379> ping
PONG

Redis Download URL: https://github.com/microsoftarchive/redis/releases

Redis command:
127.0.0.2:6379> set name naveen
OK
127.0.0.2:6379> get name
"naveen"
127.0.0.2:6379> set rollno 234
OK
127.0.0.2:6379> get rollno
"234"
127.0.0.2:6379> keys *
1) "rollno"
2) "name"
127.0.0.2:6379> exists rollno
(integer) 1
127.0.0.2:6379> exists rollno1
(integer) 0
127.0.0.2:6379> del rollno
(integer) 1
127.0.0.2:6379> keys *
1) "name"
127.0.0.2:6379> flushall
OK
127.0.0.2:6379> keys *
(empty list or set)
127.0.0.2:6379>clear
127.0.0.2:6379> set name cscorner
OK
127.0.0.2:6379> ttl name
(integer) -1
127.0.0.2:6379> expire name 30
(integer) 1
127.0.0.2:6379> ttl name
(integer) 18
127.0.0.2:6379> ttl name
(integer) 17
127.0.0.2:6379> ttl name
(integer) 16
127.0.0.2:6379> ttl name
(integer) 15
127.0.0.2:6379> ttl name
(integer) -2
127.0.0.2:6379> get name
(nil)
127.0.0.2:6379> set name cscorner
OK
127.0.0.2:6379> setex name 5 cscorner
OK
127.0.0.2:6379> get name
"cscorner"
127.0.0.2:6379> get name
(nil)
127.0.0.2:6379>


