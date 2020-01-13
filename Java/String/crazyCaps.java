package Java.String;

class crazyCaps {

    public static void main(String[] args) {
        System.out.println(ccaps("Hey!! THERE!"));
    }

    static String ccaps(String s) {
        String r = "";

        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0) r += "" + Character.toLowerCase(s.charAt(i));
            else r += "" + Character.toUpperCase(s.charAt(i));
        }

        return r;
    }

}