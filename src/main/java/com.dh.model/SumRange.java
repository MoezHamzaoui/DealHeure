package com.dh.model;



class SumRange {


    static int sumRange(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            int n = ints[i];
            if (n >= 10 && n <= 100) sum += n;
        }
        return sum;
    }
}

