package StringClassPackege;

import java.util.Locale;
import java.util.Scanner;

public class MyStringClass {
    public static String stringToUpCase(String Line){
        return Line.toUpperCase();
    }
    public static String stringToLowCase(String Line){

        return Line.toLowerCase();
    }
    public static int stringLen(String Line){
        return Line.length();
    }
    public static String stringUnion(String FirstLine, String SecondLine){
        return FirstLine + SecondLine;
    }
    public static void main(String[] args) { }
}
