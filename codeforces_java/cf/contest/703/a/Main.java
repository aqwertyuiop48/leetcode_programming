import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(IntStream.range(0, n).map(i -> Integer.compare(sc.nextInt(), sc.nextInt())).sum()) instanceof Integer z
            ? (z > 0 ? "Mishka" : z < 0 ? "Chris" : "Friendship is magic!^^") : "");
    }
}
