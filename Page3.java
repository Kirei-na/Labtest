import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page3 extends JFrame implements ActionListener {

    private JButton totalPriceLabel;
    private double quantity1 = 1;
    private double quantity2 = 1;
    private double quantity3 = 1;
    private double quantity4 = 1;
    private double quantity5 = 1;

    public Page3() {
        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        // PANEL 1
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(6, 3));
        p1.add(new JLabel(""));
        p1.add(new JLabel(""));
        p1.add(new JLabel("QUANTITY"));

        // japan
        ImageIcon jpn = new ImageIcon("C:\\Users\\ajkam\\Desktop\\kerja\\java\\example\\GROUP\\oden.jpg");
        JLabel food1 = new JLabel();
        food1.setIcon(jpn);
        p1.add(food1);
        JLabel price1 = new JLabel("ODEN   RM13.00");
        p1.add(price1);
        JTextField menu1 = new JTextField("");
        p1.add(menu1);
        menu1.addActionListener(this);

        // korea
        ImageIcon kor = new ImageIcon("C:\\Users\\ajkam\\Desktop\\kerja\\java\\example\\GROUP\\galbi.jpg");
        JLabel food2 = new JLabel();
        food2.setIcon(kor);
        p1.add(food2);
        JLabel price2 = new JLabel("GALBI   RM15.00");
        p1.add(price2);
        JTextField menu2 = new JTextField("");
        p1.add(menu2);
        menu2.addActionListener(this);

        // malaysia
        ImageIcon may = new ImageIcon("C:\\Users\\ajkam\\Desktop\\kerja\\java\\example\\GROUP\\nasilemak.jpg");
        JLabel food3 = new JLabel();
        food3.setIcon(may);
        p1.add(food3);
        JLabel price3 = new JLabel("NASI LEMAK   RM6.00");
        p1.add(price3);
        JTextField menu3 = new JTextField("");
        p1.add(menu3);
        menu3.addActionListener(this);

        // india
        ImageIcon ind = new ImageIcon("C:\\Users\\ajkam\\Desktop\\kerja\\java\\example\\GROUP\\capati.jpg");
        JLabel food4 = new JLabel();
        food4.setIcon(ind);
        p1.add(food4);
        JLabel price4 = new JLabel("CAPATI   RM5.00");
        p1.add(price4);
        JTextField menu4 = new JTextField("");
        p1.add(menu4);
        menu4.addActionListener(this);

        // china
        ImageIcon chi = new ImageIcon("C:\\Users\\ajkam\\Desktop\\kerja\\java\\example\\GROUP\\ding.jpg");
        JLabel food5 = new JLabel();
        food5.setIcon(chi);
        p1.add(food5);
        JLabel price5 = new JLabel("DING BIAN HU   RM12.00");
        p1.add(price5);
        JTextField menu5 = new JTextField("");
        p1.add(menu5);
        menu5.addActionListener(this);

        // background
        p1.setBackground(Color.lightGray);
        container.add(p1, BorderLayout.CENTER);

        // PANEL 2
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        JLabel Enter = new JLabel("Select Your Preferred Menu");
        Enter.setFont(new Font("Select Your Preferred Menu", Font.PLAIN, 30));
        p2.add(Enter);
        p2.setBackground(Color.lightGray);
        container.add(p2, BorderLayout.NORTH);

        // PANEL 3
       JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(4, 1));
        p3.add(new JLabel("Calculate"));

        // Total price label
        totalPriceLabel = new JButton("Total price");
        p3.add(totalPriceLabel);
        totalPriceLabel.addActionListener(this);

        // Discount label
        JButton discountLabel = new JButton("Discount: ");
        p3.add(discountLabel);

        // Net price label
        JButton netPriceLabel = new JButton("Net price: ");
        p3.add(netPriceLabel);

        container.add(p3, BorderLayout.EAST);
    }

    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();

        if (source == totalPriceLabel) {
            calculateAndPassTotalPrice();
        }
        else {
            JTextField textField = (JTextField) source;
            try {
                int quantity = Integer.parseInt(textField.getText());
                updateQuantity(textField, quantity);
            } catch (NumberFormatException e) {
                textField.setText("0");
            }
        }
    }

    private void updateQuantity(JTextField textField, int quantity) {
        if (textField == menu1) {
            quantity1 = quantity;
        } else if (textField == menu2) {
            quantity2 = quantity;
        } else if (textField == menu3) {
            quantity3 = quantity;
        } else if (textField == menu4) {
            quantity4 = quantity;
        } else if (textField == menu5) {
            quantity5 = quantity;
        }
    }

    private double calculateTotalPrice() {
        double totalPrice = 0;

        totalPrice += quantity1 * 13.0;
        totalPrice += quantity2 * 15.0;
        totalPrice += quantity3 * 6.0;
        totalPrice += quantity4 * 5.0;
        totalPrice += quantity5 * 12.0;

        return totalPrice;
    }

    private void calculateAndPassTotalPrice() {
        double totalPrice = calculateTotalPrice();
        gui test = new gui(totalPrice);
        test.setTitle("calculate");
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setSize(600, 400);
        test.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args) {
        Page3 page3 = new Page3();
        page3.setTitle("Page3");
        page3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        page3.setSize(600, 400);
        page3.setVisible(true);
    }
}