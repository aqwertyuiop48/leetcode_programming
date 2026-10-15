import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.print(
                (new String[]{"S", "M", "L", "XL", "XXL"} instanceof String[] names
                && new int[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()} instanceof int[] cnt
                && new int[]{s.nextInt()} instanceof int[] k
                && new StringBuilder() instanceof StringBuilder sb
                && IntStream.range(0, k[0]).allMatch(qi ->
                    s.next() instanceof String want
                    && new int[]{IntStream.range(0, 5).filter(i -> names[i].equals(want)).findFirst().getAsInt()} instanceof int[] idxA
                    && new int[]{cnt[idxA[0]] > 0 ? idxA[0] : IntStream.range(1, 5).mapToObj(d ->
                            idxA[0] + d < 5 && cnt[idxA[0] + d] > 0 ? idxA[0] + d
                            : idxA[0] - d >= 0 && cnt[idxA[0] - d] > 0 ? idxA[0] - d
                            : -1)
                        .filter(v -> v >= 0).findFirst().orElse(-1)} instanceof int[] chosenA
                    && (cnt[chosenA[0]] = cnt[chosenA[0]] - 1) >= -1
                    && sb.append(names[chosenA[0]]).append('\n') instanceof StringBuilder))
                ? sb.toString()
                : ""
            )
        );
    }
}


