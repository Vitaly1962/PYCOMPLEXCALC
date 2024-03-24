import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private String filename;

    public Logger(String filename) {
        this.filename = filename;
    }

    public void log(String logMessage) {
        try {
            FileWriter writer = new FileWriter(filename, true); // true for appending
            writer.write(logMessage + "\n"); // Add a newline character
            writer.close();
            System.out.println("Logging successfully performed.");
        } catch (IOException e) {
            System.out.println("Error writing to log file: " + e.getMessage());
        }
    }
}
