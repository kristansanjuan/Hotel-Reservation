package belardosanjuan;

import java.util.ArrayList;
import javax.swing.*;
import static belardosanjuan.SplashScreen.show;

public class BelardoSanJuan {
    
    public static void main(String[] args) {
        show();
        ArrayList<String[]> users = new ArrayList<>();
        
        try {
                Thread.sleep(4800);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
        SwingUtilities.invokeLater(() -> {
            LoginFrame loginFrame = new LoginFrame(users);
            loginFrame.setVisible(true);
        });     
    }
}