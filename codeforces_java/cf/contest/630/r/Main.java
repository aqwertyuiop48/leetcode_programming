public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Long n ? (n % 2 == 0 ? 2 : 1) : 0);
    }
}
