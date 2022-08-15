package Nedelja2;

import java.util.Arrays;

public class Zadatak1 { public class Sortiranje {
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] niz = {3, 7, 1, 2, 8, 6};
        System.out.println(Arrays.toString(bubbleSort(niz)));

    }
}
}

