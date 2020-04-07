import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.BufferedReader;
import java.io.*;

public class convert {
    
    public int[] fileToArray(String fileName) throws IOException
    {
        List<String> list = Files.readAllLines(Paths.get(Productos de Construccion));
        int[] res = new int[list.size()];
        int pos = 0;
        for (String line: list)
        {
            res[pos++] = Integer.parseInt(line);
        }
        return res;
    }
}