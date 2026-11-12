public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Integer.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Integer n
            ? (n / 7 * 2 + (n % 7 == 6 ? 1 : 0)) + " " + (n / 7 * 2 + Math.min(2, n % 7)) : "");
    }
}
