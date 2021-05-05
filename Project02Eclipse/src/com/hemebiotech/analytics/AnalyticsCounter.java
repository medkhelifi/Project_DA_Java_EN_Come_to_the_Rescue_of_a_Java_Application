package com.hemebiotech.analytics;





import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AnalyticsCounter {

	
public static void main(String[] args) throws IOException  {
	
		/*Method read symptoms.txt */
		ISymptomReader symptoms = new ReadSymptomDataFromFile("symptoms.txt");
		
		/*Method Count Symptom's Occurrences */
		Map<String,Long> countSymptomsOccurences =
		symptoms.GetSymptoms().stream().collect(Collectors.groupingByConcurrent(e->e, Collectors.counting()));
		
		/*Method order the symptoms on alphabetical order */
		TreeMap<String, Long > naturalOrder = new TreeMap<String, Long>(countSymptomsOccurences);
		
		/* Method return a file result.out which is contain symptoms and numbers of symptom's occurrences */
		ISymptomWriter result = new WriterDataFromFile(naturalOrder);
		result.Writer(); 
}




}
