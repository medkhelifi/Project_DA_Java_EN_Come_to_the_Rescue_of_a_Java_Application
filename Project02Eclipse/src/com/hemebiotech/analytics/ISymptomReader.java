package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;








/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications.
 * Count symptom's occurrences.
 * Order the list.
 * 
 *
 * @param 
 * 
 */
public interface ISymptomReader {
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */
	ArrayList<String> GetSymptoms ();
	
	/**@return a raw listing of all Symptoms obtained from a data source with symptom's occurrences */
	
	Map<String, Long> CountSymptomsOccurences ();
	
	/** @return a raw listing of all Symptoms obtained from a data source order by alphabetical order */
	
	TreeMap<String,Long> NaturalOrder();
	
	

	
	
	}