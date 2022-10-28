import java.util.ArrayList;

public class FifoBuffer {

    public FifoBuffer(){

        }

        private int capacity=10;
        public ArrayList<Integer> list = new ArrayList<Integer>(capacity);
        public synchronized void push ( Integer o) throws InterruptedException {
            while ( list.size() == capacity) {
                wait();}
            list.add(o);
            notify();
        }

        public synchronized Integer pop () throws InterruptedException {
            while ( list.isEmpty()) {
                wait (); }

            int res = list.get(0);
            list.remove(0);


            return res;
        }

    }

