package Program;

import GUI.GUI;

public class ProgramStart {

    public static void main (String[] args) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });

    }

}
