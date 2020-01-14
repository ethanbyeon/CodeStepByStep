package Java.String;
import java.util.Scanner;

class NameGame {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String s = in.nextLine();
        
        ng(s);

        in.close();

    }

    static void ng(String s) {

        String[] split = s.split(" ");
        String first = split[0];
        String last = split[1];

        System.out.println(first + ", " + first + ", bo-" + first.substring(1));
        System.out.println("Banana-fana fo-F" + first.substring(1));
        System.out.println("Fee-fi-mo-M" + first.substring(1));
        System.out.println(first.toUpperCase() + "!");
        System.out.println("");
        System.out.println(last + ", " + last + ", bo-B" + last.substring(1));
        System.out.println("Banana-fana fo-F" + last.substring(1));
        System.out.println("Fee-fi-mo-M" + last.substring(1));
        System.out.print(last.toUpperCase() + "!");

    }

}