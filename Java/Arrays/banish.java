package Java.Arrays;

class banish {

    public static void main(String[] args) {

        int[] a1 = {42,3,9,42,42,0,42,9,42,42,17,8,2222,4,9,0,1};
        int[] a2 = {42,2222,9};

        poof(a1, a2);

        for(int count: a1){
            System.out.print(count + " ");
        }

    }

    static void poof(int[] a1, int[] a2){

        for(int i = 0; i < a1.length; i++) {
            for(int j = 0; j < a2.length; j++) {
                if(a1[i] == a2[j]) {
                    a1[i] = 0;
                }
            }
        }

        for(int i = 0; i < a1.length - 1; i++){
            if(i == 0) {
                a1[i] = a1[i + 1];
                a1[i + 1] = 0;
                a1[a1.length - 1] = 0;
            }else if(a1[i] == 0) {
                int temp = a1[i];
                a1[i] = a1[i + 1];
                a1[i + 1] = temp;
            }
        }
    }

}