package com.naveen;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedulingComponent {

	//It will execute by fixedRate of 3 secs
//	@Scheduled(fixedRate = 3000)
//	public void executeJob() throws Exception {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
//		System.out.println("Job starts: " + sdf.format(new Date()));
//		Thread.sleep(5000);
//		System.out.println("Job Ends : " + sdf.format(new Date()));
//	}

	//It will execute by fixedDelay of 3 secs
//	@Scheduled(fixedDelay = 3000)
//	public void executeJob() throws Exception {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
//		System.out.println("Job starts: " + sdf.format(new Date()));
//		Thread.sleep(5000);
//		System.out.println("Job Ends : " + sdf.format(new Date()));
//	}
	
	//It will execute by initialDelay of 3secs and fixedDelay of 3 secs
//	@Scheduled(fixedDelay = 3000, initialDelay = 3000)
//	public void executeJob() throws Exception {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
//		System.out.println("Job starts: " + sdf.format(new Date()));
//		Thread.sleep(5000);
//		System.out.println("Job Ends : " + sdf.format(new Date()));
//	}
	
	// It will execute a particular time
	@Scheduled(cron = "3 * * * * *")
	public void executeJob() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
		System.out.println("Job starts: " + sdf.format(new Date()));
	}
	
}
