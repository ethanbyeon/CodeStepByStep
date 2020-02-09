
class countUnique {
    
    public static void main(String[] args) {

        int[] a = {7, 3, 5, 6, 1, 2, 2, 7};
        System.out.println(CountUnique(a));

    }

    static int CountUnique(int[] a){

        int count = 1;

        if(a.length == 0) return 0;

        for(int i = 1; i < a.length; i++) { 
            int j = 0; 
            for(j = 0; j < i; j++) {
                if(a[i] == a[j]) break;
            } 
    
            if(i == j) count++; 
        } 

        return count;
    }

}