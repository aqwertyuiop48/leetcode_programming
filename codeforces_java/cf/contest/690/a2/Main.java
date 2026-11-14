public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Long n ? (n % 2 == 1 ? (n - 1) / 2 : (n - Long.highestOneBit(n)) / 2) : 0);
    }
}
