import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? Stream.concat(Stream.of(n), IntStream.range(1, n).boxed()).map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}

