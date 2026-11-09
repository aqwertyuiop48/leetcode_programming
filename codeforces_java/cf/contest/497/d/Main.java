import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Double) Double.parseDouble(tk.nextToken()) instanceof Double px && (Double) Double.parseDouble(tk.nextToken()) instanceof Double py
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && new double[n] instanceof double[] ax && new double[n] instanceof double[] ay
            && IntStream.range(0, n).filter(i -> (ax[i] = Double.parseDouble(tk.nextToken())) > -1e18 && (ay[i] = Double.parseDouble(tk.nextToken())) > -1e18).count() >= 0
            && (Double) Double.parseDouble(tk.nextToken()) instanceof Double qx && (Double) Double.parseDouble(tk.nextToken()) instanceof Double qy
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && new double[m] instanceof double[] bx && new double[m] instanceof double[] by
            && IntStream.range(0, m).filter(i -> (bx[i] = Double.parseDouble(tk.nextToken())) > -1e18 && (by[i] = Double.parseDouble(tk.nextToken())) > -1e18).count() >= 0
            && ((Function<double[], Boolean>) v ->
                (Double) ((v[0] - v[2]) * (v[0] - v[2]) + (v[1] - v[3]) * (v[1] - v[3])) instanceof Double a
                && (Double) (2.0 * (v[0] * (v[2] - v[0]) + v[1] * (v[3] - v[1]))) instanceof Double b
                && (Double) (b / (-2.0) / a) instanceof Double t
                && (Double) (v[0] + t * (v[2] - v[0])) instanceof Double nx && (Double) (v[1] + t * (v[3] - v[1])) instanceof Double ny
                && (Double) Math.min(v[0] * v[0] + v[1] * v[1], v[2] * v[2] + v[3] * v[3]) instanceof Double lo0
                && (Double) Math.max(v[0] * v[0] + v[1] * v[1], v[2] * v[2] + v[3] * v[3]) instanceof Double hi
                && (Double) (!(t + 1e-8 < b) && !(1.0 + 1e-8 < t) ? nx * nx + ny * ny : lo0) instanceof Double lo
                && (Double) (v[4] * v[4] + v[5] * v[5]) instanceof Double len
                && !(len + 1e-8 < lo) && !(hi + 1e-8 < len)) instanceof Function<double[], Boolean> ok
            && ((Function<double[][], Boolean>) d -> IntStream.range(0, d[0].length).anyMatch(i -> IntStream.range(0, d[2].length).anyMatch(j ->
                (Double) (d[4][2] - d[4][0]) instanceof Double nqx && (Double) (d[4][3] - d[4][1]) instanceof Double nqy
                && (Double) (d[2][j] - d[4][0]) instanceof Double nbx && (Double) (d[3][j] - d[4][1]) instanceof Double nby
                && (Double) (nbx - nqx) instanceof Double dx && (Double) (nby - nqy) instanceof Double dy
                && (Integer) ((i + 1) % d[0].length) instanceof Integer ni
                && ok.apply(new double[] {d[0][i] - d[4][0] - dx, d[1][i] - d[4][1] - dy, d[0][ni] - d[4][0] - dx, d[1][ni] - d[4][1] - dy, nbx - dx, nby - dy})))) instanceof Function<double[][], Boolean> chk
            ? (chk.apply(new double[][] {ax, ay, bx, by, {px, py, qx, qy}}) || chk.apply(new double[][] {bx, by, ax, ay, {qx, qy, px, py}}) ? "YES" : "NO") : "");
    }
}
