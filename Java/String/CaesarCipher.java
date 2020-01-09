package Java.String;
import java.util.*;


class CaesarCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Your message? ");
        String s = in.nextLine();
        System.out.print("Encoding key? ");
        int n = in.nextInt();

        System.out.println(decode(s,n));
        in.close();
    }

    static String decode(String x, int y) {
        String r = "";
        x = x.toUpperCase();
        for(int i = 0; i < x.length(); i++){
            int n = x.charAt(i) - 64;
            if(n >= 1 && n <= 26){
                n = n + y;
                if(n < 1){
                    n += 26;
                }else if(n > 26){
                    n -= 26;
                }
            }
            r += (char) (n + 64) + "";
        }
        return r;
    }
}