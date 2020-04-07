import java.io.IOException;
import javax.swing.JOptionPane;

public class Laboratorio1{

    public static void main(String[] args){
        String mensaje = "Trabajo 1 de laboratorio", autor = "Agustín Rodríguez, Aldo Villanueva y Daniel Durán";
        String msg1, msg2, msg3;
        boolean parar=true;
        int seleccionado;
        Bienvenida bvda2 = new Bienvenida(mensaje, autor);
        bvda2.muestramensaje();
        msg1= " modificar datos";
        msg2= " buscar datos";
        msg3= " otras funciones";

        Menu men = new Menu();
        do{
        seleccionado = men.selecciona(msg1, msg2, msg3);
        switch (seleccionado){
          case(0): parar = false;
          break;
          case(1): parar = false;
          break;
          case(2): parar = false;
          break;
          case(3): parar = false;
          break;
          }
        } while(parar);
    }
}
