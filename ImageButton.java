import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ImageButton extends JButton{
  public ImageButton(String img){
    this(new ImageIcon(img));
  }

  public ImageButton(ImageIcon icon) {
    setSize(icon.getImage().getWidth(null), icon.getImage().getHeight(null));
    setIcon(icon);
    setMargin(new Insets(0,0,0,0));
    setIconTextGap(0);
    setBorder(null);
    setText(null);
  }
}