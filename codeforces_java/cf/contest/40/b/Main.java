import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new long[]{sc.nextLong(), sc.nextLong(), sc.nextLong()}).ifPresent(nmx -> System.out.println(IntStream.rangeClosed(1, (int) nmx[0]).mapToLong(i -> IntStream.rangeClosed(1, (int) nmx[1]).filter(j -> ((i + j) % 2 == 0) && (1 + Math.min(Math.min(i - 1, j - 1), Math.min((int) nmx[0] - i, (int) nmx[1] - j))) == nmx[2]).count()).sum())));
    }
}




