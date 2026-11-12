import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && IntStream.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 4, 9, 25, 49).map(q -> System.out.append(q + "\n").checkError() ? 0 : sc.next().equals("yes") ? q : 0).toArray() instanceof int[] r
            ? (IntStream.range(15, 19).anyMatch(i -> r[i] > 0) || IntStream.range(0, 15).filter(i -> r[i] > 0).count() >= 2 ? "composite" : "prime") : "");
    }
}
