import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Long n
            ? Stream.iterate(new long[]{1, 2}, t -> new long[]{t[1], t[0] + t[1]}).takeWhile(t -> t[0] <= n).count() - 1 : "");
    }
}
