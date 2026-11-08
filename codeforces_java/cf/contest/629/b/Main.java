import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(t[2 + 3 * i])).toArray() instanceof int[] lo
            && IntStream.range(0, n).map(i -> Integer.parseInt(t[3 + 3 * i])).toArray() instanceof int[] hi
            ? IntStream.rangeClosed(1, 366).map(d -> 2 * (int) Math.min(
                IntStream.range(0, n).filter(i -> t[1 + 3 * i].charAt(0) == 'M' && lo[i] <= d && d <= hi[i]).count(),
                IntStream.range(0, n).filter(i -> t[1 + 3 * i].charAt(0) == 'F' && lo[i] <= d && d <= hi[i]).count())).max().getAsInt() : 0);
    }
}
