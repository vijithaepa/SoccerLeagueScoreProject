package com.vijitha.soccer.util;

/**
 * Builder for type entities and return a type entity after build method
 * executed.
 * 
 * @author vijitha.
 * 
 */
public interface EntityBuilder<T> {

	/**
	 * Build the entity and return.
	 * 
	 * @return
	 */
	T build();
}
