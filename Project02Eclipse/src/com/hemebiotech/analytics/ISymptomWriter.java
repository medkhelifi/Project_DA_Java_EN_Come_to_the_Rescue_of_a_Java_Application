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
	
	/** if no data return a empty console
	 * 
	 * @return a list of symptoms in the console AND a file result.out that may contain symptoms and result of previous methods
	 */
FileWriter Writer () throws IOException;



}