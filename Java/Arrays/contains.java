
class contains {
    
    public static void main(String[] args) {

        int[] a1 = {1, 1, 2, 3, 4, 1, 2, 1, 8};
        int[] a2 = {1, 2, 3};
        System.out.println(contains(a1, a2));

    }

    static boolean contains(int[] a1, int[] a2) {

        if(a1.length < a2.length) return false;

        int sec = 0;
        for(int i = 0; i < a1.length; i++) { 
            if(a1[i] == a2[sec]) {
                sec++;
                if (sec == a2.length) return true;
            }else {
                sec = 0;
                i--;
            }
        }

        return false;
    }

}