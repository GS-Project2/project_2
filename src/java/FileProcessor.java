import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileProcessor {
    private String[][] rowsAndColumns;

    public FileProcessor() {
    }

    public String[][] getRowsAndColumns() {
        return rowsAndColumns;
    }

    public void setRowsAndColumns(String[][] rowsAndColumns) {
        this.rowsAndColumns = rowsAndColumns;
    }

    public List<String> readFile(String path) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(path));

        return lines;
    }

    public void processFileData(){

    }
}
