public class Consumidor extends Thread{
    private FifoBuffer buffer ;
    public Consumidor ( FifoBuffer buffer ) {
        this.buffer = buffer ;
    }
    public void run () {
        try {
            while( true ) {
                int o = buffer.pop();
            }
        } catch(InterruptedException e ) {}
    }
}