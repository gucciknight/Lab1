import java.io.*;
import java.util.Scanner;  // Import the Scanner class
import java.lang.Integer;


public class Texto{
  int[] ID;
  String[] Nombre;
  String[] Categoria;
  int[] Precio;
  String[] Tienda;

  private int contadorDeLineas(final String filePath) {
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
    //public static void main(String[] args) {
    //  Texto();
    //}

      public Texto() {
    // Read in the data file.
    final String dir = System.getProperty("user.dir");
    String filePath = dir + "/ProductosDeConstruccion.txt";
    int lines = contadorDeLineas(filePath);

    this.ID = new int[lines];
    this.Nombre = new String[lines];
    this.Categoria = new String[lines];
    this.Precio = new int[lines];
    this.Tienda = new String[lines];

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String sCurrentLine;
        int x = 0;

        // Read in one line at a time and Fill the Arrays...
        while ((sCurrentLine = br.readLine()) != null) {
             // Split each line read into an array upon itself.
             String[] fileLine = sCurrentLine.split(", ");

             // Fill our required Arrays...
             this.ID[x] = Integer.parseInt(fileLine[0]);
             this.Nombre[x] = fileLine[1];
             this.Categoria[x] = fileLine[2];
             this.Precio[x] = Integer.parseInt(fileLine[3]);
             this.Tienda[x] = fileLine[4];
              x++;
        }
        br.close();
    }
    catch (IOException ex) { ex.printStackTrace();}
}

  }
