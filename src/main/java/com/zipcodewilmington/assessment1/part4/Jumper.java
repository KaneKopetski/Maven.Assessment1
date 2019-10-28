package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        Integer jumpCount = 0;
        for (int i = 1; i <= k; i+=j) {
          jumpCount++;
        }
        return jumpCount;
    }
}
