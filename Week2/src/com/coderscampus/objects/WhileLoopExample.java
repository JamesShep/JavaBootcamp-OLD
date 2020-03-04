package com.coderscampus.objects;

import java.util.Date;

public class WhileLoopExample {

    void whileLoopExample1 () {

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i = i + 1;
        }

        System.out.println("Done!");
    }

    void whileLoopExample2 () {

        Date now = new Date();
        Date stopNow = new Date(120, 2, 4, 21, 20, 0);
        System.out.println(now);
        System.out.println(stopNow);

        int i = 0;
        while (now.before((stopNow))) {
            i = i + 1;
            System.out.println(i + ": " + now);
            now = new Date();
        }
    }
}
