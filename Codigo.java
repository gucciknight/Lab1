import java.io.*;
import java.utils.ArrayList;
class Conversor{
    public static void main(String [] args) throws IOException{
    BufferedReader X = new BufferedReader(new InputStreamReader(System.in));
    //categorias son 3 Descripcion | Categoria | Precio
    File archivo = new File("Productors de Construccion.txt");
    FileWriter Escritura = new FileWriter("Productors de Construccion.txt");
    FileReader Lectura = new FileReader("Productors de Construccion.txt");
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
    int Desicion;
    int ID = Lectura.read();
    int IDMAX = null;
    String Descripcion;
    String Categoria;
    String Precio;
    // metodo para buscar palabras tanto descripcion como precio como categoria
    public static void BuscarPalabra(File archivo, String Descripcion) {
    	try {
    		if(archivo.exists()) {
    			String LineaLeida;
    			while((LineaLeida = X.readLine() != null)) {
    				ID = ID + 1;
    			}
    		}
    	}
    }
    switch(option){
    // caso 1 en construccion
        case(1):
        	archivo.canWrite(true);
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
        	System.out.println("Esta seguro de guardar los cambios ?\n"
        			+ "1.- SI\n"
        			+ "2.- NO");
        	entrada = X.readLine();
        	Desicion = Integer.parseInt(entrada);
        	if (Desicion == 1) {
        		archivo.write(IDMAX + 1,",",ListadoyDescripcion[0],",",ListadoyDescripcion[1],",",ListadoyDescripcion[2]);
        	}else {
        		System.out.println("Ha eliminado todos los datos ingresados");
        	}
        	Escritura.close();
            break;
        case(2):
        	//caso 2 Terminar metodo para poder ingresar busquedas
        	archivo.canRead(true);
        	System.out.println("Ha ingresado la opcion para Buscar Datos\n"
        			+ "Ingrese la opcion por como desea realizar la busqueda\n"
        			+ "1.- Busqueda por Descripcion\n"
        			+ "2.- Busqueda por Categoria\n"
        			+ "3.- Busqueda por Precio");
        	entrada = X.readLine();
        	option = Integer.parseInt(entrada);
        	switch(option) {
        	case(1):
        		System.out.println("Ingrese la Descripcion del producto");
        		Descripcion = X.readLine();
        		BuscarPalabra(archivo, Descripcion);
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