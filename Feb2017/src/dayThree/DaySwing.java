package dayThree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Created by student on 15/02/2017.
 */
public class DaySwing {
    JFrame mainFrame;
    JButton goodBtn, badBtn;

    public DaySwing () {
        mainFrame = new JFrame("Message of the Day");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //need to set close operation when using JFRAME
        mainFrame.setSize(250, 100); //(width,height)
        mainFrame.setLayout(new FlowLayout(1,5,5));

        Dimension dimension = mainFrame.getToolkit().getScreenSize();
        mainFrame.setLocation(
                dimension.width / 2 - mainFrame.getWidth() / 2, //dimension of screen - dimension of program to run in middle of screen
                dimension.height / 2 - mainFrame.getHeight() / 2
        );

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        //set key event
        fileMenu.setMnemonic(KeyEvent.VK_F);

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setMnemonic(KeyEvent.VK_X);
        exitMenuItem.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
           }
    });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        mainFrame.setJMenuBar(menuBar);

        //Good Button
        goodBtn = new JButton("Good");
        goodBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Today is a good day!");
            }
        });
        mainFrame.getContentPane().add(goodBtn);

        //Bad Button
        badBtn = new JButton("Bad");
        badBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Today is a bad day!");
            }
        });

        mainFrame.getContentPane().add(badBtn);

        mainFrame.setVisible(true);
    }

    public static void main(String[] args){
        new DaySwing();
    }

    }



