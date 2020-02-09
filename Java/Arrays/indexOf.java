
class indexOf {

    public static void main(String[] args) {

        int[] nums = {42, 7, -9, 14, 8, 39, 42, 8, 19, 0};
        System.out.println(IndexOf(nums, 8));

    }

    static int IndexOf(int[] list, int target) {

        int index = -1;

        for(int i = 0; i < list.length; i++) {
            if(list[i] == target) {
                index = i;
                break;
            }
        }

        return index;
    }

}