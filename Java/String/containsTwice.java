package Java.String;

class containsTwice {
    
    public static void main(String[] args) {
        System.out.print(ct("hello",'l'));
    }

    static boolean ct(String x, char y) {
        boolean bool = false;

        int count = 0;
        for(int i = 0; i < x.length(); i++){
            if(x.charAt(i) == y) count++;
        }

        if(count >= 2) bool = true;

        return bool;
    }

}