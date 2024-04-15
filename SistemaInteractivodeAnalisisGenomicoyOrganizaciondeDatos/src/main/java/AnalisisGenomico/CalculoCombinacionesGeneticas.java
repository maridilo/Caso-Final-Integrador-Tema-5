package AnalisisGenomico;

public class CalculoCombinacionesGeneticas {
public static int CalculoCombinacionesGeneticas(int n) {
if (n == 0) {
    return 1;
} else {
    return 2 * CalculoCombinacionesGeneticas(n - 1);
        }
    }
        public static void CalculoCombinacionesGeneticas(String genes, String combination) {
            // Si no hay más genes por combinar, imprimimos la combinación actual
            if (genes.isEmpty()) {
                System.out.println(combination);
            } else {
                // Tomamos el primer gen de la lista
                char gene = genes.charAt(0);
                // Restringimos la lista de genes para el próximo nivel de recursión
                String remainingGenes = genes.substring(1);

                // Para cada alelo del gen actual, llamamos recursivamente a la función con el siguiente gen
                CalculoCombinacionesGeneticas(remainingGenes, combination + gene);
                CalculoCombinacionesGeneticas(remainingGenes, combination + Character.toLowerCase(gene));
            }
        }

        public static void main(String[] args) {
            // Ejemplo de genes
            String genes = "AB";
            // Llamamos al método para calcular combinaciones
            CalculoCombinacionesGeneticas(genes, "");
        }
    }


