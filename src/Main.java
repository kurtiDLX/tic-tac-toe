import javax.swing.*;

public class Main {
    public static void main(String[]args){
        WindowComponents window = new WindowComponents();
        window.setSize(500,400);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}