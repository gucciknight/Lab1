import java.io.*;
import java.util.ArrayList;
class Conversor{
    public static void main(String [] args) throws IOException{
    BufferedReader X = new BufferedReader(new InputStreamReader(System.in));
    //categorias son 3 Descripcion | Categoria | Precio | Local
    File archivo = new File("Productors de Construccion.txt");
    FileWriter Escritura = new FileWriter("Productors de Construccion.txt");
    FileReader Lectura = new FileReader("Productors de Construccion.txt");
    //SE ARREGLO PARA QUE SE PUEDAN INGRESAR LOS 4 TIPOS DE DATOS
    String[] ListadoyDescripcion = new String[3];
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
    int LineasTotales;
    int TotalDeCoincidencias;
    String Descripcion;
    String Categoria;
    int Precio;
    String ID;
    // metodo para buscar palabras tanto descripcion como precio como categoria
    public static void BuscarPalabra(File archivo, String palabra) {
    	try {
    		if(archivo.exists()) {
    			BufferedReader LeerArchivo = new BufferedReader(new FileReader("Productos de Construccion.txt"));
    			String LineaLeida;
    			while((LineaLeida = LeerArchivo.readLine() != null)) {
    				LineasTotales = LineasTotales + 1;
    				String[] palabras = LineaLeida.split(" ");
    				for(int z = 0; z < palabras.length; z++) {
    					if(palabras[z].equals(palabra)) {
    						TotalDeCoincidencias = TotalDeCoincidencia + 1;
    						System.out.println(LineaLeida+"\n"
    								+ "En la linea "+ LineasTotales +" se encontro la palabra "+ TotalDeCoincidencias +" veces");
    						
    					}
    				}
    			}
    		}
    		System.out.println("En total se encontro la palabra "+ Descripcion + ", " + TotalDeCoincidencias);
    	}catch(Exception e){
    		System.out.println(e.getMessage());
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
        		// NO ENCUENTRO COMO PODER BUSCAR EL ID DENTRO DE LA BASE DE DATOS ES DECIR SU POSICION.
        		archivo.write(IDMAX + 1,",",ListadoyDescripcion[0],",",ListadoyDescripcion[1],",",ListadoyDescripcion[2]);
        	}else {
        		System.out.println("Ha eliminado todos los datos ingresados");
        	}
        	Escritura.close();
            break;
        case(2):
        	//METODO BUSCAR PALABRA PARA BUSCAR PALABRAS EN ESPECIFICO
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
        		palabra = Descripcion;
        		BuscarPalabra(archivo, palabra);
        		Lectura.close();
        		break;
        	case(2):
        		System.out.println("Ingrese la Categoria del producto");
        		Categoria = X.readLine();
        		palabra = Categoria;
        		BuscarPalabra(archivo, palabra);
        		Lectura.close();
        		break;
        	case(3):
        		System.out.println("Ingrese el Precio del producto");
        		entrada = X.readLine();
        		Precio = Integer.parseInt(entrada);
        		palabra = Precio;
        		BuscarPalabra(archivo, palabra);
        		Lectura.close();
        		break;
        	}
            break;
        case(3):
        	//Eliminacion de datos
        	archivo.canRead(true);
        	System.out.println("Ha ingresado a la opcion para Borrar datos por lo que debe ingresar el dato a eliminar\n"
        			+ "1.- Ingrese la Descripcion\n"
        			+ "2.- Ingrese ID");
        	entrada = X.readLine();
        	option = Integer.parseInt(entrada);
        	switch(option) {
        	//OPCION POR DESCRIPCION
        		case(1):
        			System.out.println("Ingrese la Descripcion del Producto");
	        		Descripcion = X.readLine();
	        		palabra = Descripcion;
	        		BuscarPalabra(archivo, palabra);
	        		Lectura.close();
        			break;
            //OPCION POR ID
        		case(2):
        			System.out.println("Ingrese el ID del Producto");
	        		ID = X.readLine();
	        		palabra = ID;
	        		BuscarPalabra(archivo, palabra);
	        		Lectura.close();
        			break;
        	}
            break;
    }
    }}