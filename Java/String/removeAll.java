package Java.String;

class removeAll {

    public static void main(String[] args) {
        System.out.println(rall("Summer is here!", 'e'));
    }

    static String rall(String s, char c) {

        String r = "";

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != c){
                r += "" + s.charAt(i);
            }
        }

        return r;
    }

}