/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feluletek;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Sandor
 */
public class MainFrame extends JFrame {

    private static final int MAGASSAG = 300;
    private static final int SZELESSEG = 400;
    private static final String ABLAK_CIM = "Bankkártyás feladat";

    public MainFrame() {
        setSize(SZELESSEG, MAGASSAG);
        setTitle(ABLAK_CIM);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(createTabbedPane(), java.awt.BorderLayout.CENTER);
        setVisible(true);

    }

    private Component createTabbedPane() {
        JTabbedPane tabPane = new JTabbedPane();
        tabPane.addTab("Szerződés", new Szerzodes());
        tabPane.addTab("Feltöltés", new Feltoltes());
        tabPane.addTab("Vásárlás", new Vasarlas());
        tabPane.addTab("Lekérdezés", new Lekerdezes());
        tabPane.addTab("Bank", new Bank());
        return tabPane;
    }

}
