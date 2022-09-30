import java.util.Random;

public class PR6_2 {
public static void main(String[] args) {
int[] array = new int[15];
// random elements in array
for (int i = 0; i < 15; i++) {
array[i] = new Random().nextInt(100);
}

System.out.println("The array is : ");
for (int i = 0; i < 15; i++) {
System.out.print(array[i] + " ");
}

System.out.println("\n\nStarting thread...");
// thread for printing odd indexes of array
Thread thread1 = new Thread() {
public void run() {
for (int i = 1; i < 15; i = i + 2) {
System.out.println("Odd : " + array[i]);
}
}
};

// thread for printing even indexes of array
Thread thread2 = new Thread() {
public void run() {
for (int i = 0; i < 15; i = i + 2) {
System.out.println("Even : " + array[i]);
}
}
};

thread1.start();
thread2.start();
}
}

