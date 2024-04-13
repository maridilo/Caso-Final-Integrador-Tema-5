package AnalisisGenomico;

public class ConteodeGenes {
    public static int ConteodeGenes(String genoma) {
        return conteoRecursivo(genoma, 0);
    }
    private static int conteoRecursivo(String genoma, int index) {
        if (index >= genoma.length() - 2) {
            return 0;
        }
        if (genoma.substring(index, index + 3).equals("ATG")) {
            return 1 + conteoRecursivo(genoma, index + 3);
        } else {
            return conteoRecursivo(genoma, index + 1);
        }
    }
}