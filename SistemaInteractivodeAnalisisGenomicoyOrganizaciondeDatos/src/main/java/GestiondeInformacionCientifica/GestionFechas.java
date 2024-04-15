package GestiondeInformacionCientifica;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestionFechas {
    private List<LocalDate> dates = new ArrayList<>();

    public void addDate(LocalDate date) {
        dates.add(date);
        Collections.sort(dates);
    }

    public void listDates() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (LocalDate date : dates) {
            System.out.println(formatter.format(date));
        }
    }
}