public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && new long[]{-1000000000000000L, 1000000000000000L} instanceof long[] b
            && java.util.stream.IntStream.range(0, n).allMatch(i -> Integer.valueOf(t[1 + 2 * i]) instanceof Integer c
                && (t[2 + 2 * i].equals("1") ? (b[0] = Math.max(b[0], 1900)) >= 0 || true : (b[1] = Math.min(b[1], 1899)) >= 0 || true)
                && (b[0] += c) + (b[1] += c) != 0 | true)
            ? (b[0] > b[1] ? "Impossible" : b[1] > 100000000000000L ? "Infinity" : "" + b[1]) : "");
    }
}
