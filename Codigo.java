import java.io.*;
import java.utils.ArrayList;
class Conversor{
    public static void main(String [] args) throws IOException{
    BufferedReader X = new BufferedReader(new InputStreamReade(System.in));
    //categorias son 3 Descripcion | Categoria | Precio
    String[] ListadoyDescripcion = new String[2];
    int[] Precio = new int[0];
    System.out.println("Systema de datos comerciales \n"+
    "En nuestro menu le damos a ingresar las siguientes opciones\n"+
    "1.- Ingresar Datos\n"+
    "2.- Consultar Datos\n"+
    "3-. Eliminar Datos");
    String entrada;
    entrada = X.readLine();
    int option;
    option = Integer.parseInt(entrada);
    boolean candado = true;
    int Cantidad;
    switch(option){
        case(1):
        	System.out.println("Ha ingresado la opcione para ingresar datos\n"
        			+ "Ingrese cuantos datos desea ingresear");
        	entrada = X.readLine();
        	Cantidad = Integer.parseInt(entrada);
        	for(int i = 0;i == Cantidad ; i++){
        		System.out.println("Ingrese la Descripcion");
	        	ListadoyDescripcion[0]= X.readLine();
	        	System.out.println("Ingrese la Categoria");
	        	ListadoyDescripcion[1]= X.readLine();
	        	System.out.println("Ingrese el Precio");
	        	ListadoyDescripcion[2]= X.readLine();
        	}
            break;
        case(2):
        	System.out.println("Ha ingresado la opcion para Buscar Datos\n"
        			+ "Ingrese la opcion por como desea realizar la busqueda\n"
        			+ "1.- Busqueda por Descripcion\n"
        			+ "2.- Busqueda por Categoria\n"
        			+ "3.- Busqueda por Precio");
        	entrada = X.readLine();
        	option = Integer.parseInt(entrada);
        	switch(option) {
        	case(1):
        		break;
        	case(2):
        		break;
        	case(3):
        		break;
        	}
            break;
        case(3):
            break;
    }
    }}