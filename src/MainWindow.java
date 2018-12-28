import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 320);
        setLocation(400, 400);
        add(new game());
        setVisible(true);
    }

    public static void main(String[] args){
        MainWindow mw = new MainWindow();
    }
}
