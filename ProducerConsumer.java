import java.util.LinkedList;
public class ProducerConsumer {
LinkedList<Integer> list = new LinkedList<>();
int capacity = 2; // assume the capacity is 2.
synchronized void produce() throws InterruptedException {
int value = 1;
while (true) {
// producer thread waits while list is full
while (list.size() == capacity) {
wait();
}
// producing a value...
System.out.println("Value produced --> " + value);
list.add(value++);
// notifies that values are produced and ready to consume
notify();
Thread.sleep(3000);
}
}
synchronized void consume() throws InterruptedException {
while (true) {
// waits till the list is empty
while (list.size() == 0) {
wait();
}
// to retrieve the first job in the list
int val = list.removeFirst();
System.out.println("Value consumed -->" + val);
// notifies producer thread
notify();
Thread.sleep(3000);
}
}
}
