package com.algo.maxlenghtin.array;

public class MaxLengthInArray {

    public static void main(String[] args) {
        int length = -1;
        int[] data = {13, 2, 3, 2, 1, 10, 12};
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {

                if (data[i] < data[j]) {
                    System.out.println("" + i + ":" + data[i] + "  " + j + ":" + data[j] + "  " + (j - i));
                    if (length < j - i) {
                        System.out.println("final : " + i + ":" + data[i] + "  " + j + ":" + data[j] + "  " + (j - i));
                        length = j - i;
                    }
                }
            }
        }
        System.out.println(length);
    }
    
}
