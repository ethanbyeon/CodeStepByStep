
class contains {
    
    public static void main(String[] args) {

        int[] a1 = {1, 1, 2, 3, 4, 1, 2, 1, 8};
        int[] a2 = {1, 2, 3};
        System.out.println(contains(a1, a2));

    }

    static boolean contains(int[] a1, int[] a2) {

        for(int i = 0; i <= a1.length - a2.length; i++) {
            boolean bool = true;
            
            for(int j = 0; j < a2.length; j++) {
                if(a1[i + j] != a2[j]) {
                    bool = false;
                    break;
                }
            }
            
            if(bool) return true;
        }
        
        return false;
    }

}