package Java.String;

class repeat {

    public static void main(String[] args) {
        System.out.println(rep("hello", 3));
    }

    static String rep(String s, int n) {

        String r = "";

        for(int i = 0; i < n; i++){
            r += s;
        }

        return r;
    }

}