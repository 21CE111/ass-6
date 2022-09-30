public class PR6_3 {
public static void main(String[] args) {
int var;
for (var = 1; var <= 10; var++) {
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
System.out.println(e.getMessage());
}
System.out.print(var + " ");
}
}
}

