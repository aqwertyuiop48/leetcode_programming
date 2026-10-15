import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(a -> System.out.println(
            IntStream.range(0, a[0]).mapToObj(i -> s.next().toCharArray()).toArray(char[][]::new) instanceof char[][] g
            && IntStream.range(0, a[0]).mapToObj(i -> ".".repeat(a[1]).toCharArray()).toArray(char[][]::new) instanceof char[][] o
            && ((IntBinaryOperator) (r, c) -> 'a' + 2 * (((r + c) / 2) % 2) + Math.floorMod(Math.floorDiv(r - c, 2), 2)) instanceof IntBinaryOperator lt
            && IntStream.range(0, a[0]).allMatch(i -> IntStream.range(0, a[1]).allMatch(j -> g[i][j] == '.' || o[i][j] != '.' || (g[i][j] == 'w'
                && (j + 2 < a[1] && g[i][j + 1] == 'b' && o[i][j + 1] == '.'
                    ? g[i][j + 2] == 'w' && o[i][j + 2] == '.' && (o[i][j] = o[i][j + 1] = o[i][j + 2] = (char) lt.applyAsInt(i, j + 1)) > 0
                    : i + 2 < a[0] && g[i + 1][j] == 'b' && o[i + 1][j] == '.' && g[i + 2][j] == 'w' && o[i + 2][j] == '.' && (o[i][j] = o[i + 1][j] = o[i + 2][j] = (char) lt.applyAsInt(i + 1, j)) > 0))))
            ? "YES\n" + Arrays.stream(o).map(String::new).collect(Collectors.joining("\n"))
            : "NO")));
    }
}


