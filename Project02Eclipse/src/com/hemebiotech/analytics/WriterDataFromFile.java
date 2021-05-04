package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;



public class WriterDataFromFile implements ISymptomWriter {

		
	
private Map<String, Long> fileName;
	
	public WriterDataFromFile(Map<String, Long> fileName) {

	this.fileName= fileName ;

	}
	
	

	@Override
	public FileWriter Writer() throws IOException {
		
	TreeMap<String, Long > naturalOrder = new TreeMap<String, Long>(fileName);
		
	  FileWriter result = new FileWriter("result.out");
		
		for (Entry<String, Long> entry : naturalOrder.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue()); //this statement prints out my keys and values
		     result.write(entry.getKey() + ":"+ "/n" + entry.getValue());
		             
		 }

		result.close();
		
		return result;
		
		
	
		 
	}
	}



	










