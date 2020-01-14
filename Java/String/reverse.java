package Java.String;

class reverse {

    public static void main(String[] args) {
        System.out.println(rev("Pikachu"));
    }

    static String rev(String s) {

        String r = "";

        for(int i = s.length() - 1; i >= 0; i--){
            r += "" + s.charAt(i);
        }

        return r;
    }

}