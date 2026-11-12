import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Long.valueOf(t[1]) instanceof Long k
            && Long.valueOf(LongStream.rangeClosed(1, Long.parseLong(t[0])).filter(i -> i * (i + 1) / 2 >= k).findFirst().getAsLong()) instanceof Long row
            ? t[(int) (2 + k - row * (row - 1) / 2 - 1)] : "");
    }
}
