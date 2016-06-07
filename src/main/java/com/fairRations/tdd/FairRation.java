package com.fairRations.tdd;

public class FairRation {
    public String generate(int[] distribution, int breads) {

        String result = "";
        int breadsDistributed = 0;

        for (int next = 0; next < distribution.length - 1; next++) {

            if (isOdd(distribution[next])) {

                distribution[next] += 1;
                distribution[next + 1] += 1;

                breadsDistributed += 2;
                breads -= breadsDistributed;
            }
        }

        for (int i = 0; i < distribution.length; i++) {
            if (isEven(distribution[i])){
                result = String.valueOf(breadsDistributed);

            } else if (isOdd(distribution[i])){

                result = String.valueOf("NO");
            }
        }

        return result;
    }

    private boolean isEven(int i) {
        return i % 2 == 0;
    }

    private boolean isOdd(int i) {
        return i % 2 != 0;
    }
}
