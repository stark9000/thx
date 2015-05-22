/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thx;

import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author stark
 */
public class Thx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            LookAndFeel lf = new NimbusLookAndFeel();
            UIManager.setLookAndFeel(lf);
        } catch (Exception e) {
        }
       new thx0().setVisible(true);
    }
}
