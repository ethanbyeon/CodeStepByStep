package Java.String;

class isPalindrome {

    public static void main(String[] args) {
        System.out.println(palin("racecar"));
    }

    static boolean palin(String s) {

        boolean bool = false;

        String r = "";
        for(int i = s.length() - 1; i >= 0; i--){
            r += s.charAt(i);
        }

        if(r.equalsIgnoreCase(s)) bool = true;

        return bool;
    }

}