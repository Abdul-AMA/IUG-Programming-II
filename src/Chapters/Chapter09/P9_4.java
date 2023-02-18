package Chapters.Chapter09;

import java.util.Random;

public class P9_4 {

    public static void main(String[] args) {

        Random random = new Random(1000);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(random.nextInt(100) + " ");

            }
            System.out.println();
        }

    }

}
