package com.sourceit;

/**
 * Created by motoyarko on 25-May-15.
 */
public class PrimeTest {

    public boolean PrimeTesting(long value) {

        if (value == 1) {
            return false;
        }

        for (long i = 2; i*i <= value; i++ ){
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
