package Java.String;

class isRotation {
    public static void main(String[] args) {
        System.out.println(rotate("abcde", "deabc"));
    }

    static boolean rotate(String x, String y) {
        
        boolean bool = false;

        if (x == null || y == null) return false;
        else if(x.length() != y.length()) bool = false;
        else {
            String cat = x + x;
            bool = cat.contains(y);
        }

        return bool;
    }
}