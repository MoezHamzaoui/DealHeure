package com.dh.model;

public class PiApproximation {
    public static double approx(double[][] pts) {
        int insideCircle = 0;
        int totalPoints = pts.length;

        for (double[] point : pts) {
            double x = point[0];
            double y = point[1];

            if (x * x + y * y <= 1) {
                insideCircle++;
            }
        }

        return 4.0 * insideCircle / totalPoints;
    }

    static double approxPi(double[][] pts) {
        int count = 0;
        for (int i = 0; i < pts.length; i++) {
            if (Math.pow(pts[i][0], 2) + Math.pow(pts[i][1], 2) <= 1) {
                count++;
            }
        }
        return 4.0 * count / pts.length;
    }




    public static void main(String[] args) {
        double[][] points = {
                {0.1, 0.2}, {0.4, 0.5}, {0.7, 0.8}, {0.9, 0.6}, {0.3, 0.3}, {0.5, 0.5}, {0.8, 0.2}
        };

        System.out.println("Approximated Pi: " + approx(points));
        System.out.println("Approximated Pi2: " + approxPi(points));
    }
}
