package com.fairRations.tdd;

public class Main {
    public static void main(String[] args) {
        FairRation ration = new FairRation();

        int[] distribution = {1, 2, 3, 4, 5, 6, 7};
        int people = 7;
        String result = ration.generate(distribution, people);

        /** Check if the array was incremented is correct**/
        for (int i = 0; i < distribution.length; i++) {
            System.out.print(distribution[i]);
        }

        /** Check if the output is correct**/
        System.out.println();
        System.out.println("===================");
        System.out.println("Output:" +result);
        System.out.println("===================");
    }
}
