import java.util.Scanner;
public class Program13_SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimeter = sc.nextDouble();
        System.out.println("The length of the side is " + (perimeter / 4) +
                " whose perimeter is " + perimeter);
    }
}