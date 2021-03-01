package StringClassPackege;

import java.util.Locale;
import java.util.Scanner;

public class MyStringClass {
    public static void StringToUpCase(String Line){
        System.out.println(Line.toUpperCase());
    }
    public static void StringToLowCase(String Line){
        System.out.println(Line.toLowerCase());
    }
    public static void StringLen(String Line){
        System.out.println("Длина введенной строки: " + Line.length());
    }
    public static void StringUnion(String FirstLine, String SecondLine){
        System.out.println(FirstLine + ' ' + SecondLine);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбирайте действие: ");
        System.out.println("1 - преобразование строки к верхнему регистру");
        System.out.println("2 - преобразование строки к нижнему регистру");
        System.out.println("3 - длина строки");
        System.out.println("4 - склеивание двух строк");
      int selection = sc.nextInt();
if(selection>0 && selection <5)
{
    String MyFirstLine;
    String SecondLine = " ";
    if(selection == 1 || selection ==2 || selection ==3)
    {
        System.out.println("Введите строку:");
        sc.nextLine(); // забираем смивол перехода на новую строку
        MyFirstLine = sc.nextLine();
    }
    else
    {
        System.out.println("Введите первую строку:");
        sc.nextLine(); // забираем смивол перехода на новую строку
        MyFirstLine = sc.nextLine();
        System.out.println("Введите вторую строку:");
        SecondLine = sc.nextLine();
    }
    switch(selection)
    {
        case 1:{
            StringToUpCase(MyFirstLine);
            break;
        }
        case 2:{
            StringToLowCase(MyFirstLine);
            break;
        }
        case 3:
        {
            StringLen(MyFirstLine);
            break;
        }
        case 4:
        {
            StringUnion(MyFirstLine, SecondLine);
            break;
        }
    }
}
else
{
    System.out.println("Повторите ввод!");
    selection = sc.nextInt();
}
sc.close();
    }
}
