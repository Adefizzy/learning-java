
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

class PrintString {

    String input;
    public PrintString(String input){
        this.input = input;

    }

    public void print(){
        for (int i = 0;  i < 10; i++){
            System.out.println(this.input);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public  void print(int count, int sleep){
        for (int i = 0;  i < count; i++){
            System.out.println(this.input);
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] arg) {
       A b = new B();

       b.show();
       b.config();

        Status s = Status.Running;

        switch (s){
            case Status.Running -> System.out.println("in progress");
            case Status.Failed -> System.out.println("failed status");
            case Status.Pending -> System.out.println("pending status");
            default -> System.out.println("Successful");
        }

        Runnable first = () -> {
            PrintString printer = new PrintString("h1");
            printer.print();
        };

        Runnable second = () -> {
            PrintString printer = new PrintString("hello");
            printer.print(10, 5);
        };

        Thread firstThread = new Thread(first);
        Thread secondThread = new Thread(second);

        firstThread.start();
        secondThread.start();
    }
}