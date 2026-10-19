import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            ? IntStream.range(0, 8).mapToObj(i -> s.next()).allMatch(r -> r.equals("WBWBWBWB") || r.equals("BWBWBWBW")) ? "YES" : "NO" : "");
    }
}
