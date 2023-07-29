import javax.swing.*;
import java.awt.*;

public class WindowComponents extends JFrame {
    private Font font, pointFont;
    private JLabel computerInfo, playerInfo, pointInfoComputer, pointInfoPlayer;
    private int point = 0, rockInt, paperInt, scissorInt, rockIntComp, paperIntComp, scissorIntComp, randomComp, computerPoint = 0;
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

        pointInfoComputer = new JLabel("points: " + computerPoint);
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
           randomComp = (int) (Math.random() * 3);
           rock = new JButton();
           rock.setIcon(imageRock);
           rock.setBounds(270, 270, 50, 50);
           rock.addActionListener(e -> {
               try {
                   randomComp = (int) (Math.random() * 3);
                   questionMark.setIcon(imageRock);
                   scissorInt = 0;
                   rockInt = 1;
                   paperInt = 2;
                   switch (randomComp) {
                       case 0:
                           questionMarkComp.setIcon(imageRock);
                           rockIntComp = 1;
                           if (rockInt == rockIntComp) {
                               System.out.print("draw!");
                           }
                           break;
                       case 1:
                           questionMarkComp.setIcon(imageScissors);
                           scissorIntComp = 0;
                           if (rockInt > scissorIntComp) {
                               System.out.println("you win!");
                               point++;
                               pointInfoPlayer.setText("point: " + point);
                           }
                           break;
                       case 2:
                           questionMarkComp.setIcon(imagePaper);
                           paperIntComp = 2;
                           if (rockInt < paperInt) {
                               System.out.println("you lose!");
                               computerPoint++;
                               pointInfoComputer.setText("point: " + computerPoint);
                           }
                           break;
                   }


               } catch (Exception exception) {

               }
           });

           scissors = new JButton();
           scissors.setIcon(imageScissors);
           scissors.setBounds(330, 270, 50, 50);
           scissors.addActionListener(e -> {
               try {
                   randomComp = (int) (Math.random() * 3);
                   questionMark.setIcon(imageScissors);
                   scissorInt = 1;
                   rockInt = 2;
                   paperInt = 0;
                   switch (randomComp) {
                       case 0:
                           questionMarkComp.setIcon(imageRock);
                           rockIntComp = 2;
                           if (rockIntComp > scissorInt) {
                               System.out.print("you lose!");
                               computerPoint++;
                               pointInfoComputer.setText("point: " + computerPoint);
                           }
                           break;
                       case 1:
                           questionMarkComp.setIcon(imageScissors);
                           scissorIntComp = 1;
                           if (scissorIntComp == scissorInt) {
                               System.out.println("draw!");
                           }
                           break;
                       case 2:
                           questionMarkComp.setIcon(imagePaper);
                           paperIntComp = 0;
                           if (paperInt < scissorIntComp) {
                               System.out.println("you wim!");
                               point++;
                               pointInfoPlayer.setText("point: " + point);
                           }
                           break;
                   }
               } catch (Exception exception) {

               }
           });
        paper = new JButton();
        paper.setIcon(imagePaper);
        paper.setBounds(390, 270, 50,50);
        paper.addActionListener(e -> {
                    try {
                        randomComp = (int) (Math.random() * 3);
                        questionMark.setIcon(imagePaper);
                        scissorInt = 2;
                        rockInt = 0;
                        paperInt = 1;
                        switch (randomComp) {
                            case 0:
                                questionMarkComp.setIcon(imageRock);
                                rockIntComp = 0;
                                if (rockIntComp < paperInt) {
                                    System.out.print("you win!");
                                    point++;
                                    pointInfoPlayer.setText("point: " + point);
                                }
                                break;
                            case 1:
                                questionMarkComp.setIcon(imageScissors);
                                scissorIntComp = 2;
                                if (scissorIntComp > paperInt) {
                                    System.out.println("you lose");
                                    computerPoint++;
                                    pointInfoComputer.setText("point: " + computerPoint);
                                }
                                break;
                            case 2:
                                questionMarkComp.setIcon(imagePaper);
                                paperIntComp = 0;
                                if (paperInt == paperIntComp) {
                                    System.out.println("draw!");
                                }
                                break;
                        }
                    } catch (Exception exception) {
                    }
                });


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

