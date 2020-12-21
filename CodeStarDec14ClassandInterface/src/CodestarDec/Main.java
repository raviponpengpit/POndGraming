package CodestarDec;

 public class Main {

     public static void main(String[] args) {
         Shower s = new Shower();
         s.start();
         for (int i = 0; i < 100; i++) {
             System.out.println("a");
         }
     }

 }

     class Shower extends Thread {
         public void run() {
             for (int i = 0; i <= 100; i++) {
                 System.out.println("b");
             }
         }
     }
