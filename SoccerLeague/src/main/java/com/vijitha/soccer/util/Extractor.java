package com.vijitha.soccer.util;

import java.util.List;

/**
 * Abstract extractor for extract type element {@link List} from a source.
 * 
 * @author Vijitha epa
 * 
 */
public interface Extractor<T> {

	/**
	 * Do the extract process.
	 * @return
	 */
	List<T> extract();
}
