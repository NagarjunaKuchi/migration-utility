package io.mosip.idrepo;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import io.mosip.idrepo.service.MigrationService;



@SpringBootApplication
public class IdRepoApplication implements CommandLineRunner   {

	@Autowired
	MigrationService migrationService;
	
	Logger logger = org.slf4j.LoggerFactory.getLogger(IdRepoApplication.class);

	public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(IdRepoApplication.class, args);
        SpringApplication.exit(run);
    }
	
	@Override
	public void run(String... args) throws Exception {		
		migrationService.initialize();
	}
}
