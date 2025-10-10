
interface A {
    int age = 44;
    String area ="adatan";
    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println("this is show " + A.age);
    }

    public  void  config(){
        System.out.println("this is config " + A.area);
    }
}

enum Status {
    Running, Failed, Pending, Success
}

class HandleIncrement {
    private int count;
    public synchronized void increment(){
        count++;
    }


    public int getCount() {
        return count;
    }

}



public class Main {
    public static void main(String[] arg) throws InterruptedException {
//        A b = new B();
//
//        b.show();
//        b.config();
//
//        Status s = Status.Running;
//
//        switch (s) {
//            case Status.Running -> System.out.println("in progress");
//            case Status.Failed -> System.out.println("failed status");
//            case Status.Pending -> System.out.println("pending status");
//            default -> System.out.println("Successful");
//        }
//
//        Runnable first = () -> {
//            PrintString printer = new PrintString("h1");
//            printer.print();
//        };
//
//        Runnable second = () -> {
//            PrintString printer = new PrintString("hello");
//            printer.print(10, 5);
//        };
//
//        Thread firstThread = new Thread(first);
//        Thread secondThread = new Thread(second);
//
//        firstThread.start();
//        secondThread.start();


        HandleIncrement handleIncrement = new HandleIncrement();
        Runnable first = () -> {
           for(int i = 0 ; i < 10000; i++) {
               handleIncrement.increment();
           }
        };

        Runnable second = () -> {
            for(int i = 0 ; i < 10000; i++) {
                handleIncrement.increment();
            }
        };

        Thread firstThread = new Thread(first);
        Thread secondThread = new Thread(second);

        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();
        System.out.println(handleIncrement.getCount());

    }
}