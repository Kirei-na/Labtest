import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page1 extends JFrame implements ActionListener{

    private JButton button1;

    public Page1() {

        Container container=getContentPane();
        container.setLayout(new BorderLayout());

        // PANEL button
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(2,3));
        p1.add(new JLabel(""));
        button1=new JButton("ENTER");
        p1.add(button1);
        p1.add(new JLabel(""));
        p1.add(new JLabel(""));
        p1.add(new JLabel(""));
        p1.setBackground(Color.lightGray);
        container.add(p1,BorderLayout.SOUTH);
        button1.addActionListener(this);

        // welcome
        JPanel p2=new JPanel();
        p2.setLayout(new GridLayout(2,3));
        p2.add(new JLabel(""));
        JLabel welcomeLabel=new JLabel("WELCOME");
        welcomeLabel.setFont(new Font("WELCOME",Font.PLAIN,30));
        p2.add(welcomeLabel);
        p2.add(new JLabel(""));
        p2.add(new JLabel(""));
        p2.add(new JLabel("~Delightful Asian Restaurant~"));
        p2.setBackground(Color.lightGray);
        container.add(p2,BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent event) {
        Object source=event.getSource();

        if (source==button1) {
            Page2 test=new Page2();
            test.setTitle("Enter number");
            test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            test.setSize(600,400);
            test.setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {

        Page1 JFrame=new Page1();
        JFrame.setTitle("Ordering Menu");
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setSize(600,400);
        JFrame.setVisible(true);
    }
}