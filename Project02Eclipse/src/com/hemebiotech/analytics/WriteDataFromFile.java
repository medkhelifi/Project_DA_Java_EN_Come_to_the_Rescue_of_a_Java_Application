package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;


/** 
 * WriteDataFromFile prints out keys and values in a file named result.out
 * 
 * @param mapName a Map<String Long> with symptoms and symptoms's occurrences
 * 
 * 
 * */
	

public class WriteDataFromFile implements ISymptomWriter {
	
private Map<String, Long> mapName ;
	


	public WriteDataFromFile(Map<String, Long> mapName) {

	this.mapName= mapName ;

	}
	
	

	@Override
	public FileWriter Writer() {
		
	  FileWriter result = null;
	try {
		result = new FileWriter("result.out"); //* this statement create a file result.out
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		
		for (Entry<String, Long> entry : mapName.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue()); //*this statement prints out my keys and values in the console*/
			
		     try {
				result.write(entry.getKey() + " : " + entry.getValue()+ "\n"); //* this statement prints out my keys and values in the file */
			} catch (IOException e) {
				
				e.printStackTrace();
			} 
		             
		 }

		try {
			result.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return result;
		
		
	
		 
	}



}



	