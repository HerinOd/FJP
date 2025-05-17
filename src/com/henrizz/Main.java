package com.henrizz;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        byte x = 18;
        short coordinate = (short)(x + 12);
        String searchFor = "Judo";
        String[][] infoNameKill = { { "Bluvia", "Macky", "Digger", "Maxine" }
                                     ,{ "68", "20", "48", "18" } };
        System.out.println(searchFor);
        System.out.println(coordinate);
        System.out.println(Arrays.deepToString(infoNameKill));

        }
}