import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page2 extends JFrame implements ActionListener{

	private JButton button2;

	public Page2(){
		Container container=getContentPane();
		container.setLayout(new BorderLayout());

		//PANEL 1
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(1,3));
        p1.add(new JLabel(""));
        JLabel Enter=new JLabel("Please Enter Your:");
        Enter.setFont(new Font("Please Enter Your:",Font.PLAIN,20));
        p1.add(Enter);
        p1.add(new JLabel(""));
        p1.setBackground(Color.lightGray);
        container.add(p1,BorderLayout.NORTH);

		//PANEL 2
        JPanel p2=new JPanel();
        p2.setLayout(new GridLayout(2,2));
        JTextField seat=new JTextField("");
        JTextField pax=new JTextField("");
        p2.add(new JLabel("Seat Number"));
        p2.add(new JLabel("Number of Pax"));
        p2.add(seat);
        p2.add(pax);
        p2.setBackground(Color.lightGray);
        container.add(p2,BorderLayout.CENTER);

        //panel 3
        JPanel p3=new JPanel();
        p3.setLayout(new GridLayout(2,3));
        p3.add(new JLabel(""));
        button2=new JButton("ENTER");
        p3.add(button2);
        p3.add(new JLabel(""));
        p3.add(new JLabel(""));
        p3.add(new JLabel(""));
        p3.setBackground(Color.lightGray);
        container.add(p3,BorderLayout.SOUTH);
        button2.addActionListener(this);
}
    public void actionPerformed(ActionEvent event) {
        Object source=event.getSource();

        if (source==button2) {
        Page3 test=new Page3();
            test.setTitle("preferred menu");
            test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            test.setSize(600,400);
            test.setVisible(true);
            this.setVisible(false);
        }
    }
}