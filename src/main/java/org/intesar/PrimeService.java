package org.intesar;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Arrays;

@ApplicationScoped
public class PrimeService {

    public String sieve(int nThElement) {
        if (2 > nThElement) {
            return "Invalid input; use 2 or greater";
        }
        StringBuilder resultBuilder = new StringBuilder();

        //Table to keep track of all non-prime numbers.
        boolean[] primeTable = new boolean[nThElement + 1];

        //Assigning default as prime to all elements
        Arrays.fill(primeTable, true);

        //Loop through the provided parameter, including
        for (int i = 2; i <= nThElement; i++) {
            //If found value marked, then this is prime. So
            if (primeTable[i]) {

                //set non-prime to multiples of that iteration
                for (int j = i * 2; j <= nThElement; j += i)
                    primeTable[j] = false;

                //Add the iteration to result-set
                resultBuilder.append(i).append(" ");
            }
        }
        return resultBuilder.toString().trim();
    }
}
