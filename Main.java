import parking.*;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ParkingLot lot = new ParkingLot(); 

            // Open GUI window
            new MainFrame(lot).setVisible(true);
        });
    }
}
