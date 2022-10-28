//2)
public class Sem {
    int permisos = 0;

    public synchronized void acquire() throws InterruptedException {
        while(permisos==0){
            wait();
        }
        permisos --;
    }

    public synchronized void release() {
        permisos ++;
        notifyAll();
    }
}
