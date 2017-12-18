package io.zipcode.loganhanner.messageservicev2;

import io.zipcode.loganhanner.messageservicev2.repositories.MessageRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MessageServiceV2Application {

	public static void main(String[] args) {
		SpringApplication.run(MessageServiceV2Application.class, args);
	}
}
