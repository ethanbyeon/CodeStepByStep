package Java.String;

class reverseChuncks {

    public static void main(String[] args) {
        System.out.println(rchunks("Banana", 6));
    }

    static String rchunks(String s, int n) {
        
        String r = "";

        String temp = "";
        for(int i = 0; i < s.length() - n; i+=n){
            temp = s.substring(i, n + i);
            for(int j = temp.length() - 1; j >= 0; j--){
                r += temp.charAt(j);
            }
        }

        r += s.substring(s.length() - (s.length() % n));
        
        return r;
    }

}