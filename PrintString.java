public class PrintString {

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