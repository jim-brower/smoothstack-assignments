// To be honest I had no idea how to unit test this if its even possible.

class Deadlock {
    public static void main(String[] args) {
        final String[] a = {"a"};
        final String[] b = {"b"};

        Runnable t1 = () -> {
            try {
                synchronized (a[0]) {
                    System.out.println("t1 has a");
                    Thread.sleep(100);
                    synchronized (b[0]) {
                        System.out.println("t1 has b");
                        a[0] = "c";
                        b[0] = "d";
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Runnable t2 = () -> {
            try {
                synchronized (b[0]) {
                    System.out.println("t2 has b");
                    Thread.sleep(100);
                    synchronized (a[0]) {
                        System.out.println("t2 has a");
                        a[0] = "e";
                        b[0] = "f";
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        new Thread(t1).start();
        new Thread(t2).start();

        System.out.println("End of main");
        System.out.println("a = " + a[0] + "; b = " + b[0]);
    }
}