import java.util.*;
import java.util.stream.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(Integer.parseInt(s.nextLine().trim())).ifPresent(n ->
            System.out.println(IntStream.range(0, n).mapToObj(i -> s.nextLine().trim()).map(line ->
                Pattern.compile("^R(\\d+)C(\\d+)$").matcher(line) instanceof Matcher m && m.matches()
                    ? new StringBuilder(Stream.iterate(Long.parseLong(m.group(2)), c -> c > 0, c -> (c - 1) / 26)
                        .map(c -> String.valueOf((char) ('A' + (int) ((c - 1) % 26))))
                        .collect(Collectors.joining())).reverse().toString() + m.group(1)
                    : Pattern.compile("^([A-Z]+)(\\d+)$").matcher(line) instanceof Matcher m2 && m2.matches()
                        ? "R" + m2.group(2) + "C" + m2.group(1).chars().reduce(0, (acc, c) -> acc * 26 + (c - 'A' + 1))
                        : "")
                .collect(Collectors.joining("\n")))));
    }
}

