
class computeAverage {

    public static void main(String[] args) {

        int[] list = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        ComputeAverage(list);

    }

    static double ComputeAverage(int[] a) {
        
        double average = 0.0;

        for(int i = 0; i < a.length; i++) {
            average += a[i];
        }

        return (average / a.length);
    }

}