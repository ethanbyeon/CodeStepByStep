
class getPercentEven {

    public static void main(String[] args) {

        int[] nums = {6, 4, 9, 11, 5};
        System.out.println(GetPercentEven(nums));

    }

    static double GetPercentEven(int[] a) {

        double count = 0.0;

        if(a.length == 0) return count;

        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) count++;
        }

        return (count / a.length) * 100;
    }

}