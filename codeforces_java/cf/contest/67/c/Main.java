import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(IntStream.generate(s::nextInt).limit(4).toArray()).ifPresent(c ->
            Optional.of(s.next()).ifPresent(a ->
            Optional.of(s.next()).ifPresent(b ->
            Optional.of(new int[a.length() + 1][b.length() + 1]).ifPresent(d ->
            Optional.of(new int[128]).ifPresent(da ->
            Optional.of(new int[]{0}).ifPresent(db ->
                System.out.print(IntStream.rangeClosed(1, a.length()).allMatch(i -> (d[i][0] = i * c[1]) >= 0)
                    && IntStream.rangeClosed(1, b.length()).allMatch(j -> (d[0][j] = j * c[0]) >= 0)
                    && IntStream.rangeClosed(1, a.length()).allMatch(i -> (db[0] = 0) == 0
                        && IntStream.rangeClosed(1, b.length()).allMatch(j ->
                            (d[i][j] = Math.min(Math.min(d[i - 1][j - 1] + (a.charAt(i - 1) == b.charAt(j - 1) ? 0 : c[2]), d[i][j - 1] + c[0]), Math.min(d[i - 1][j] + c[1],
                                da[b.charAt(j - 1)] > 0 && db[0] > 0 ? d[da[b.charAt(j - 1)] - 1][db[0] - 1] + (i - da[b.charAt(j - 1)] - 1) * c[1] + c[3] + (j - db[0] - 1) * c[0] : Integer.MAX_VALUE / 2))) >= 0
                            & (db[0] = a.charAt(i - 1) == b.charAt(j - 1) ? j : db[0]) >= 0)
                        && (da[a.charAt(i - 1)] = i) > 0)
                    ? d[a.length()][b.length()] : -1))))))));
    }
}



