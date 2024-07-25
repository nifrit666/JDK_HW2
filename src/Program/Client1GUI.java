// Client1GUI.java
package Program;

import javax.swing.*;
import java.awt.*;

public class Client1GUI extends JFrame {
    private ClientController clientController;

    public Client1GUI(ServerController serverController) {
        clientController = new ClientController(serverController, "User1", Color.BLACK, Color.WHITE, 900);
    }
}



