package rekkei.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("nhập số bạn muốn tính: ");
        int num = sc.nextInt();
        if (num<=0){
            System.out.println("hãy nhập vào số nguyên dương");
        }else {
        int sum = 0;
            for (int i = 0; i <= num; i++) {
                if (i%2 ==0){
                    sum +=i;
                }
            }

        System.out.println("tổng các số chẵn từ 0 đến " + num + " là: " + sum );
    }
    }
}
