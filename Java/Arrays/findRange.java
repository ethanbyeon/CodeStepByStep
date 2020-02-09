import java.util.Arrays;

class findRange {

    public static void main(String[] args) {

        int[] nums = {7,4,2,6,8,1,3,9};
        System.out.println(FindRange(nums));

    }

    static int FindRange(int[] a) {
        
        int max = a[0];
        int min = a[0];

        for(int i = 1; i < a.length; i++) {
            if(max < a[i]) max = a[i];
            else if(min > a[i]) min = a[i];
        }

        return (max - min) + 1;
    }

}