package com.algo.cordinate;

public class AreaOfIntersectingSquare {

    public static void main(String[] args) {
        int firstSquareCo[][] = {{1, 1}, {3, 3}};
        int secondSquareCo[][] = {{2, 2}, {4, 4}};

        int[] firstPoint = null;
        int[] secondPoint = null;

        if (secondSquareCo[0][0] >= firstSquareCo[0][0] && secondSquareCo[0][0] < firstSquareCo[1][0]) {
            int x1 = secondSquareCo[0][0];
//            if()
        } else {
            System.out.println("no area found");
        }

        if (firstPoint != null) {
            int x = firstSquareCo[1][0] < secondSquareCo[1][0] ? firstSquareCo[1][0] : secondSquareCo[1][0];
            int y = firstSquareCo[1][1] < secondSquareCo[1][1] ? firstSquareCo[1][1] : secondSquareCo[1][1];
//            secondPoint={x,y};
        }


    }
}
