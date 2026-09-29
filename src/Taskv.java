public class Taskv {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int f = (a - b + 1000) / 1000;

        System.out.println(a * f + b * (1 - f));
    }
}