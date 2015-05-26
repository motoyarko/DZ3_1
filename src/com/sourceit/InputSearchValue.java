package com.sourceit;

import java.util.Scanner;

/**
 * Created by motoyarko on 25-May-15.
 */
public class InputSearchValue {

    public long InputValueForSearch() {


        System.out.println("Please enter value for search");

        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();

        return input;
    }


}
