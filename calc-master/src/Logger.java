import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private String filename;

    public Logger(String filename) {
        this.filename = filename;
    }

    public void log(String logMessage) {
        try {
            FileWriter writer = new FileWriter(filename, true); // true для дозаписи
            writer.write(logMessage + "\n"); // Добавляем символ новой строки
            writer.close();
            System.out.println("Запись в лог выполнена успешно.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл лога: " + e.getMessage());
        }
    }
}
