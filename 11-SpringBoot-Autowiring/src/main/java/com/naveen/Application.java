package com.naveen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.naveen.service.ReportService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ReportService reportService = context.getBean(ReportService.class);
		
		reportService.generateReport();
	}

}

/*
Output:
[2m2024-02-04T14:12:20.032+05:30[0;39m [32m INFO[0;39m [35m18916[0;39m [2m---[0;39m [2m[           main][0;39m [36mcom.naveen.Application                  [0;39m [2m:[0;39m Starting Application using Java 17.0.2 with PID 18916 (F:\SBMS\SBMS Projects\11-SpringBoot-Autowiring\target\classes started by Jadi kumar in F:\SBMS\SBMS Projects\11-SpringBoot-Autowiring)
[2m2024-02-04T14:12:20.037+05:30[0;39m [32m INFO[0;39m [35m18916[0;39m [2m---[0;39m [2m[           main][0;39m [36mcom.naveen.Application                  [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
MysqlReportDaoImpl :: Constructor
OracleReportDaoImpl :: Constructor
[2m2024-02-04T14:12:20.813+05:30[0;39m [32m INFO[0;39m [35m18916[0;39m [2m---[0;39m [2m[           main][0;39m [36mcom.naveen.Application                  [0;39m [2m:[0;39m Started Application in 1.26 seconds (process running for 2.01)
fetching report data from MySql db...
generating report....

*/
