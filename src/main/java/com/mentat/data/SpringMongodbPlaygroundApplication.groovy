package com.mentat.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class SpringMongodbPlaygroundApplication implements CommandLineRunner {
	@Autowired
	private CustomerRepository repository

	@Override
	void run(String... args){
		this.repository.deleteAll()

		// save a couple of customers
		this.repository.save(new Customer("Alice", "Smith", ['brandon', 'sophia']));
		this.repository.save(new Customer("Bob", "Smith", ['ella', 'betty']));

		// fetch all customers
		println "Customers found with findAll():"
		println "-------------------------------"
		for (Customer customer : this.repository.findAll()) {
			System.out.println(customer);
		}
		println ''

		// fetch an individual customer
		println "Customer found with findByFirstName('Alice'):"
		println "--------------------------------"
		println this.repository.findByFirstName("Alice")

		println "Customers found with findByLastName('Smith'):"
		println "--------------------------------"
		for (Customer customer : this.repository.findByLastName("Smith")) {
			println customer
		}
	}

	static void main(String[] args) {
		SpringApplication.run(SpringMongodbPlaygroundApplication.class, args)
	}
}
