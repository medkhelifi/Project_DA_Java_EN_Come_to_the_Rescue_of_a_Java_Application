package com.hemebiotech.analytics;



import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AnalyticsCounter implements ICountSymptoms {
	
	ISymptomReader reader; 
	
	/** 
	 * @param ISymptomReader reader is an ID from ReadSymptomDataFromFile.
	 * 
	 * @return a map with symptoms from file and their occurrences. 
	 */
	
	public AnalyticsCounter(ISymptomReader reader) throws IOException {
		
		this.reader = reader;
		
	}
	

	public Map<String, Long> CountSymptoms() {
		
		Map<String,Long> countSymptomsOccurences =
		reader.GetSymptoms().stream().collect(Collectors.groupingByConcurrent(e->e, Collectors.counting()));
		return countSymptomsOccurences;
	
	
	}
}

	