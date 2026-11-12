public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Integer.toOctalString(new java.util.Scanner(System.in).nextInt()).chars().filter(c -> c == '1').count());
    }
}
