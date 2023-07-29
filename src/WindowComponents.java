import javax.swing.*;
import java.awt.*;

public class WindowComponents extends JFrame {
    private Font font, pointFont;
    private JLabel computerInfo, playerInfo, pointInfoComputer, pointInfoPlayer;
    private int point = 0;
    private JButton rock, scissors, paper, questionMark,questionMarkComp;
    private ImageIcon imageRock, imagePaper, imageScissors,gmStartImg;
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

        imageScissors = new ImageIcon("src/scissors.jpg");
        imagePaper = new ImageIcon("src/paper.jpg");
        imageRock = new ImageIcon("src/rock.jpg");
        gmStartImg = new ImageIcon("src/questionmark.jpg");

        questionMark = new JButton();
        questionMark.setIcon(gmStartImg);
        questionMark.setBounds(180, 200, 65,65);
        questionMark.setBorderPainted(false);

        questionMarkComp = new JButton();
        questionMarkComp.setIcon(gmStartImg);
        questionMarkComp.setBounds(180, 85, 65,65);
        questionMarkComp.setBorderPainted(false);

        rock = new JButton();
        rock.setIcon(imageRock);
        rock.setBounds(270, 270, 50 ,50);

        scissors = new JButton();
        scissors.setIcon(imageScissors);
        scissors.setBounds(330, 270, 50, 50);

        paper = new JButton();
        paper.setIcon(imagePaper);
        paper.setBounds(390, 270, 50,50);


        add(questionMarkComp);
        add(questionMark);
        add(paper);
        add(scissors);
        add(rock);

        add(pointInfoPlayer);
        add(pointInfoComputer);

        add(playerInfo);
        add(computerInfo);
    }
}
