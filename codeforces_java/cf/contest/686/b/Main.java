import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && new int[n] instanceof int[] a && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, n).filter(i -> (a[i] = Integer.parseInt(t[i + 1])) < 0).count() == 0
            && IntStream.range(0, n).flatMap(i -> IntStream.range(0, n - 1 - i)).filter(j -> a[j] > a[j + 1])
                .filter(j -> (a[j + 1] = a[j] + 0 * (a[j] = a[j + 1]) + 0 * sb.append(j + 1).append(' ').append(j + 2).append('\n').length()) < 0).count() == 0
            ? sb : "");
    }
}
