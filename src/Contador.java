//1)
public class Contador {
        int contador = 0;


    public synchronized void incrementar() {
            contador ++;
            notify ();
        }

        public synchronized void decrementar(){
            while ( contador == 0) {
                try {
                    wait();
                } catch(InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            contador --;
        }
    }

