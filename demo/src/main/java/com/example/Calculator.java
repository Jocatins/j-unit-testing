package com.example;

public class Calculator {

    public int compare(int a, int b) {
        if (a > b)
            return 1;
        return -1;
    }

    public int compare1(int a, int b) {
        if (a > b)
            return 1;
        else if (a < b)
            return -1;
        return 0;
    }

    public int compare2(int a, int b) {
        if (a == b)
            return 1;
        else
            return -1;

    }

    public void sortArray(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }

        }
    }
}