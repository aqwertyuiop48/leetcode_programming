public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().chars()
            .mapToLong(c -> (int) Math.pow(3, 6 - Integer.bitCount(c <= '9' && c >= '0' ? c - 48 : c >= 'A' && c <= 'Z' ? c - 55 : c >= 'a' && c <= 'z' ? c - 61 : c == '-' ? 62 : 63)))
            .reduce(1L, (x, y) -> x * y % 1000000007L));
    }
}
