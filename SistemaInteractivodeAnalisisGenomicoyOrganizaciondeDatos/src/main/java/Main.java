
import java.util.Scanner;
import AnalisisGenomico.ConteodeGenes;
import AnalisisGenomico.CalculoCombinacionesGeneticas;
import HerramientasdeAnalisisNumerico.SumatoriayListadoNumeros;
import HerramientasdeAnalisisNumerico.PotenciasyMaximos;


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

    System.out.println("Ingrese un número para calcular su sumatoria:");
    int num = scanner.nextInt();
    int sumatoria = SumatoriayListadoNumeros.sumatoria(num);
    System.out.println("La sumatoria es: " + sumatoria);

    System.out.println("Ingrese el inicio y fin del rango para listar los números:");
    int inicio = scanner.nextInt();
    int fin = scanner.nextInt();
    System.out.println("Los números en el rango dado son:");
    SumatoriayListadoNumeros.listarNumeros(inicio, fin);

    System.out.println("Ingrese la base y el exponente para calcular la potencia:");
    int base = scanner.nextInt();
    int exponente = scanner.nextInt();
    int potencia = PotenciasyMaximos.potencia(base, exponente);
    System.out.println("La potencia es: " + potencia);

    System.out.println("Ingrese la longitud del array para encontrar el valor máximo:");
    int longitud = scanner.nextInt();
    int[] array = new int[longitud];
    System.out.println("Ingrese los elementos del array:");
    for (int i = 0; i < longitud; i++) {
    array[i] = scanner.nextInt();
    }
    int maximo = PotenciasyMaximos.maximo(array, 0);
    System.out.println("El valor máximo en el array es: " + maximo);

    scanner.close();
    }
}

