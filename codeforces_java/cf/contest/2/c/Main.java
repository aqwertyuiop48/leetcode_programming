import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(DoubleStream.generate(s::nextDouble).limit(9).toArray()).ifPresent(p ->
            System.out.println(
                new double[]{
                    p[5] * p[5] - p[2] * p[2],
                    2 * (p[3] * p[2] * p[2] - p[0] * p[5] * p[5]),
                    2 * (p[4] * p[2] * p[2] - p[1] * p[5] * p[5]),
                    p[5] * p[5] * (p[0] * p[0] + p[1] * p[1]) - p[2] * p[2] * (p[3] * p[3] + p[4] * p[4])
                } instanceof double[] eq1
                && new double[]{
                    p[8] * p[8] - p[2] * p[2],
                    2 * (p[6] * p[2] * p[2] - p[0] * p[8] * p[8]),
                    2 * (p[7] * p[2] * p[2] - p[1] * p[8] * p[8]),
                    p[8] * p[8] * (p[0] * p[0] + p[1] * p[1]) - p[2] * p[2] * (p[6] * p[6] + p[7] * p[7])
                } instanceof double[] eq2
                && new double[]{
                    (Math.abs(eq1[0]) < 1e-6 && Math.abs(eq2[0]) < 1e-6) ? eq1[1] : eq2[0] * eq1[1] - eq1[0] * eq2[1],
                    (Math.abs(eq1[0]) < 1e-6 && Math.abs(eq2[0]) < 1e-6) ? eq1[2] : eq2[0] * eq1[2] - eq1[0] * eq2[2],
                    (Math.abs(eq1[0]) < 1e-6 && Math.abs(eq2[0]) < 1e-6) ? eq1[3] : eq2[0] * eq1[3] - eq1[0] * eq2[3]
                } instanceof double[] L
                && ((Math.abs(eq1[0]) < 1e-6 && Math.abs(eq2[0]) < 1e-6) ? eq2 : (Math.abs(eq1[0]) >= Math.abs(eq2[0]) ? eq1 : eq2)) instanceof double[] tgt
                && new double[]{-L[0] * L[2] / (L[0] * L[0] + L[1] * L[1]), -L[1] * L[2] / (L[0] * L[0] + L[1] * L[1])} instanceof double[] base
                && new double[]{-L[1], L[0]} instanceof double[] dir
                && new double[]{
                    tgt[0] * (dir[0] * dir[0] + dir[1] * dir[1]),
                    2 * tgt[0] * (base[0] * dir[0] + base[1] * dir[1]) + tgt[1] * dir[0] + tgt[2] * dir[1],
                    tgt[0] * (base[0] * base[0] + base[1] * base[1]) + tgt[1] * base[0] + tgt[2] * base[1] + tgt[3]
                } instanceof double[] qc
                && new double[]{
                    Math.abs(qc[0]) < 1e-6 ? -qc[2] / qc[1] : (-qc[1] + Math.sqrt(qc[1] * qc[1] - 4 * qc[0] * qc[2])) / (2 * qc[0]),
                    Math.abs(qc[0]) < 1e-6 ? -qc[2] / qc[1] : (-qc[1] - Math.sqrt(qc[1] * qc[1] - 4 * qc[0] * qc[2])) / (2 * qc[0])
                } instanceof double[] ts
                && new double[]{
                    base[0] + ts[0] * dir[0], base[1] + ts[0] * dir[1],
                    base[0] + ts[1] * dir[0], base[1] + ts[1] * dir[1]
                } instanceof double[] cands
                && new double[]{
                    Math.hypot(cands[0] - p[0], cands[1] - p[1]) / p[2],
                    Math.hypot(cands[2] - p[0], cands[3] - p[1]) / p[2]
                } instanceof double[] ks
                ? (ks[0] > 1 + 1e-6 && (!(ks[1] > 1 + 1e-6) || ks[0] <= ks[1])
                    ? String.format("%.5f %.5f", cands[0], cands[1])
                    : ks[1] > 1 + 1e-6
                        ? String.format("%.5f %.5f", cands[2], cands[3])
                        : "")
                : "")));
    }
}


