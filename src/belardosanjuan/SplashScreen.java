package belardosanjuan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SplashScreen {
    public static void show() {
        // Create a new panel for the splash screen
        JPanel splashPanel = new JPanel(new BorderLayout());
        JLabel splashLabel = new JLabel(new ImageIcon("resources/giphy.gif"));
        JProgressBar progressBar = new JProgressBar(0, 100);

        splashPanel.add(splashLabel, BorderLayout.CENTER);
        splashPanel.add(progressBar, BorderLayout.SOUTH);

        // Set up a new JFrame to display the splash screen
        JFrame splashFrame = new JFrame();
        splashFrame.getContentPane().add(splashPanel);
        splashFrame.setUndecorated(true);
        splashFrame.setSize(800, 450);
        splashFrame.setLocationRelativeTo(null);
        splashFrame.setVisible(true);

        // Simulate loading progress with a timer
        Timer timer = new Timer(35, new ActionListener() {
            int progress = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                progressBar.setValue(progress++);
                if (progress > 100) {
                    ((Timer) e.getSource()).stop();
                    splashFrame.dispose();
                }
            }
        });
        timer.start();
    }
}