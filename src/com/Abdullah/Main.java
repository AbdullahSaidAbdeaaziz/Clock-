package com.Abdullah;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                long hour = 0, minutes = 0, seconds = 0;
                long count = 0;
                long i = 0, j = 0;
                while (true) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.printf("%70s\n", "YOUR OWN CLOCK");
                    seconds = count % 60;
                    if (count == 60) {
                        minutes = ++i % 60;
                        count = 0;
                        if (minutes == 59) {
                            hour = ++j % 12;
                        }
                    }

                    System.out.printf("%02d : %02d : %02d\n", hour, minutes, seconds);

                    count++;

                    try {
                        Thread.sleep(1000);
                    } catch (Exception ie){ ie.printStackTrace();}
                }
            }
        });
        th.run();

    }
}
