package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;





/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {


	private String filepath;

	

		

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
		}
	
	@Override
	public ArrayList<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
					
				}
				reader.close();
			}
			
			catch (IOException e) {
				e.printStackTrace();	
			}
	}
		
		return result;
	}
	


	@Override
	public  Map<String, Long> CountSymptomsOccurences() {
		
		Map<String,Long> countSymptomsOccurences=
			
		
	GetSymptoms().stream().collect(Collectors.groupingByConcurrent(e->e, Collectors.counting()));
		

		

	return countSymptomsOccurences;
	


	
	}

	@Override
	public TreeMap<String, Long> NaturalOrder() {
	
		TreeMap<String, Long > naturalOrder = new TreeMap<String, Long>(CountSymptomsOccurences());
		
		return naturalOrder;
	}


}


		
		
			
	



		
	

	


	