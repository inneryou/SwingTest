import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJFrame extends JPanel {
 private JFrame jframe;
 private JPanel basePanel;
 private JPanel mainPanel; 
 /**
 * @param title
 */
public MyJFrame(String title){
  jframe = new JFrame(title);
  jframe.setBounds(100,100,600,400);
  basePanel = new JPanel();
  basePanel.setLayout(new BorderLayout());
  mainPanel = new JPanel();
  mainPanel.setLayout(new GridBagLayout());
  basePanel.add(mainPanel, BorderLayout.CENTER);

  jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  jframe.getContentPane().add(basePanel);
  final ImageButton button = new ImageButton("images/button.png");
  mainPanel.add(button);
  final JCheckBox checkbox = new JCheckBox("Disable");
  checkbox.setLocation(70,150);
  checkbox.setOpaque(false);
  checkbox.setSize(checkbox.getPreferredSize());
  mainPanel.add(checkbox);
  checkbox.addActionListener(new MyActionListener());
}
private class MyActionListener implements ActionListener{
  public void actionPerformed(ActionEvent evt){
    System.out.println("Test");
  }
}

 public void showPanel(){
  jframe.setVisible(true);
 }
}