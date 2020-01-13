package Java.String;

class convertToAltCaps {

    public static void main(String[] args) {
        System.out.println(ctoAlt("Summer is here!"));
    }

    static String ctoAlt(String x) {
        
        String r = "";
        x = x.toLowerCase();

        for(int i = 0; i < x.length(); i++){
            int n = x.charAt(i);

            if(i % 2 != 0) n -= 32;
            if(x.charAt(i) == ' ')  ;

            r += (char)(n) + "";            
        }

        return r;
    }

}