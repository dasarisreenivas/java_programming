import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
 
  private JTextField display;
  private double result;
  private String operator;
  private boolean start;
  
  public Calculator() {
    setTitle("Calculator");
    setSize(300, 300);
    setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(4, 4));
    
    String buttons[] = { "7", "8", "9", "+",
                        "4", "5", "6", "-",
                        "1", "2", "3", "*",
                        ".", "0", "=", "/" };
    
    display = new JTextField();
    display.setEditable(false);
    add(display, BorderLayout.NORTH);
    
    for (int i = 0; i < buttons.length; i++) {
      JButton button = new JButton(buttons[i]);
      button.addActionListener(this);
      panel.add(button);
    }
    
    add(panel, BorderLayout.CENTER);
    setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e) {
    String button = e.getActionCommand();
    
    if (button.matches("[0-9.]")) {
      if (start) {
        display.setText("");
        start = false;
      }
      
      display.setText(display.getText() + button);
    } else if (button.matches("[+-/*]")) {
      operator = button;
      result = Double.parseDouble(display.getText());
      start = true;
    } else if (button.equals("=")) {
      try {
        double secondOperand = Double.parseDouble(display.getText());
  
        switch (operator) {
          case "+":
            result += secondOperand;
            break;
          case "-":
            result -= secondOperand;
            break;
          case "*":
            result *= secondOperand;
            break;
          case "/":
            result /= secondOperand;
            break;
        }
  
        display.setText(String.valueOf(result));
      } catch (ArithmeticException ex) {
        display.setText("Cannot divide by zero");
      }
    }
  }
  
  public static void main(String[] args) {
    new Calculator();
  }
}