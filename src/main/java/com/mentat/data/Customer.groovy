package com.mentat.data

import groovy.transform.ToString
import groovy.transform.TupleConstructor

import org.springframework.data.annotation.Id
/**
 * Created by dshue1 on 6/19/16.
 */
@TupleConstructor(excludes = ['id'])
@ToString(includeNames = true)
class Customer {
	@Id
	private String id

	String firstName
	String lastName

	List<String> kids

	String getId() {id}
}
