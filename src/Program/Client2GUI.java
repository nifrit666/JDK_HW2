
package Program;

import javax.swing.*;
import java.awt.*;

public class Client2GUI extends JFrame {
    private ClientController clientController;

    public Client2GUI(ServerController serverController) {
        clientController = new ClientController(serverController, "User2", Color.GREEN, Color.BLACK, 600);
    }
}



