package Java.String;

class reverseWordOrder {

    public static void main(String[] args) {
        System.out.println(rev("Hello what is your name?"));
    }

    static String rev(String s) {

        String r = "";

        if(s.length() == 0) return "";
        else if(s.indexOf(" ") < 0) return s;
        
        int index = 0;
        for(int i = s.length() - 1; i > 0; i--){
            if(s.charAt(i - 1) == ' '){
                r += s.substring(i, s.length() - r.length()) + " ";
                index = i;
            }
        }
        r += s.substring(0, index - 1);

        return r;
    }

}