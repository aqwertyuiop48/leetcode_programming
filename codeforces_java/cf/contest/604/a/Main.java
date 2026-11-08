import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Stream.of(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            ? IntStream.range(0, 5).map(i -> Math.max(150 * (i + 1), 2 * (i + 1) * (250 - a[i]) - 50 * a[5 + i])).sum() + 100 * a[10] - 50 * a[11] : "");
    }
}
