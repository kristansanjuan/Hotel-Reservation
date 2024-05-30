package belardosanjuan;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class SplashScreen1 {
    private static JFrame splashFrame;
    private static JLabel splashLabel;
    private static JLabel textLabel;
    private static JProgressBar progressBar;
    private static String[] texts = {
            "Fetching available rooms...",
            "Fetching available necessities...",
            "Finalizing..."
    };
    private static int currentIndex;

    public static void showAndOpenHomepage() {
        showSplashScreen();
    }

    private static void showSplashScreen() {
        // Set up the splash screen frame
        splashFrame = new JFrame();
        splashFrame.setUndecorated(true);
        splashFrame.setSize(800, 570);
        splashFrame.setLocationRelativeTo(null);
        splashFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up the splash screen panel
        JPanel splashPanel = new JPanel(new BorderLayout());

        // Set up the splash screen label
        splashLabel = new JLabel();
        splashLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Load the GIF image
        ImageIcon imageIcon = new ImageIcon("C:/Users/nagat/Documents/NetBeansProjects/BelardoSanJuan/resources/hotelgif.gif");
        if (imageIcon != null) {
            splashLabel.setIcon(imageIcon);
        } else {
            splashLabel.setText("Error loading image");
        }

        // Set up the text label
        textLabel = new JLabel();
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        // Set up the progress bar
        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setVisible(true); // Show the progress bar initially

        // Add the labels and progress bar to the splash panel
        splashPanel.add(splashLabel, BorderLayout.CENTER);
        splashPanel.add(textLabel, BorderLayout.SOUTH);
        splashPanel.add(progressBar, BorderLayout.NORTH);

        // Add the panel to the splash frame
        splashFrame.getContentPane().add(splashPanel);
        splashFrame.setVisible(true);

        // Start the SwingWorker
        new SplashScreenWorker().execute();

        // Delay for 5 seconds before opening the homepage
        int delay = 10000; // 5 seconds
        Timer timer = new Timer(delay, e -> openHomepage());
        timer.setRepeats(false);
        timer.start();
    }

    private static void updateTextAndProgressBar(int progress, String text) {
        progressBar.setValue(progress);
        textLabel.setText(text);
    }

    private static void openHomepage() {
        // Dispose the splash frame
        splashFrame.dispose();

        // Create an instance of the Homepage class
        Homepage homepage = new Homepage();
        homepage.homepageFrame.setVisible(true);
    }

    private static class SplashScreenWorker extends SwingWorker<Void, String> {
        @Override
        protected Void doInBackground() throws Exception {
            int totalSteps = texts.length;
            int progressStep = 100 / totalSteps;

            for (int i = 0; i < totalSteps; i++) {
                String text = texts[i];
                int progress = (i + 1) * progressStep;
                publish(text);
                setProgress(progress);
                Thread.sleep(2000); // Delay for 2 seconds
            }

            return null;
        }

        @Override
        protected void process(List<String> chunks) {
            String latestText = chunks.get(chunks.size() - 1);
            updateTextAndProgressBar(getProgress(), latestText);
        }

        @Override
        protected void done() {
            // No need to open the homepage here as it will be opened after the delay
        }
    }
}