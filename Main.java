
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

public class Main {
    public static void main(String[] arg) {
       A b = new B();

       b.show();
       b.config();
    }
}