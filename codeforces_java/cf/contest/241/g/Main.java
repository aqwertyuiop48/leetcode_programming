
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new double[311] instanceof double[] pos && new double[311] instanceof double[] rad && (rad[0] = 1000000.0) > 0
            ? Stream.concat(Stream.of("311", "0 1000000"), IntStream.rangeClosed(1, 310).mapToObj(i ->
                (Double) (pos[i] = i == 310 ? 1000000.0 : pos[i - 1] + Math.sqrt(i == 1 ? 4 * rad[0] * 950.0 : 4 * rad[i - 1] * (rad[i - 1] - 3.0))) instanceof Double cur
                    && (Double) IntStream.range(0, i).mapToDouble(j -> (pos[i] - pos[j]) * (pos[i] - pos[j]) / (4.0 * rad[j])).reduce(1000000.0, (c, v) -> c > v ? v : c) instanceof Double cr
                    && (Double) (rad[i] = i == 310 ? 1000000.0 : cr) instanceof Double fin
                    ? (int) (double) cur + " " + (int) (double) fin : "")).collect(Collectors.joining(System.lineSeparator()))
            : "");
    }
}



