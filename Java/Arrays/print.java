
class print {
    
    public static void main(String[] args) {

        int[] nums = {32, 5, 27, -3, 2598};
        Print(nums);

    }

    static void Print(int[] data) {
        
        for(int i = 0; i < data.length; i++) {
            System.out.println("element [" + i + "] is " + data[i]);
        }

    }

}