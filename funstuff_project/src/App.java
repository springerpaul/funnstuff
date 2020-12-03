import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int x = getScreenWidth();
        int y = getScreenHeight();

        System.out.println("ScreenSize detected: " + x + " by " + y);


        JFrame f = new JFrame("Window");
        Container cp = f.getContentPane();
        cp.setLayout(new BorderLayout());
        
        f.setExtendedState(JFrame.MAXIMIZED_BOTH); 

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel text = new JLabel("Mama ich hab Angst");
        cp.add(text, BorderLayout.NORTH);

        JLabel text1 = new JLabel("Mama ich hab Angst");
        cp.add(text1, BorderLayout.SOUTH);

        JLabel text2 = new JLabel("Mama ich hab Angst");
        cp.add(text2, BorderLayout.WEST);

        JLabel text3 = new JLabel("Mama ich hab Angst");
        cp.add(text3, BorderLayout.EAST);

        JLabel text4 = new JLabel("Mama ich hab Angst");
        cp.add(text4, BorderLayout.CENTER);

        f.setVisible(true);








    }

    private static int getScreenWidth() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = screenSize.width; 

        return x;
    }

    private static int getScreenHeight() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int y = screenSize.height; 

        return y;
    }


    
}
