package Java.String;

import java.util.Scanner;

class startEndLetter {
    
    public static void main(String[] args) {
        end('s');
    }

    static void end(char c) {

        String r = "";

        System.out.println("Looking for two " + "\"" + c + "\"" + " words in a row.");

        int count = 0;
        Scanner in = new Scanner(System.in);
        while(count != 2){
            System.out.print("Type a word: ");
            String s = in.nextLine();
            r = s;

            if(s.substring(0,1).equalsIgnoreCase(s.substring(s.length() - 1)) && s.substring(0,1).equalsIgnoreCase("" + c)) count++;
            else count = 0;
        }
        in.close();

        System.out.println("\"" + c + "\"" + " is for " + "\"" + r + "\"");
    }

}