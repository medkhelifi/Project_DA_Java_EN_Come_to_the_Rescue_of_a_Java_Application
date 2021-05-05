package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;




public class WriterDataFromFile implements ISymptomWriter {

		
	
private Map<String, Long> mapName;
	
/** 
 * 
 * @param mapName a Map<String Long> with symptoms and symptoms's occurrences
 * 
 * 
 * */

	public WriterDataFromFile(Map<String, Long> mapName) {

	this.mapName= mapName ;

	}
	
	

	@Override
	public FileWriter Writer() throws IOException {
		
	
		
	  FileWriter result = new FileWriter("result.out");
		
		for (Entry<String, Long> entry : mapName.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue()); //*this statement prints out my keys and values */
		     result.write(entry.getKey() + " : " + entry.getValue()+ "\n"); //* this statement prints out my keys and values in the file */
		             
		 }

		result.close();
		
		return result;
		
		
	
		 
	}
	}



	










