package FinalProgectJavaCore.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Report implements AutoCloseable {
    private final DateTimeFormatter dataAndTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private final FileWriter writer;

    public Report(String reportFilePath) throws IOException {
        this.writer = new FileWriter(reportFilePath, true);
    }

    public void logs(String fileName, String from, String to, Integer amount, boolean success, String errorMessage) {
        String timestamp = LocalDateTime.now().format(dataAndTimeFormat);
        String status = success ? "успешно обработан" : "ошибка во время обработки, " + errorMessage;
        String line = String.format("%s | %s | перевод с %s на %s %d | %s%n",
                timestamp, fileName, from, to, amount, status);
        try {
            writer.write(line);
        } catch (IOException e) {
            System.out.println("Ошибка при записи отчета:" + e.getMessage());
        }
    }

    public void close() throws IOException {
        writer.close();
    }
}
