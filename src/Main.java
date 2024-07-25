import Program.*;

public class Main {

    public static void main(String[] args) {
        ServerWindow serverWindow = new ServerWindow();
        ServerController serverController = new ServerController();
        new Client1GUI(serverController);
        new Client2GUI(serverController);
        new Client3GUI(serverController);


    }
}