
class maxValue {
    
    public static void main(String[] args) {

        int[] nums = {17, 7, -1, 26, 3, 9};
        System.out.println(MaxValue(nums));

    }

    static int MaxValue(int[] data) {
        
        int max = data[0];
        
        for(int i = 1; i < data.length; i++) {
            if(max < data[i]) max = data[i];
        }

        return max;
    }

}