package Java.String;

class printBackward {

    public static void main(String[] args) {
        System.out.println(back("hello there!"));
    }

    static String back(String s) {
        
        String r = "";

        for(int i = s.length() - 1; i >= 0; i--){
            r += "" + s.charAt(i);
        }

        return r;
    }

}