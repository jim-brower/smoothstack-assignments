class QuestionOne {
    public static void main(String[] args) {

        // pattern 1
        System.out.println("1)");
        for (int i = 1; i < 5; ++i) {
            for (int j = i; j > 0; --j) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(".........");

        // pattern 2
        System.out.println("2)");
        System.out.println(".........");
        for (int i = 4; i >0; --i) {
            for (int j = i; j > 0; --j) {
                System.out.print("*");
            }
            System.out.println();
        }

        // pattern 3
        System.out.println("3)");
        for (int i = 1; i < 5; ++i) {
            System.out.print("  ");
            for (int j = i; j < 4; ++j) {
                System.out.print(" ");
            }
            for (int j = (i*2) - 1; j > 0; --j) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("...........");

        // pattern 4
        System.out.println("4)");
        System.out.println("...........");
        for (int i = 4; i > 0; --i) {
            System.out.print("  ");
            for (int j = i; j < 4; ++j) {
                System.out.print(" ");
            }
            for (int j = (i*2) - 1; j > 0; --j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}