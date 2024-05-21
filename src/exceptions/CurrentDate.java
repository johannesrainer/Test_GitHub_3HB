package exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class CurrentDate {

    private static void writeLocalDateTimeToFile(String dateiname) throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileOutputStream(dateiname))) {
            printWriter.println(LocalDateTime.now());
        }
    }

    public static void main(String[] args) {
        String dateiname = "ausgabedatei.txt";

        try {
            writeLocalDateTimeToFile(dateiname);
        } catch (IOException e) {
            System.err.println("Fehler beim Schreiben in die Datei: " + e.getMessage());
        }
    }
}

