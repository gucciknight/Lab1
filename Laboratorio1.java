import java.io.IOException;
import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.FileReader;

public class Laboratorio1{

    public static void main(String[] args){
        String mensaje = "Trabajo 1 de laboratorio", autor = "Agustín Rodríguez, Aldo Villanueva y Daniel Durán";
        String msg1, msg2, msg3, msg4, msg5, msg6, msg7, msg8, msg9, msg10;
        boolean parar = true;
        int seleccionado1, seleccionado2, seleccionado3;
        Bienvenida bvda2 = new Bienvenida(mensaje, autor);
        bvda2.muestramensaje();
        msg1 = "Modificar datos";
        msg2 = "Buscar datos";
        msg3 = "Otras funciones";
        msg4 = "Ingrese dato";
        msg5 = "Elimine dato";
        msg6 = "Edite dato";
        msg7 = "Encontrar la posicion del valor mayor";
        msg8 = "Encontrar la posicion del valor menor";
        msg9 = "Contar cuantos valores son mas altos que cierto valor";
        msg10 = "contar cuandos valores son mas bajos que cierto valor";
        Texto texto = new Texto();
        texto.cargarArrays();
        
        Menu men = new Menu();
        do{
        seleccionado1 = men.selecciona(msg1, msg2, msg3);
        switch (seleccionado1){
          //modificar
          case(1):
          Menu modificar = new Menu();
          do{
          seleccionado2 = modificar.selecciona(msg4, msg5, msg6);
          switch(seleccionado2) {
            //ingresar dato
            case(1): parar = false;
            break;
            //eliminar dato
            case(2): parar = false;
            break;
            //editar dato
            case(3): parar = false;
            break;
            default: parar = false;
            break;
          }
        } while(parar);
          break;
          //buscar
          case(2): parar = false;
          break;
          case(3):
          //otras funciones
          Menu otrasFunciones = new Menu();
          do{
          seleccionado3 = otrasFunciones.selecciona(msg7, msg8, msg9, msg10);
          switch(seleccionado3) {
            //encontrar pos valor mayor
            case(1): System.out.println("hola");
            break;
            //encontrar pos valor menor
            case(2): parar = false;
            break;
            //encontrar cuantos valores son mas altos que cierto valor
            case(3): parar = false;
            break;
            //cuantos valores son menores que cierto valor
            case(4): parar = false;
            break;
            default: parar = false;
            break;
          }
        } while(parar);
          break;
          default: JOptionPane.showMessageDialog(null, "Ingrese Solo Opciones Validas", "Error de Ingreso", JOptionPane.PLAIN_MESSAGE);
          break;
          }
        } while(parar);
    }
}
