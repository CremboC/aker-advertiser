package uk.ac.sanger.mig.aker.advertiser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author pi1
 * @since February 2015
 */
@ComponentScan
@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
public class Advertiser {

	public static void main(String[] args) {
		SpringApplication.run(Advertiser.class, args);
	}

}