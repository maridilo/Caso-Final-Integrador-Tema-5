
import java.util.Scanner;
import AnalisisGenomico.ConteodeGenes;
import AnalisisGenomico.CalculoCombinacionesGeneticas;


public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese la cadena de ADN:");
    String genoma = scanner.nextLine();
    int conteoGenes = ConteodeGenes.ConteodeGenes(genoma);
    System.out.println("El número de genes es: " + conteoGenes);

    System.out.println("Ingrese el número de genes para calcular las combinaciones genéticas:");
    int numGenes = scanner.nextInt();
    int combinacionesGeneticas = CalculoCombinacionesGeneticas.CalculoCombinacionesGeneticas(numGenes);
    System.out.println("El número de combinaciones genéticas es: " + combinacionesGeneticas);

    scanner.nextLine(); // consume the newline left-over
    System.out.println("Ingrese una cadena de genes para calcular todas las combinaciones posibles:");
    String genes = scanner.nextLine();
    CalculoCombinacionesGeneticas.CalculoCombinacionesGeneticas(genes, "");

    scanner.close();
    }
}

