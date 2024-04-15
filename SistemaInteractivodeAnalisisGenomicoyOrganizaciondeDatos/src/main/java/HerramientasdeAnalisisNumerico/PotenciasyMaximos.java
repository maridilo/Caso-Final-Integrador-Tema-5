package HerramientasdeAnalisisNumerico;

public class PotenciasyMaximos {
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    public static int maximo(int[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        }

        int max = maximo(array, index + 1);

        if (array[index] >= max) {
            return array[index];
        } else {
            return max;
        }
    }
}
