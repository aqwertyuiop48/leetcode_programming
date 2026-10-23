import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && (Integer) sc.nextInt() instanceof Integer n
            && LongStream.generate(() -> sc.nextLong() * 1073741824L + sc.nextLong()).limit(n).sorted().toArray() instanceof long[] p
            ? Arrays.stream(p).reduce(0L, (cur, key) -> (key & 1073741823L) >= cur ? (key & 1073741823L) : (key >> 30)) : 0);
    }
}
