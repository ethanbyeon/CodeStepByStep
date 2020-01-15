package Java.String;

class switchPairs {

    public static void main(String[] args) {
        System.out.println(pair("example"));
    }

    static String pair(String s) {
       
        String r = "";

        for(int i = 0; i < s.length()- 1; i+=2){
            r += "" + s.charAt(i + 1) + s.charAt(i); 
        }

        if(s.length() % 2 != 0) r += s.substring(s.length() - 1);

        return r;
    }

}