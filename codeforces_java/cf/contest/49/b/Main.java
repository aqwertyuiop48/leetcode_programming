import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new String[]{s.next(), s.next()}).ifPresent(ab ->
            Optional.of(Math.max(2, Stream.of(ab).flatMapToInt(String::chars).max().getAsInt() - '0' + 1)).ifPresent(p ->
                System.out.println(Integer.toString(Integer.parseInt(ab[0], p) + Integer.parseInt(ab[1], p), p).length()))));
    }
}


