import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JLabel inputLabel, resultLabel;
    private JTextField number1Field, number2Field, resultField;
    private JButton addButton, subButton;


    Calculator() {
        frame = new JFrame("Calculator");
        panel = new JPanel();


        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        inputLabel = new JLabel("Numbers: ");
        inputLabel.setBounds(10,45,80,25);
        panel.add(inputLabel);

        resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(10,150,80,25);
        panel.add(resultLabel);

        number1Field = new JTextField();
        number1Field.setBounds(100,45,80,25);
        panel.add(number1Field);

        number2Field = new JTextField();
        number2Field.setBounds(235,45,80,25);
        panel.add(number2Field);

        addButton = new JButton("+");
        addButton.setBounds(150,90,45,35);
        addButton.setFocusable(false);
        addButton.addActionListener(this);
        panel.add(addButton);

        subButton = new JButton("-");
        subButton.setBounds(220,90,45,35);
        subButton.setFocusable(false);
        subButton.addActionListener(this);
        panel.add(subButton);

        resultField = new JTextField();
        resultField.setBounds(160,150,100,25);
        panel.add(resultField);



        panel.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator clctr = new Calculator();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addButton){
            resultField.setText(String.valueOf(Integer.parseInt(number1Field.getText()) + Integer.parseInt(number2Field.getText())));
            number2Field.setText("");
            number1Field.setText("");
        }

        else if(e.getSource() == subButton){
            resultField.setText(String.valueOf(Integer.parseInt(number1Field.getText()) - Integer.parseInt(number2Field.getText())));
            number2Field.setText("");
            number1Field.setText("");
        }
    }
}