package AnalisisGenomico;

public class CalculoCombinacionesGeneticas {
public static int CalculoCombinacionesGeneticas(int n) {
if (n == 0) {
    return 1;
} else {
    return 2 * CalculoCombinacionesGeneticas(n - 1);
        }
    }
}
