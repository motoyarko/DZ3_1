package com.sourceit;

public class Main {

    public static void main(String[] args) {
	// write your code here
         long constant;
         long variable;
        boolean rezult = false;
        long attempts = 0;


        InputSearchValue search = new InputSearchValue();
        constant = search.InputValueForSearch();

        InputSearchTry try1 = new InputSearchTry();
       /* variable = try1.InputSearch();*/

        Compare compare = new Compare();
        PrimeTest primetest = new PrimeTest();
       /* rezult = compare.CompareValue(constant, variable);*/

       // System.out.println(rezult);

       do {
            variable = try1.InputSearch();
            rezult = compare.CompareValue(constant, variable);
           attempts++;
           System.out.println("your value is Prime: " + primetest.PrimeTesting(variable));
           }
       while (!rezult);

        System.out.println("Congratulations. Your score: "+ attempts);













    }
}
