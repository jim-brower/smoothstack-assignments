import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

// To be honest I had no idea how to unit test this if its even possible.
// I used a concurrency safe data type called LinkedBlockingQueue instead of `synchronized`

class ProducerConsumerProblem {
    static final int BUFLEN = 7;

    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> buffer = new LinkedBlockingQueue<>(BUFLEN);

        Runnable producer = () -> {
            try {
                for (Integer i = 0; i < 100; ++i) {
                        while (!buffer.offer(i, 10, TimeUnit.MILLISECONDS));
                        System.out.println(buffer.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Runnable consumer = () -> {
            try {
                for (int i = 0; i < 100; ++i) {
                        while (null == buffer.poll(10, TimeUnit.MILLISECONDS)) ;
                        System.out.println(buffer.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
