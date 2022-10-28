
import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws InterruptedException {
        FifoBuffer buffer = new FifoBuffer();
        Thread p = new Productor ( buffer );
        Thread c = new Consumidor ( buffer );
        p. start ();
        c. start ();
        Thread . sleep (1000);
        //System.out.println("paseporaca");
        p. interrupt ();
        c. interrupt ();
    }
}