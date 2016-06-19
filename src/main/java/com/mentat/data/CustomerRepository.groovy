package com.mentat.data

import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Created by dshue1 on 6/19/16.
 */
interface CustomerRepository extends MongoRepository<Customer, String> {

	Customer findByFirstName(String firstName)

	List<Customer> findByLastName(String lastName)

}
