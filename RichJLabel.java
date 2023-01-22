import javax.swing.JLabel;
import java.awt.Color;

public class RichJLabel extends JLabel{
  private int tracking;
  public RichJLabel(String text, int tracking){
    super(text);
    this.tracking = tracking;
  }

  private int left_x, left_y, right_x, right_y;
  private Color left_color, right_color;
  public void setLeftShadow(int x,int y, Color color){
    left_x = x;
    left_y = y;
    right_color = color;
  }  
}
