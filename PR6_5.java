public class PR6_5 {
public static void main(String[] args) throws InterruptedException
{
ProducerConsumer pc = new ProducerConsumer();
// Creating a producer thread
Thread pt = new Thread(new Runnable() {
@Override
public void run() {
try {
pc.produce();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
});
// Creating consumer thread
Thread ct = new Thread(new Runnable() {
@Override
public void run() {
try {
pc.consume();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
});
// Start both threads
pt.start();

ct.start();

// producer finishes before consumer pt.join();
ct.join();
}
}

