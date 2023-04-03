import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GUI extends Frame implements ActionListener{
    JTextField userInputBox;
    JLabel message;
    JButton verifyButton, exitButton;

    public GUI(){
        
        //Frame instantiation
        JFrame f = new JFrame("Exercise 1");

        //TextField instantiation
        userInputBox = new JTextField("Enter an Integer");
        userInputBox.setBounds(20, 65, 150, 20); 

        //Verify int button instantiation
        verifyButton=new JButton("Verify Input");
        verifyButton.setBounds(20,100,100, 40);
        verifyButton.addActionListener(this);

        //Exit button instantiation
        exitButton = new JButton("Exit");
        exitButton.setBounds(150,100,100, 40);
        exitButton.addActionListener(this);

        //Label instantiation
        message = new JLabel("Enter an Integer in the box below");
        message.setBounds(20,20,450, 40);
        
        //Setting bounds and adding elements to frame
        f.add(verifyButton);f.add(userInputBox);f.add(message);f.add(exitButton);
        f.setSize(500,200);
        f.setLayout(null); 
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        //verify button action performed
        if (e.getSource()==verifyButton) {

            String userInput = userInputBox.getText(); //gets tetx that is typed in the text box

            try { //int check using parse and try/catch
                int UserInteger = Integer.parseInt(userInput);
                message.setText(UserInteger + " is a valid integer");
            } catch (NumberFormatException nfe){
                message.setText(userInput + " is not a valid Integer, try again");
            };

        }

        //exit button action performed
        else if(e.getSource()==exitButton){
            System.exit(0);
        }
    }

}
