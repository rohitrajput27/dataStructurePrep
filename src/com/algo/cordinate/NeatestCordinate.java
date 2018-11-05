package com.algo.cordinate;

public class NeatestCordinate {

    public static void main(String[] args) {
        int origin[] = {0, 0};
        int[][] cordinates = {{10, 2}, {3, 1}, {4, 1}, {1, 1}};
        int lenght = -1;
        int index = -1;
        int firstCo = 0;
        int secondCo = 0;
        for (int i = 0; i < cordinates.length; i++) {
            firstCo = cordinates[i][0] - origin[0];
            secondCo = cordinates[i][1] - origin[1];
            if (lenght == -1) {
                index = i;
                lenght = (firstCo * firstCo) + (secondCo * secondCo);
            } else {
                if (lenght > ((firstCo * firstCo) + (secondCo * secondCo))) {
                    lenght = (firstCo * firstCo) + (secondCo * secondCo);
                    index = i;
                }
            }

        }

        System.out.println(cordinates[index][0] + "," + cordinates[index][1]);
        System.out.println(Math.sqrt(lenght));

    }

}
