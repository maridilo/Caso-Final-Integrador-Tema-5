package GestiondeInformacionCientifica;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class BusquedaEficienteenTextos {

    public static boolean linearSearch(String word, String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean binarySearch(String word, List<String> lines) {
        int left = 0;
        int right = lines.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = word.compareTo(lines.get(mid));
            if (res == 0) {
                return true;
            }
            if (res > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}