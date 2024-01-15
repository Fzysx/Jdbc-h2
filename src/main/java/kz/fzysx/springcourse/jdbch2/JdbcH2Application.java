package kz.fzysx.springcourse.jdbch2;

import kz.fzysx.springcourse.jdbch2.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.flywaydb.core.Flyway;
import java.util.Scanner;

@SpringBootApplication
@EnableJpaRepositories("kz.fzysx.springcourse.jdbch2")
@EntityScan
public class JdbcH2Application implements CommandLineRunner {

	CustomerRepository customerRepository;
	String exit = "";
	Scanner scaner = new Scanner(System.in);
	@Autowired
	public JdbcH2Application(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(JdbcH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		while(!exit.equals("exit")) {
			System.out.println(customerRepository.findByFirstName("Lus"));
			exit = scaner.nextLine();
		}
	}
}
