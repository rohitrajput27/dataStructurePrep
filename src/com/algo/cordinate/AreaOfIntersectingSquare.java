package com.algo.cordinate;

public class AreaOfIntersectingSquare {

    public static void main(String[] args) {
        int firstSquareCo[][] = {{2, 2}, {4, 5}};
        int secondSquareCo[][] = {{3, 1}, {5, 3}};

        int[] firstPoint = null;
        int[] secondPoint = null;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;


        if (secondSquareCo[0][0] >= firstSquareCo[0][0] && secondSquareCo[0][0] < firstSquareCo[1][0]) {
            x1 = secondSquareCo[0][0];
            y1 = 0;
            if (secondSquareCo[0][1] < firstSquareCo[0][1]) {
                y1 = firstSquareCo[0][1];

            } else if (secondSquareCo[0][1] < firstSquareCo[1][1]) {
                y1 = secondSquareCo[0][1];
            } else {
                System.out.println("y is out of range");
            }
        } else {
            System.out.println("x is out of range");
        }


        x2 = firstSquareCo[1][0] < secondSquareCo[1][0] ? firstSquareCo[1][0] : secondSquareCo[1][0];
        y2 = firstSquareCo[1][1] < secondSquareCo[1][1] ? firstSquareCo[1][1] : secondSquareCo[1][1];
//            secondPoint={x,y};


        System.out.println("x1:" + x1 + "y1:" + y1);
        System.out.println("x2:" + x2 + "y2:" + y2);

    }
}
