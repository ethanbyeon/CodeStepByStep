
class countDuplicates {

    public static void main(String[] args) {

        int[] a = {1, 4, 2, 4, 7, 1, 1, 9, 2, 3, 4, 1};
        CountDuplicates(a);

    }

    static int CountDuplicates(int[] list) {

        int dupes = 0;

        for(int i = 0; i < list.length; i++) {
            for(int j = i + 1; j < list.length; j++) {
                if(list[j] == list[i]) {
                    dupes++;
                    break;
                }
            }
        }

        return dupes;
    }

}