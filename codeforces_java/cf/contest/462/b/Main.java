import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && Integer.valueOf(Integer.parseInt(t[1])) instanceof Integer k
            && t[2].chars().boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting())).values().stream().mapToLong(x -> x).sorted().toArray() instanceof long[] cnt
            && new long[]{k} instanceof long[] left
            ? String.valueOf(IntStream.range(0, cnt.length).map(i -> cnt.length - 1 - i).mapToLong(i ->
                (Long) Math.min(left[0], cnt[i]) instanceof Long u && (left[0] -= u) >= 0 ? u * u : 0).sum())
            : "");
    }
}
