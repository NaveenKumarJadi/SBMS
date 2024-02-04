package com.naveen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.naveen.entity.Player;
import com.naveen.repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
//		For testing purpose we are writing it in start class in future we are writing in service layer
		PlayerRepository playerRepository = context.getBean(PlayerRepository.class);
		
//		System.out.println(playerRepository.getClass().getName()); //jdk.proxy2.$Proxy87
		
		Player p1 = new Player();
		p1.setPlayerId(102);
		p1.setPlayerName("Sehwag");
		p1.setPlayerAge(46);
		p1.setLocation("Delhi");
		
		
		playerRepository.save(p1); //upsert method, save() = insert() & update()
		
		System.out.println("Record Inserted......");
	}

}
