/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankkartyas;

import alaposztalyok.Bankkartya;
import feluletek.MainFrame;

/**
 *
 * @author Sandor
 */
public class Bankkartyas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        new Vezerles().start();
        Bankkartya.setLIMIT(50000);
        new MainFrame();
        new Vezerles().start();
    }

}
