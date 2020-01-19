package Java.String;

class convertToAltCaps {

    public static void main(String[] args) {
        System.out.println(ctoAlt("Summer is here!"));
    }

    static String ctoAlt(String s) {

        String r = "";
        s = s.toLowerCase();

        if(s.length() == 0) return "";
        
        int cap = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                r += " ";
            }else if(cap == 0) {
                r += s.charAt(i);
                cap++;
            }else if(cap == 1){
                r += s.substring(i, i + 1).toUpperCase();
                cap--;
            }
        }

        return r;
    }

}