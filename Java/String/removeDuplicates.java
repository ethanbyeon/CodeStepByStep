package Java.String;

class removeDuplicates {

    public static void main(String[] args) {
        System.out.println(rdupe("bookkeeeeeper"));
    }

    static String rdupe(String s) {

        String r = "";

        if(s.length() == 0) return "";

        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) != s.charAt(i + 1)){
                r += "" + s.charAt(i);
            }
        }
        r += s.charAt(s.length() - 1);

        return r;
    }

}