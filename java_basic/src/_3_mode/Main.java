package _3_mode;

// 최빈수 출력

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] inputNum = new int[10];
        System.out.println("1~10까지의 숫자를 10번 입력하세요.");
        for (int i=0; i<10; i++) {
            inputNum[i] = scan.nextInt();
        }
        scan.close();
        System.out.println("그만!");

        int[] mode = new int[10];

        for (int i=0; i<10; i++) {
            mode[inputNum[i]-1]++;
        }


        for (int m : mode) {
            System.out.print(m + " ");
        }




    }
}