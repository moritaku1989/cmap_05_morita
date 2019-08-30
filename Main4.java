package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String hello;
        hello = "私はカレーが好きだ";
        System.out.println(hello);

        String[] greetings;
        greetings = new String[4];
        greetings[0] = "1: あてはまらない";
        greetings[1] = "2: あまりあてはまらない";
        greetings[2] = "3: まあまああてはまる";
        greetings[3] = "4: あてはまる";

//        System.out.print(greetings[0]);
//        System.out.print(greetings[1]);
//        System.out.print(greetings[2]);
//        System.out.print(greetings[3]);
        for (int i = 0; i < greetings.length; i++) {
//            System.out.print(greetings[0]);
//            System.out.printf(greetings[1]);
//            System.out.printf(greetings[2]);
//            System.out.printf(greetings[3]);
            System.out.printf(greetings[i]);

//            String hello1;
//            hello = "休日によくプログラミングをする";
//            System.out.print(hello);
//            System.out.println(input);
//
        }
        Scanner scanner = new Scanner((System.in));
        String input = scanner.next();

        String hello1;
        hello1 = "休日によくプログラミングをする";
        System.out.println(hello1);

        String[] greetings2;
        greetings2 = new String[4];
        greetings2[0] = "1: あてはまらない";
        greetings2[1] = "2: あまりあてはまらない";
        greetings2[2] = "3: まあまああてはまる";
        greetings2[3] = "4: あてはまる";

        for (int i = 0; i < greetings2.length; i++) {
            System.out.printf(greetings2[i]);
        }
        Scanner scanner2 = new Scanner((System.in));
        String input2 = scanner.next();

        String hello2;
        hello2 = "キーボードをついついシンセサイザーと呼んでしまう";
        System.out.println(hello2);

        String[] greetings3;
        greetings3 = new String[4];
        greetings3[0] = "1: あてはまらない";
        greetings3[1] = "2: あまりあてはまらない";
        greetings3[2] = "3: まあまああてはまる";
        greetings3[3] = "4: あてはまる";

        for (int i = 0; i < greetings3.length; i++) {
            System.out.printf(greetings3[i]);
        }
        Scanner scanner3 = new Scanner((System.in));
        String input3 = scanner.next();

        String hello3;
        hello3 = "8時間以上睡眠しないと駄目だ";
        System.out.println(hello3);

        String[] greetings4;
        greetings4 = new String[4];
        greetings4[0] = "1: あてはまらない";
        greetings4[1] = "2: あまりあてはまらない";
        greetings4[2] = "3: まあまああてはまる";
        greetings4[3] = "4: あてはまる";

        for (int i = 0; i < greetings4.length; i++) {
            System.out.printf(greetings4[i]);
        }
        Scanner scanner4 = new Scanner((System.in));
        String input4 = scanner.next();

        String hello4;
        hello4 = "ついついゲームと本を買って積んでしまう";
        System.out.println(hello4);

        String[] greetings5;
        greetings5 = new String[4];
        greetings5[0] = "1: あてはまらない";
        greetings5[1] = "2: あまりあてはまらない";
        greetings5[2] = "3: まあまああてはまる";
        greetings5[3] = "4: あてはまる";

        for (int i = 0; i < greetings5.length; i++) {
            System.out.printf(greetings5[i]);
        }
        Scanner scanner5 = new Scanner((System.in));
        String input5 = scanner.next();

        String hello5;
        hello5 = "診断結果";
        System.out.println(hello5);

        Random random = new Random();
        int n = random.nextInt(10);
        System.out.println(n);
    }
}


//        ↓≪参考1≫ランダムに数字を出力したりする方法
//        Random random = new Random();
//        int n = random.nextInt(10);
//        System.out.println(n);

//          ↓≪参考2≫直接、文字を入力(打ち込む方法)
//        Scanner scanner = new Scanner((System.in));
////        ‐‐‐‐‐‐‐‐‐ ‐‐‐‐‐‐‐‐‐ ‐‐‐‐‐‐‐‐‐ ‐‐‐‐‐‐‐‐‐
////////        String[] inputs = new String[5];
////////        for(int i = 0; i < 5; )
////         ‐‐‐‐‐‐‐‐‐ ‐‐‐‐‐‐‐‐‐ ‐‐‐‐‐‐‐‐‐ ‐‐‐‐‐‐‐‐‐
//        String input = scanner.next();
//        System.out.println(input);
//    }

