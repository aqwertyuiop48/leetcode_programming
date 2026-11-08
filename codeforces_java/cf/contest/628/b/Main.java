import java.io.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).readLine().trim() instanceof String s
            ? IntStream.range(0, s.length()).mapToLong(i -> ((s.charAt(i) - 48) % 4 == 0 ? 1L : 0L) + (i >= 1 && (10 * (s.charAt(i - 1) - 48) + s.charAt(i) - 48) % 4 == 0 ? (long) i : 0L)).sum() : -1L);
    }
}
