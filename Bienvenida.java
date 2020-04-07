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
import javax.swing.*;
public class Bienvenida {
    String tit , aut;

    public Bienvenida(String t, String a){

        tit = t;
        aut = a;
        }

    public Bienvenida(){

        tit = "Programa Generico";
        aut = "Anonimo";
        }

    public void muestramensaje() {


        JOptionPane.showMessageDialog(null, tit + "\n"
            + "Autor : " + aut, "Bienvenida", JOptionPane.PLAIN_MESSAGE);

        }
        public void muestramensaje(String t) {
            tit = t;

        JOptionPane.showMessageDialog(null, tit + "\n"
            , "Bienvenida", JOptionPane.PLAIN_MESSAGE);

        }
}
