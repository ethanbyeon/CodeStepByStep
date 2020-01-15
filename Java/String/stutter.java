package Java.String;

class stutter {

    public static void main(String[] args) {
        System.out.println(stut("hello"));
    }

    static String stut(String s) {
        String r = "";

        for(int i = 0; i < s.length(); i++){
            r += "" + s.charAt(i) + s.charAt(i);
        }

        return r;
    }

}