class ArrayMax {
    public static void main(String[] args) {
        int[][] arr = {{8,0,5,3,4},{7,2,9,1,6}};
        int maxVal = arr[0][0];
        int maxI = 0;
        int maxJ = 0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j) {
                if (arr[i][j] > maxVal) {
                    maxVal = arr[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println("Max value of array is arr[" + maxI + "][" + maxJ + "]: " + arr[maxI][maxJ]);
    }
}