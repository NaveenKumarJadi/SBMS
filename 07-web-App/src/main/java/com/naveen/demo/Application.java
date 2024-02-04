package com.naveen.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/")
	public String nani()
	{
		return "welcome to here..";
	}
}


/*
Console Output ::
.   ____          _            __ _ _
/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
'  |____| .__|_| |_|_| |_\__, | / / / /
=========|_|==============|___/=/_/_/_/
[32m :: Spring Boot :: [39m              [2m (v3.1.2)[0;39m

[2m2024-02-04T12:04:37.516+05:30[0;39m [32m INFO[0;39m [35m11100[0;39m [2m---[0;39m [2m[           main][0;39m [36mcom.naveen.demo.Application             [0;39m [2m:[0;39m Starting Application using Java 17.0.2 with PID 11100 (F:\SBMS\SBMS Projects\07-web-App\target\classes started by Jadi kumar in F:\SBMS\SBMS Projects\07-web-App)
[2m2024-02-04T12:04:37.523+05:30[0;39m [32m INFO[0;39m [35m11100[0;39m [2m---[0;39m [2m[           main][0;39m [36mcom.naveen.demo.Application             [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
[2m2024-02-04T12:04:38.373+05:30[0;39m [32m INFO[0;39m [35m11100[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.b.w.embedded.tomcat.TomcatWebServer [0;39m [2m:[0;39m Tomcat initialized with port(s): 8080 (http)
[2m2024-02-04T12:04:38.383+05:30[0;39m [32m INFO[0;39m [35m11100[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.apache.catalina.core.StandardService  [0;39m [2m:[0;39m Starting service [Tomcat]
[2m2024-02-04T12:04:38.383+05:30[0;39m [32m INFO[0;39m [35m11100[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.apache.catalina.core.StandardEngine   [0;39m [2m:[0;39m Starting Servlet engine: [Apache Tomcat/10.1.11]
[2m2024-02-04T12:04:38.499+05:30[0;39m [32m INFO[0;39m [35m11100[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Initializing Spring embedded WebApplicationContext
[2m2024-02-04T12:04:38.500+05:30[0;39m [32m INFO[0;39m [35m11100[0;39m [2m---[0;39m [2m[           main][0;39m [36mw.s.c.ServletWebServerApplicationContext[0;39m [2m:[0;39m Root WebApplicationContext: initialization completed in 925 ms
[2m2024-02-04T12:04:38.835+05:30[0;39m [32m INFO[0;39m [35m11100[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.b.w.embedded.tomcat.TomcatWebServer [0;39m [2m:[0;39m Tomcat started on port(s): 8080 (http) with context path ''
[2m2024-02-04T12:04:38.847+05:30[0;39m [32m INFO[0;39m [35m11100[0;39m [2m---[0;39m [2m[           main][0;39m [36mcom.naveen.demo.Application             [0;39m [2m:[0;39m Started Application in 1.751 seconds (process running for 2.659)
[2m2024-02-04T12:04:56.288+05:30[0;39m [32m INFO[0;39m [35m11100[0;39m [2m---[0;39m [2m[nio-8080-exec-1][0;39m [36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Initializing Spring DispatcherServlet 'dispatcherServlet'
[2m2024-02-04T12:04:56.288+05:30[0;39m [32m INFO[0;39m [35m11100[0;39m [2m---[0;39m [2m[nio-8080-exec-1][0;39m [36mo.s.web.servlet.DispatcherServlet       [0;39m [2m:[0;39m Initializing Servlet 'dispatcherServlet'
[2m2024-02-04T12:04:56.288+05:30[0;39m [32m INFO[0;39m [35m11100[0;39m [2m---[0;39m [2m[nio-8080-exec-1][0;39m [36mo.s.web.servlet.DispatcherServlet       [0;39m [2m:[0;39m Completed initialization in 0 ms

When stop the embedded server
[2m2024-02-04T12:20:12.324+05:30[0;39m [32m INFO[0;39m [35m11100[0;39m [2m---[0;39m [2m[n(20)-127.0.0.1][0;39m [36minMXBeanRegistrar$SpringApplicationAdmin[0;39m [2m:[0;39m Application shutdown requested.
[2m2024-02-04T12:20:12.381+05:30[0;39m [32m INFO[0;39m [35m11100[0;39m [2m---[0;39m [2m[n(20)-127.0.0.1][0;39m [36mo.apache.catalina.core.StandardService  [0;39m [2m:[0;39m Stopping service [Tomcat]
[2m2024-02-04T12:20:12.386+05:30[0;39m [32m INFO[0;39m [35m11100[0;39m [2m---[0;39m [2m[n(20)-127.0.0.1][0;39m [36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Destroying Spring FrameworkServlet 'dispatcherServlet'
*/

/*
Browser output ::
open browser and hit the url: http://localhost:8080/

welcome to here..

*/