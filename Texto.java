import java.io.*;
import java.util.Scanner;  // Import the Scanner class
import java.lang.Integer;


public class Texto{

  private static int contadorDeLineas(final String filePath) {
    int lines = 0;
    try{
        File file =new File(filePath);
        if(file.exists()){
            FileReader fr = new FileReader(file);
            try (LineNumberReader lnr = new LineNumberReader(fr)) {
                while (lnr.readLine() != null){ lines++; }
            }
        }
        else {
            throw new IllegalArgumentException("error con el metodo contadorDeLineas\n"
                    + "El siguiente directorio no existe\n(" + filePath + ")");
        }
    }
    catch(IOException e){ e.printStackTrace(); }
    return lines;
}
  //  public static void main(String[] args) {
  //    cargarArrays();
  //  }

      public static void cargarArrays() {
    // Read in the data file.
    final String dir = System.getProperty("user.dir");
    String filePath = dir + "/ProductosDeConstruccion.txt";
    int lines = contadorDeLineas(filePath);

    int[] ID = new int[lines];
    String[] Nombre = new String[lines];
    String[] Categoria = new String[lines];
    int[] Precio = new int[lines];
    String[] Tienda = new String[lines];

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String sCurrentLine;
        int x = 0;
        int i = x + 1;
        // Read in one line at a time and Fill the Arrays...
        while ((sCurrentLine = br.readLine()) != null) {
             // Split each line read into an array upon itself.
             String[] fileLine = sCurrentLine.split(", ");

             // Fill our required Arrays...
             ID[x] = Integer.parseInt(fileLine[0]);
             Nombre[x] = fileLine[1];
             Categoria[x] = fileLine[2];
             Precio[x] = Integer.parseInt(fileLine[3]);
             Tienda[x] = fileLine[4];
              x++;
        }
        br.close();
    }
    catch (IOException ex) { ex.printStackTrace();}
}

  }
