package Repplitt;

import java.util.Scanner;

public class Replit01 {

    public static void main(String[] args) {
        String s = "";

        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                s = s + i + " ";
            }
        }
        System.out.println(s);

        String str = "accessories";
        String d = "";

        for (int i = 0; i < str.length(); i++) {
            String c = str.substring(i, i + 1);
            if (str.indexOf(c) != str.lastIndexOf(c)) {
                if (!d.contains(c)) {
                    d = d + c;
                }
            }

        }
        System.out.print(d);
        

        }
    }


