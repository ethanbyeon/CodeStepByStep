package Java.String;

class reverseChuncks {

    public static void main(String[] args) {
        System.out.println(rchunks("MehranSahami", 3));
    }

    static String rchunks(String s, int n) {
        
        String r = "";

        if(s.length() == n) return s.substring(1) + s.charAt(0);
        else if(n == 1) return s;

        String temp = "";
        for(int i = 0; i <= s.length() - n; i+=n){
            temp = s.substring(i, n + i);
            for(int j = temp.length() - 1; j >= 0; j--){
                r += temp.charAt(j);
            }
        }

        return r;
    }

}