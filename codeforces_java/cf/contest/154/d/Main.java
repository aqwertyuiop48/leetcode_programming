import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && (Long) s.nextLong() instanceof Long x1 && (Long) s.nextLong() instanceof Long x2 && (Long) s.nextLong() instanceof Long a && (Long) s.nextLong() instanceof Long b
            && (Long) (x2 - x1) instanceof Long d && (Boolean) (b < 0) instanceof Boolean mir
            && (Long) (mir ? -d : d) instanceof Long dd && (Long) (mir ? -b : a) instanceof Long aa && (Long) (mir ? -a : b) instanceof Long bb
            ? aa <= 0 ? d >= a && d <= b ? "FIRST\n" + x2 : "DRAW"
                : dd <= 0 ? "DRAW"
                : dd % (aa + bb) == 0 ? "SECOND"
                : dd % (aa + bb) >= aa && dd % (aa + bb) <= bb ? "FIRST\n" + (x1 + (mir ? -1 : 1) * (dd % (aa + bb)))
                : "DRAW" : "");
    }
}

