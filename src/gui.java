import javax.swing.*;
import javax.swing.text.DefaultCaret;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import java.util.Timer;
 
public class gui extends JFrame{
    public static boolean RIGHT_TO_LEFT = false;
     
    public static void addComponentsToPane(Container pane) {
         
        if (!(pane.getLayout() instanceof BorderLayout)) {
            pane.add(new JLabel("Container doesn't use BorderLayout!"));
            return;
        }
         
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(
                    java.awt.ComponentOrientation.RIGHT_TO_LEFT);
        }
         
        JTextField systeminfo = new JTextField("Welcome "+System.getProperty("user.name")+"."+
        "JARVIS runs on "+System.getProperty("os.name"));
        pane.add(systeminfo, BorderLayout.PAGE_START);
        final textpanel tp2 = new textpanel(null);
        tp2.setBackground(Color.black);
        tp2.setForeground(Color.green);
        pane.add(tp2, BorderLayout.LINE_START);
		DefaultCaret caret = (DefaultCaret)tp2.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        JButton button = new JButton("Matrix!");

        // Timer for matrix
        class Matrix extends TimerTask {
        	private int counter = 0;
            public void run() {
            	   tp2.matrix();
               
            }
         }
        Timer timer = new Timer();
        timer.schedule(new Matrix(), 0, 500);
        
        pane.add(button, BorderLayout.LINE_END);
         
    }
     
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    static void createAndShowGUI() {
         
        //Create and set up the window.
        gui frame = new gui();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
        //Use the content pane's default BorderLayout. No need for
        //setLayout(new BorderLayout());
        //Display the window.
        //frame.pack();
        frame.setVisible(true);
    }
     
   
}