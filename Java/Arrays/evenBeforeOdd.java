
class evenBeforeOdd {

    public static void main(String[] args) {

        int[] nums = {5, 2, 4, 9, 3, 6, 2, 1, 11, 1, 10, 4, 7, 3};
        EvenBeforeOdd(nums);

        for(int i: nums) {
            System.out.println(i);
        }
    }

    static void EvenBeforeOdd(int[] a) {

        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] % 2 != 0 && a[i + 1] % 2 == 0) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                i = 0;
            }
        }

    }

}