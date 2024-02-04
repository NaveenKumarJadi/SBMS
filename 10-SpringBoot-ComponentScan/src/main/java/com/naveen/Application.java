package com.naveen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.naveen.security.AppSecurity;

@SpringBootApplication
@ComponentScan(basePackages = {"com.naveen", "com.wallmart"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*
	@Bean
	public AppSecurity createInstance()
	{
		AppSecurity as = new AppSecurity();
//		custom logic to secure our functionality
		return as;
	}
	*/
}

/*
output:


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
[32m :: Spring Boot :: [39m              [2m (v3.1.2)[0;39m

[2m2024-02-04T13:08:00.734+05:30[0;39m [32m INFO[0;39m [35m14848[0;39m [2m---[0;39m [2m[           main][0;39m [36mcom.naveen.Application                  [0;39m [2m:[0;39m Starting Application using Java 17.0.2 with PID 14848 (F:\SBMS\SBMS Projects\10-SpringBoot-ComponentScan\target\classes started by Jadi kumar in F:\SBMS\SBMS Projects\10-SpringBoot-ComponentScan)
[2m2024-02-04T13:08:00.746+05:30[0;39m [32m INFO[0;39m [35m14848[0;39m [2m---[0;39m [2m[           main][0;39m [36mcom.naveen.Application                  [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
Car :: Constructor
AppConfig :: Constructor
KafkaConfig :: Constructor
UserDao :: Constructor
Motor :: Constructor
UserService :: Constructor
ReportDao :: Constructor
PasswordUtils :: Constructor
AppSecurity :: Constructor
[2m2024-02-04T13:08:01.371+05:30[0;39m [32m INFO[0;39m [35m14848[0;39m [2m---[0;39m [2m[           main][0;39m [36mcom.naveen.Application                  [0;39m [2m:[0;39m Started Application in 1.045 seconds (process running for 4.816)

*/
