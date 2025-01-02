package study.Practice;

public class Quiz0102 {
    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddRunnable());
        Thread evenThread = new Thread(new EvenRunnable());

        oddThread.start();
        try {
            oddThread.join(); // 홀수 출력 스레드가 끝날 때까지 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        evenThread.start();
    }
}

class EvenRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(100); // 잠시 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(100); // 잠시 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
