package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;



/**
 * This interface will write symptoms and numbers of symptom's occurrences
 * 
 * The important part is, the return value from the operation, which is a file result.out 
 * 
 * that may contain symptoms.
 * 
 */
public interface ISymptomWriter {
	
	/** 
	 * 
	 * @return a list of symptoms in the console AND a file result.out.
	 */
FileWriter Writer () throws IOException;

	



}