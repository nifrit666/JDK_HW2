package Program;

import javax.swing.*;
import java.awt.*;

public class Client3GUI extends JFrame {

    private ClientController clientController;

    public Client3GUI(ServerController serverController) {
        clientController = new ClientController(serverController, "User3", Color.ORANGE, Color.BLACK, 300);
    }
}
