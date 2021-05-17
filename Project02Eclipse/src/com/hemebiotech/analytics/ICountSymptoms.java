package com.hemebiotech.analytics;

import java.util.Map;
/**
 * 
 * The important part is, the return value from the operation, which is a map of Symptom's and Symptom's Occurrences.
 * 
 * The implementation must count Symptom's Occurrences.
 * 
 * 
 *
 * 
 * 
 */
public interface ICountSymptoms {
/**
 * 
 * @return a map which is contained Symptoms and Symptom's Occurrences.
 */
	public Map<String, Long> CountSymptoms();
	
}
