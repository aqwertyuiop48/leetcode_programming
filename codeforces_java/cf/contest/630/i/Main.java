public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Long n ? (24 + 9 * (n - 3)) * (1L << (2 * (n - 3))) : 0);
    }
}
