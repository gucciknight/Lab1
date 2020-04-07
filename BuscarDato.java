import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuscarDato {

    static int lineasTotales;
    static int totalCoincidencias;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ID;
        String Descripcion;
        String Categoria;
        int Precio;
        String Local;
        File archivo = new File("./Productos de Construccion .txt");

        System.out.println("Que tipo de busqueda desea hacer:\n"+
                "1-Busqueda por ID?\n"+
                "2-Busqueda por categroia?\n"+
                "3-Busqueda por Precio?\n"+
                "4-Busqueda por Local?");
        String respuesta = br.readLine();
        int opcion = Integer.parseInt(respuesta);
        if (opcion == 1){
            System.out.println("Ingrese el ID del producto:");
                String palabra = br.readLine();
            buscarPalabra(archivo, palabra);
        }


    }
    public static void buscarPalabra(File archivo, String palabra) {

        try {
            // SI EXISTE EL ARCHIVO
            if(archivo.exists()) {
                // ABRE LECTURA DEL ARCHIVO
                BufferedReader leerArchivo = new BufferedReader(new FileReader(archivo));
                // LINEA LEIDA
                String lineaLeida;
                // MIENTRAS LA LINEA LEIDA NO SEA NULL
                while((lineaLeida = leerArchivo.readLine()) != null) {
                    lineasTotales = lineasTotales + 1;
                    String[] palabras = lineaLeida.split(" ");
                    for(int i = 0 ; i < palabras.length ; i++) {
                        if(palabras[i].equals(palabra)) {
                            totalCoincidencias = totalCoincidencias + 1;
                            System.out.println(lineaLeida);
                            System.out.println("En la linea: " + lineasTotales + " se encontro la palabra a buscar: " + palabra);
                            System.out.println("");
                        }
                    }
                }
            }
            System.out.println("En total se encotro la palabra: " + palabra + ", " + totalCoincidencias + " Veces en el archivo");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
