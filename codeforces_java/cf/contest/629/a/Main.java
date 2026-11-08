import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t && Integer.valueOf(t[0]) instanceof Integer n
            ? IntStream.range(0, n).mapToLong(i -> t[i + 1].chars().filter(c -> c == 'C').count()).map(x -> x * (x - 1) / 2).sum()
                + IntStream.range(0, n).mapToLong(j -> IntStream.range(1, n + 1).filter(i -> t[i].charAt(j) == 'C').count()).map(x -> x * (x - 1) / 2).sum() : 0);
    }
}
