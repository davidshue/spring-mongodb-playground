package com.mentat.data

import com.mongodb.Mongo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
/**
 * Created by dshue1 on 6/18/16.
 */
@Configuration
class AppConfig {

	@Bean
	Mongo mongo() throws UnknownHostException {
		new Mongo("localhost")
	}


	/*
	@Bean
	MongoClientFactoryBean mongo() {
		MongoClientFactoryBean mongo = new MongoClientFactoryBean();
		mongo.setHost("localhost");
		return mongo;
	}*/
}
