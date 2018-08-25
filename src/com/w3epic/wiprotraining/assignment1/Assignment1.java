/*
Develop a java class with a instance variable Country  HashSet (H1)  add a method 
saveCountryNames(String CountryName) , the method should add the passed country to 
a HashSet (H1) and return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet 
and returns the country if exist else return null. 

NOTE: You can test the methods using a main method.
 * */
package com.w3epic.wiprotraining.assignment1;

public class Assignment1 {

	public static void main(String[] args) {
		Country countries = new Country();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Pakistan");
		countries.saveCountryNames("Bangladesh");
		countries.saveCountryNames("China");

		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("Japan: " + countries.getCountry("Japan"));		
	}

}
