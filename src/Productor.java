class Productor extends Thread {
    private FifoBuffer buffer ;
    public Productor ( FifoBuffer buffer ) {
        this . buffer = buffer ;
    }
    public void run () {
        try {
            int i = 0;
            while ( true ) {
                buffer . push (i);

                i ++;
            }
        } catch ( InterruptedException e ) {}
    }
}