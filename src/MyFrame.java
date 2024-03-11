import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    JButton button1;
    MyFrame() {

        ImageIcon image = new ImageIcon("DzDm.jpg");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button1 = new JButton("Submit");
        button1.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));

        this.add(textField);
        this.add(button1);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            System.out.println(textField.getText());
        }
    }
}
