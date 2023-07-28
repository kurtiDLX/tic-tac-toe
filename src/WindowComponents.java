import javax.swing.*;
import java.awt.*;

public class WindowComponents extends JFrame {
    private Font font, pointFont;
    private JLabel computerInfo, playerInfo, pointInfoComputer, pointInfoPlayer;
    private int point = 0;
    public WindowComponents(){
        super("tic-tac-toe");
        setLayout(null);

        font = new Font("Arial", Font.BOLD, 23);
        pointFont = new Font("Arial", font.BOLD, 14);

        computerInfo = new JLabel("computer");
        computerInfo.setFont(font);
        computerInfo.setBounds(180, -10, 130, 100);

        playerInfo = new JLabel("player");
        playerInfo.setFont(font);
        playerInfo.setBounds(computerInfo.getX(), computerInfo.getY() + 270, 100, 100);

        pointInfoComputer = new JLabel("points: " + point);
        pointInfoComputer.setFont(pointFont);
        pointInfoComputer.setBounds(180, 20 , 100, 100);

        pointInfoPlayer = new JLabel("points: " + point);
        pointInfoPlayer.setFont(pointFont);
        pointInfoPlayer.setBounds(180, 230 , 100, 100);

        add(pointInfoPlayer);
        add(pointInfoComputer);
        add(playerInfo);
        add(computerInfo);
    }
}
