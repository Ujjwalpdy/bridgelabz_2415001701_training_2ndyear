public class BackgroundJob {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Executing task step " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Task completed!");
        };

        Thread backgroundThread = new Thread(task);
        backgroundThread.start();
    }
}
