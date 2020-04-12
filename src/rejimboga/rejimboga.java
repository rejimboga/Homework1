package rejimboga;

import java.util.Scanner;

public class rejimboga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1, s2, s3;

        System.out.println("Перша сторона:");
        s1 = scanner.nextLine();

        System.out.println("Друга сторона:");
        s2 = scanner.nextLine();

        System.out.println("Третя сторона:");
        s3 = scanner.nextLine();

        System.out.println("Площа трикутника:");
        int a = 5;
        int b = 10;
        int c = 15;
        double d = (int) Math.sqrt((a + b + c) % 2);
        double e = (int) Math.sqrt(((a + b + c) % 2) - a);
        double f = (int) Math.sqrt(((a + b + c) % 2) - b);
        double g = (int) Math.sqrt(((a + b + c) % 2) - c);
        double k = (int) Math.sqrt(d * e * f * g);
        System.out.println(k);
    }

}














