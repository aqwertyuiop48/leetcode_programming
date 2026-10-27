import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextLine()).ifPresent(s -> System.out.println(IntStream.range(0, s.length()).mapToObj(i -> String.valueOf(((i == 0 ? 0 : Integer.reverse(s.charAt(i - 1)) >>> 24) - (Integer.reverse(s.charAt(i)) >>> 24) + 256) % 256)).collect(Collectors.joining("\n"))));
    }
}

