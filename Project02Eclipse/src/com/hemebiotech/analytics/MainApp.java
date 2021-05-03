package com.hemebiotech.analytics;



public class MainApp {
	
	public static void main(String[]arg) {
	
		 ReadSymptomDataFromFile SymptomsList = new ReadSymptomDataFromFile("symptoms.txt");
		 
		 
		System.out.println(SymptomsList.NaturalOrder());
		
	
}
}