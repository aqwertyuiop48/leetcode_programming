import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long hl && Long.valueOf(s.nextLong()) instanceof Long hr && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new Object[]{s.nextLong(), s.next().charAt(0), s.nextLong(), s.nextLong()}).toList() instanceof List<Object[]> mir
            && Long.valueOf(100) instanceof Long H && Long.valueOf(100000) instanceof Long W
            ? Math.max(hl.equals(hr) ? 0 : 0, IntStream.of(0, 1).boxed().flatMap(dir -> IntStream.rangeClosed(1, n + 1).mapToObj(j -> Long.valueOf(dir == 0 ? hl : H - hl) instanceof Long h0 && Long.valueOf(dir == 0 ? hr : H - hr) instanceof Long h1
                && Long.valueOf(j * H + (j % 2 == 0 ? h1 : H - h1) - h0) instanceof Long delta
                && IntStream.rangeClosed(1, j).mapToObj(i -> IntStream.range(0, n).filter(k -> (Character) mir.get(k)[1] == (((i % 2 == 1) == (dir == 0)) ? 'T' : 'F')
                        && (Long) mir.get(k)[2] * delta <= W * (i * H - h0) && W * (i * H - h0) <= (Long) mir.get(k)[3] * delta).findFirst().orElse(-1)).toList() instanceof List<Integer> hits
                    ? hits.stream().anyMatch(x -> x < 0) || hits.stream().distinct().count() != hits.size() ? 0L : hits.stream().mapToLong(k -> (Long) mir.get(k)[0]).sum() : 0L)).mapToLong(Long::longValue).max().orElse(0)) : "");
    }
}
