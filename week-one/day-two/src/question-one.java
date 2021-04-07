class SumCLA {
    public static void main(String[] args) {
        int sum = 0;
        for(String str : args) {
            try {
                int num = Integer.parseInt(str);
                sum += num;
            } catch (NumberFormatException e) {
                // Ignore invalid command line arguments
            }
        }
        System.out.println("Sum of the arguments is " + sum + ".");
    }
}