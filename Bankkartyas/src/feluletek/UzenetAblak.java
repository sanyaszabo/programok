/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feluletek;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Sandor
 */
public class UzenetAblak extends JDialog {
    
    public UzenetAblak(String uzenet) {
        JPanel uzenetPanel = new JPanel(new BorderLayout());
        getContentPane().add(uzenetPanel);
        uzenetPanel.add(new JLabel(uzenet),BorderLayout.NORTH);
        final JButton okBtn = new JButton("OK");
        uzenetPanel.add(okBtn,BorderLayout.SOUTH);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(250,100);
        
        okBtn.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();                
            }
        });
        setVisible(true);
    }
    
}
