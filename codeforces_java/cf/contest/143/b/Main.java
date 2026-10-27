import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).next()).ifPresent(t ->
            Optional.of(t.startsWith("-")).ifPresent(neg ->
                Optional.of((neg ? t.substring(1) : t).split("\\.", -1)).ifPresent(p ->
                    System.out.println(
                        (neg ? "(" : "") + "$"
                        + p[0].replaceAll("(?<=\\d)(?=(\\d{3})+$)", ",")
                        + "." + ((p.length > 1 ? p[1] : "") + "00").substring(0, 2)
                        + (neg ? ")" : "")))));
    }
}

