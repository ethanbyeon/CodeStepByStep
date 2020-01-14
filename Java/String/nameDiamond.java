package Java.String;

class nameDiamond {

    public static void main(String[] args) {
        System.out.println(diamond("MARTY"));
    }

    static String diamond(String s) {

        String r = "";

        for(int i = 0; i < s.length() + 1; i++){
            if(i == s.length()) r += s.substring(0, i);
            else r += s.substring(0, i) + "\n";
        }

        r += "\n";
        
        String space = " ";
        for(int i = 1; i < s.length() + 1; i++){
            if(i == s.length()) r += " " + s.substring(i, s.length());
            else r += space + s.substring(i, s.length()) + "\n";
            space += " ";
        }

        return r;
    }

}