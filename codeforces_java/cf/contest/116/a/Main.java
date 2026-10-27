import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(new int[]{0, 0}).ifPresent(st ->
                System.out.println(IntStream.range(0, s.nextInt())
                    .map(i -> (st[0] += -s.nextInt() + s.nextInt()) > 0 ? st[0] : 0)
                    .max().getAsInt())));
    }
}

