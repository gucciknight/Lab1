/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package mdlab1induccion1;

/**
 *
 * @author EMirandaQ
 */
import javax.swing.JOptionPane;
public class Menu {
     String Dato, op1, op2, op3, op4;
    int mseleccion;


    public Menu() {

        op1 = "Opcion Generica 1";
        op2 = "Opcion Generica 2";
        op3 = "Opcion Generica 3";
        op4 = "Opcion Generica 4";
    }

    public int selecciona(String opc1){
        op1 = opc1;

        Dato=JOptionPane.showInputDialog("1: " + op1 );
        mseleccion = Integer.parseInt(Dato);
        return mseleccion;
    }
    public int selecciona(String opc1, String opc2){
        op1 = opc1;
        op2 = opc2;

        Dato=JOptionPane.showInputDialog("1: " + op1 + "\n"
                                      +"2: " + op2 + "\n"
                                      +"0: Salir");
        mseleccion = Integer.parseInt(Dato);
        return mseleccion;
    }
    public int selecciona(String opc1, String opc2, String opc3){
        op1 = opc1;
        op2 = opc2;
        op3 = opc3;
        Dato=JOptionPane.showInputDialog("1: " + op1 + "\n"
                                      +"2: " + op2 + "\n"
                                      +"3: " + op3 + "\n"
                                      +"0: Salir");
        mseleccion = Integer.parseInt(Dato);
        return mseleccion;
    }
    public int selecciona(String opc1, String opc2, String opc3, String opc4){
        op1 = opc1;
        op2 = opc2;
        op3 = opc3;
        op4 = opc4;
        Dato=JOptionPane.showInputDialog("1: " + op1 + "\n"
                                      +"2: " + op2 + "\n"
                                      +"3: " + op3 + "\n"
                                      +"4: " + op4 + "\n"
                                      +"0: Salir");
        mseleccion = Integer.parseInt(Dato);
        return mseleccion;

    }
}
