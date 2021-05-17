package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;




public class MainApp {


	public static void main(String[] args)throws IOException {
		
		ISymptomReader symptoms = new ReadSymptomDataFromFile("symptoms.txt"); /* Instantiate new object from "symptoms.txt" */
		
		AnalyticsCounter counter = new AnalyticsCounter(symptoms); /* Instantiate AnalyticsCounter*/ 
	
		counter.CountSymptoms(); /* CountSymptoms method's injected which count occurrences and return à Map<String,Long> */

		TreeMap<String, Long > naturalOrder = new TreeMap<String, Long>(counter.CountSymptoms()); /* instantiate TreeMap naturalOrder from Map<String,Long> (counter) to order alphabetically */
		
		ISymptomWriter writer = new WriteDataFromFile(naturalOrder); /* instantiate writer from TreeMap */ 
		writer.Writer(); /* write symptoms and their occurrences in a file name result.out */
		
		
		
	
	
	
	}	
}

	