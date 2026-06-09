import java.util.Scanner;
public class Program16_Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Maximum handshakes = " + (n * (n - 1) / 2));
    }
}