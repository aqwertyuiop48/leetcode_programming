import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && IntStream.range(0, raw.length).filter(k -> raw[k] == 10).boxed().findFirst().get() instanceof Integer nl
            && Integer.valueOf(new String(raw, 0, nl).trim()) instanceof Integer n
            && new int[n + 2] instanceof int[] cD && new int[n + 2] instanceof int[] cU
            && IntStream.rangeClosed(1, n).allMatch(i -> (cD[i] = cD[i - 1] + (raw[nl + i] == 68 ? 1 : 0)) + (cU[i] = cU[i - 1] + (raw[nl + i] == 85 ? 1 : 0)) >= 0)
            && new long[cD[n] + 1] instanceof long[] psD && new long[cU[n] + 1] instanceof long[] psU
            && IntStream.rangeClosed(1, n).allMatch(i -> raw[nl + i] == 68 ? (psD[cD[i]] = psD[cD[i] - 1] + i) > 0 : (psU[cU[i]] = psU[cU[i] - 1] + i) > 0)
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.rangeClosed(1, n).allMatch(i -> sb.append(i == 1 ? "" : " ").append(raw[nl + i] == 85
                ? ((cD[n] - cD[i]) <= cU[i - 1] ? 2 * (psD[cD[i] + (cD[n] - cD[i])] - psD[cD[i]]) - 2 * (psU[cU[i - 1]] - psU[cU[i - 1] - (cD[n] - cD[i])]) - i + n + 1 : 2 * (psD[cD[i] + cU[i - 1] + 1] - psD[cD[i]]) - 2 * (psU[cU[i - 1]] - psU[cU[i - 1] - cU[i - 1]]) - i)
                : (cU[i - 1] <= (cD[n] - cD[i]) ? i + 2 * (psD[cD[i] + cU[i - 1]] - psD[cD[i]]) - 2 * (psU[cU[i - 1]] - psU[cU[i - 1] - cU[i - 1]]) : i + 2 * (psD[cD[i] + (cD[n] - cD[i])] - psD[cD[i]]) - 2 * (psU[cU[i - 1]] - psU[cU[i - 1] - ((cD[n] - cD[i]) + 1)]) + n + 1)).length() > 0)
            ? sb : "");
    }
}
