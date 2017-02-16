package dayThree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by student on 15/02/2017.
 */
public class GuessGame {
    //random number object generator
    private Random random = new Random();
    int generatedNumber, userInput;
    private JFrame mainFrame;
    private JTextField guessInput;
    private JLabel lbl1, lbl2, resultlbl;
    private JButton newGameBtn;

    //constructor
    public GuessGame() {
        //set the GUI: JFrame, JLabel, JTextField, JButton

        //set the GUI: JFrame
        mainFrame = new JFrame("Guessing Game");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //need to set close operation when using JFRAME
        mainFrame.setLayout(new FlowLayout(5, 5, 5));

        //label
        lbl1 = new JLabel("I have a number between 1 and 100.");
        lbl2 = new JLabel("Can you guess the number? Enter your guess:");

        guessInput = new JTextField(10);
        guessInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    userInput = Integer.parseInt(guessInput.getText());
                    match();
                    guessInput.selectAll();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Your input: " + guessInput.getText() + " is not a number between 1 - 100!");
                }
            }
        });

        //resultLbl
        resultlbl = new JLabel("Result appears here...");

        newGameBtn = new JButton("New Game");
        newGameBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultlbl.setText("Guess Result");
                guessInput.setText("");
                guessInput.setEditable(true);
                generate();
                mainFrame.repaint();
            }
        });

        Dimension dimension = mainFrame.getToolkit().getScreenSize();
        mainFrame.setLocation(
                dimension.width / 2 - mainFrame.getWidth() / 2, //dimension of screen - dimension of program to run in middle of screen
                dimension.height / 2 - mainFrame.getHeight() / 2
        );
        mainFrame.setSize(600, 150);

        mainFrame.getContentPane().add(lbl1);
        mainFrame.getContentPane().add(lbl2);
        mainFrame.getContentPane().add(guessInput);
        mainFrame.getContentPane().add(resultlbl);
        mainFrame.getContentPane().add(newGameBtn);

        mainFrame.setVisible(true);

        generate();


    }

    //method to generate number
    private void generate() {
        generatedNumber = random.nextInt(100) + 1;
    }

    private void match() {
        //match the generated number with user input
        //set label to produce result
        //JFrame method called repaint();
        if (userInput > 100 || userInput < 1) {
            resultlbl.setText("Your number is not in the random number scope.");
            guessInput.setEditable(false);
        } else {
            if (userInput > generatedNumber)
                resultlbl.setText("Incorrect, your number is too high");
            else if (userInput < generatedNumber)
                resultlbl.setText("Incorrect, your number is too low");
            else {
                resultlbl.setText("");
                guessInput.setEditable(false);
                JOptionPane.showMessageDialog(null, "That number is correct!!");
            }
        }
        mainFrame.repaint();

    }

    public static void main(String[] args) {
        new GuessGame();
    }
}