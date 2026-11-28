package OOP.MultiThreading;
class Clory extends Thread{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("DIDI BUG");
        }
    }
}
class Raj extends Thread{
    public void run(){
        for (int j = 0; j < 100; j++){
            System.out.println("Raj is a good brother tonight he will study OOP only. :)");
        }
    }
}
public class ThreadPractice {
    public static void main(String[] args){
        Clory elderBug = new Clory();
        Raj youngerBug = new Raj();

        elderBug.start();
        youngerBug.start();
    }
}
