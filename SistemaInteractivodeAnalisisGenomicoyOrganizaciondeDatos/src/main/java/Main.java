import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import AnalisisGenomico.ConteodeGenes;
import AnalisisGenomico.CalculoCombinacionesGeneticas;
import GestiondeInformacionCientifica.BusquedaEficienteenTextos;
import GestiondeInformacionCientifica.GestionFechas;
import GestiondeInformacionCientifica.OrganizacionDocumentos;
import HerramientasdeAnalisisNumerico.SumatoriayListadoNumeros;
import HerramientasdeAnalisisNumerico.PotenciasyMaximos;
import OptimizaciondeProcesos.MejoraAlgoritmos;

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


    System.out.println("Ingrese el nombre del archivo para ordenar sus líneas:");
    String fileName = scanner.nextLine();
    try {
        List<String> sortedLines = OrganizacionDocumentos.sortLinesInFile(fileName);
        System.out.println("Las líneas ordenadas son:");
        for (String line : sortedLines) {
            System.out.println(line);
        }
    } catch (IOException e) {
        System.out.println("Error al leer el archivo: " + e.getMessage());
    }

    System.out.println("Ingrese la palabra a buscar y el nombre del archivo:");
    String word = scanner.nextLine();
    fileName = scanner.nextLine();
    try {
        boolean found = BusquedaEficienteenTextos.linearSearch(word, fileName);
        System.out.println("La palabra fue encontrada (búsqueda lineal): " + found);
        List<String> lines = OrganizacionDocumentos.sortLinesInFile(fileName);
        found = BusquedaEficienteenTextos.binarySearch(word, lines);
        System.out.println("La palabra fue encontrada (búsqueda binaria): " + found);
    } catch (IOException e) {
        System.out.println("Error al leer el archivo: " + e.getMessage());
    }

    GestionFechas gestionFechas = new GestionFechas();
    System.out.println("Ingrese una fecha (formato yyyy-MM-dd):");
    String fecha = scanner.nextLine();
    LocalDate date = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    gestionFechas.addDate(date);
    System.out.println("Las fechas ordenadas son:");
    gestionFechas.listDates();

    System.out.println("Ingrese la longitud del array para ordenar:");
    longitud = scanner.nextInt();
    array = new int[longitud];
    System.out.println("Ingrese los elementos del array:");
    for (int i = 0; i < longitud; i++) {
        array[i] = scanner.nextInt();
    }
    MejoraAlgoritmos.sort(array);
    System.out.println("El array ordenado es: " + Arrays.toString(array));

    scanner.close();
    }
}

