import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Integer.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Integer n && Integer.valueOf(n / 2) instanceof Integer c && new int[]{-1, 0} instanceof int[] k
            ? IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).mapToObj(j -> String.valueOf(Math.abs(i - c) + Math.abs(j - c) <= c ? (k[0] += 2) : (k[1] += 2))).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
