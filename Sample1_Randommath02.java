package sample1;
import java.util.Random;
    public class Sample1_Randommath02 {
      public static void main(String[] args) {
        Random rnd = new Random();
        for ( int i = 0; i < 10; i++ ) {
          int r = rnd.nextInt(100) + 1;
          System.out.print(r + " ");
        }
        System.out.println();
    }
}
