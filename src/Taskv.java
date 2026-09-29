public class Taskv {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int k = ((a / b) + 1000) / 1000;

        System.out.println(a * k + b * (1 - k));
    }
}
