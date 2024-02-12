package rorsdev.ConsultorPia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ConsultorPiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsultorPiaApplication.class, args);
	}

}
