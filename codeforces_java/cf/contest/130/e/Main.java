import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextInt()).ifPresent(n -> System.out.print(Stream.iterate(new int[]{0, 1, 1}, t -> new int[]{t[1], t[2], (t[0] + t[1] + t[2]) % 26}).skip(n - 1).findFirst().get()[0]));
    }
}
