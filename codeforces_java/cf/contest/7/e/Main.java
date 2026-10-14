import java.util.*;
import java.util.stream.*;

public class Main {
    static Map<String, Object[]> macros = new HashMap<>();

    static boolean safe(int side, int ctxOp, int exprOp) {
        return exprOp == 0
            || ctxOp == 1
            || ((exprOp == 1 || exprOp == 2) && ctxOp == 2 && side == 0)
            || ((exprOp == 3 || exprOp == 4) && (ctxOp == 2 || ctxOp == 3 || (ctxOp == 4 && side == 0)));
    }

    static int numEnd(String s, int p) { return p < s.length() && Character.isDigit(s.charAt(p)) ? numEnd(s, p + 1) : p; }
    static int identEnd(String s, int p) { return p < s.length() && (Character.isLetterOrDigit(s.charAt(p)) || s.charAt(p) == '_') ? identEnd(s, p + 1) : p; }

    static Object[] parseFactor(String s, int p) {
        return s.charAt(p) == '('
            ? (parseExpr(s, p + 1) instanceof Object[] r ? new Object[]{0, r[1], (Integer) r[2] + 1} : null)
            : s.charAt(p) == '-'
                ? (parseFactor(s, p + 1) instanceof Object[] r ? new Object[]{0, r[1], r[2]} : null)
                : Character.isDigit(s.charAt(p))
                    ? new Object[]{0, false, numEnd(s, p)}
                    : Integer.valueOf(identEnd(s, p)) instanceof Integer e
                        ? (macros.containsKey(s.substring(p, e))
                            ? (macros.get(s.substring(p, e)) instanceof Object[] mInfo ? new Object[]{mInfo[0], mInfo[1], e} : null)
                            : new Object[]{0, false, e})
                        : null;
    }

    static Object[] parseTermRest(String s, int p, int leftOp, boolean susp) {
        return p < s.length() && (s.charAt(p) == '*' || s.charAt(p) == '/')
            ? (Integer.valueOf(s.charAt(p) == '*' ? 3 : 4) instanceof Integer ctxOp
                ? (parseFactor(s, p + 1) instanceof Object[] f
                    ? parseTermRest(s, (Integer) f[2], ctxOp,
                        susp || !safe(0, ctxOp, leftOp) || !safe(1, ctxOp, (Integer) f[0]) || (Boolean) f[1])
                    : null)
                : null)
            : new Object[]{leftOp, susp, p};
    }

    static Object[] parseTerm(String s, int p) {
        return parseFactor(s, p) instanceof Object[] f ? parseTermRest(s, (Integer) f[2], (Integer) f[0], (Boolean) f[1]) : null;
    }

    static Object[] parseExprRest(String s, int p, int leftOp, boolean susp) {
        return p < s.length() && (s.charAt(p) == '+' || s.charAt(p) == '-')
            ? (Integer.valueOf(s.charAt(p) == '+' ? 1 : 2) instanceof Integer ctxOp
                ? (parseTerm(s, p + 1) instanceof Object[] t
                    ? parseExprRest(s, (Integer) t[2], ctxOp,
                        susp || !safe(0, ctxOp, leftOp) || !safe(1, ctxOp, (Integer) t[0]) || (Boolean) t[1])
                    : null)
                : null)
            : new Object[]{leftOp, susp, p};
    }

    static Object[] parseExpr(String s, int p) {
        return parseTerm(s, p) instanceof Object[] t ? parseExprRest(s, (Integer) t[2], (Integer) t[0], (Boolean) t[1]) : null;
    }

    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(Integer.parseInt(sc.nextLine().trim())).ifPresent(t ->
            System.out.println(
                IntStream.range(0, t).allMatch(i -> sc.nextLine().trim().split("\\s+", 3) instanceof String[] parts
                    && parseExpr(parts[2].replace(" ", ""), 0) instanceof Object[] r
                    && (macros.put(parts[1], new Object[]{r[0], r[1]}) == null || true))
                && parseExpr(sc.nextLine().trim().replace(" ", ""), 0) instanceof Object[] fr
                ? ((Boolean) fr[1] ? "Suspicious" : "OK")
                : "")));
    }
}
