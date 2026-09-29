public class Tasku {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println((n % m) * (m % n) + 1);
    }
}