import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            ? IntStream.range(0, n * m).filter(i -> (s.nextInt() | s.nextInt()) > 0).count() : 0);
    }
}
