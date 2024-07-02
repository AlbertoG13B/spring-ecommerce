package com.alberto.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*(exclude = DataSourceAutoConfiguration.class) para excluir la db cuando no se
 * tiene la info en el properties*/
@SpringBootApplication
public class SpringEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEcommerceApplication.class, args);
	}

}
