package Java.String;

class addCommas {

    public static void main(String args[]) {
        System.out.println(ac("12345678"));
    }

    static String ac(String x) {
        
        String n = x;
        String r = "";

        while(true){

            if(n.length() <= 3){
                r = n + r;
                break;
            }

            String temp = n.substring(n.length() - 3);
            r = "," + temp + r;
            n = n.substring(0, n.length() - 3);

        }

        return r;
    }
    
}