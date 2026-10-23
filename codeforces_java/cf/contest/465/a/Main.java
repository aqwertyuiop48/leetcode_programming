import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            ? Math.min(n, 1 + (int) IntStream.range(0, n).takeWhile(i -> t[1].charAt(i) == '1').count())
            : 0);
    }
}
