public class PrintOddEven {
    int counter = 1;

    public static void main(String[] args) {
        PrintOddEven printOddEven = new PrintOddEven();
        System.out.println("Printing numbers 1 to 10: ");
        new Thread(printOddEven::printEven).start();
        new Thread(printOddEven::printOdd).start();
    }

    public void printEven() {
        while (counter <= 10) {
            synchronized (this) {
                if (counter % 2 == 0) {
                    System.out.print(counter + ", ");
                    counter++;
                    notify();
                } else {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    public void printOdd() {
        while (counter <= 10) {
            synchronized (this) {
                if (counter % 2 != 0) {
                    System.out.print(counter + ", ");
                    counter++;
                    notify();
                } else {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
