
class CollapsePairs {
    
    public static void main(String[] args) {

        int[] b = {7, 2, 8, 9, 4, 22, 7, 1, 9, 10};
        collapsePairs(b);

        for(int i: b){
            System.out.print(i + " ");
        }

    }

    static void collapsePairs(int[] a) {

        for(int i = 0; i < a.length - 1; i+=2) {
            int sum = a[i] + a[i + 1];
            if(sum % 2 != 0) {
                a[i + 1] = sum;
                a[i] = 0;
            }else {
                a[i] = sum;
                a[i + 1] = 0;
            }
        }

    }

}