package com.naveen.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		System.out.println(context.getClass().getName());
		
		System.out.println("Beans Loaded :: " + context.getBeanDefinitionCount());
	}

}


/*
output::

Spring Banner URL :: https://patorjk.com/software/taag/#p=display&f=Univers&t=NAVEEN
                                                                                 
888b      88         db   8b           d8  88888888888  88888888888  888b      88  
8888b     88        d88b  `8b         d8'  88           88           8888b     88  
88 `8b    88       d8'`8b  `8b       d8'   88           88           88 `8b    88  
88  `8b   88      d8'  `8b  `8b     d8'    88aaaaa      88aaaaa      88  `8b   88  
88   `8b  88     d8YaaaaY8b  `8b   d8'     88"""""      88"""""      88   `8b  88  
88    `8b 88    d8""""""""8b  `8b d8'      88           88           88    `8b 88  
88     `8888   d8'        `8b  `888'       88           88           88     `8888  
88      `888  d8'          `8b  `8'        88888888888  88888888888  88      `888  
                                                                                   
                                                                                   
[2m2024-02-04T12:40:30.475+05:30[0;39m [32m INFO[0;39m [35m3920[0;39m [2m---[0;39m [2m[           main][0;39m [36mcom.naveen.demo.Application             [0;39m [2m:[0;39m Starting Application using Java 17.0.2 with PID 3920 (F:\SBMS\SBMS Projects\09-SpringBoot-App\target\classes started by Jadi kumar in F:\SBMS\SBMS Projects\09-SpringBoot-App)
[2m2024-02-04T12:40:30.477+05:30[0;39m [32m INFO[0;39m [35m3920[0;39m [2m---[0;39m [2m[           main][0;39m [36mcom.naveen.demo.Application             [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
[2m2024-02-04T12:40:30.915+05:30[0;39m [32m INFO[0;39m [35m3920[0;39m [2m---[0;39m [2m[           main][0;39m [36mcom.naveen.demo.Application             [0;39m [2m:[0;39m Started Application in 0.807 seconds (process running for 1.405)
Logic executing to load data into cache...
Logic executing to send email...
org.springframework.context.annotation.AnnotationConfigApplicationContext
Beans Loaded :: 49
*/