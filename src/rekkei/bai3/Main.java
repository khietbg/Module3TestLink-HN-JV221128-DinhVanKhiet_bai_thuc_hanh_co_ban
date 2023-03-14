package rekkei.bai3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double arr[] = new double[50];
        for (int i = 0; i < 50; i++) {
            arr[i] = Math.floor(Math.random() * 100);
        }
        System.out.println("mảng cần in la : " + Arrays.toString(arr));
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("min trong mảng la: " + min);
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max trong mảng la: " + max);
        Arrays.sort(arr);
        System.out.println("mang sau khi sap xem tang dan la: "+ Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i]%j == 0){
                    count ++;
                    break;
                }

            }


        }
        System.out.println("số lần xuất hiện số nguyên tố trong mảng là: " + (arr.length-count));
    }



}
