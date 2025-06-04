import java.util.Scanner;

public class Main {
    public static void area(int width, int height, int length) {
        int surfaceArea = 2 * (width * height + width * length + height * length);
        System.out.println(surfaceArea);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int length = scanner.nextInt();
        area(width, height, length);

    }
}