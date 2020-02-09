import java.util.Arrays;

class findMedian {

    public static void main(String[] args) {

        int[] nums = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        System.out.println(FindMedian(nums));

    }

    static int FindMedian(int[] a) {

        Arrays.sort(a);

        return (a[a.length / 2]);
    }

}