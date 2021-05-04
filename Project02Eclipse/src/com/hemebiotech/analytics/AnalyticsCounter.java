package com.hemebiotech.analytics;





import java.io.IOException;
import java.util.Map;

import java.util.stream.Collectors;

public class AnalyticsCounter {

	
public static void main(String[] args) throws IOException  {
	
		ISymptomReader symptoms = new ReadSymptomDataFromFile("symptoms.txt");
		
		Map<String,Long> countSymptomsOccurences =
		symptoms.GetSymptoms().stream().collect(Collectors.groupingByConcurrent(e->e, Collectors.counting())); 
		
		
		ISymptomWriter result = new WriterDataFromFile(countSymptomsOccurences);
		result.Writer();
		
		
		
		
		
		
		
	
		

		
		
			
				
				

}




}
