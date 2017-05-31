package codeu.chat.client.simplegui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

// NOTE: JPanel is serializable, but there is no need to serialize UserPanel
// without the @SuppressWarnings, the compiler will complain of no override for serialVersionUID
@SuppressWarnings("serial")
final class WelcomePanel extends JPanel {

  private JLabel imageLabel;

  WelcomePanel() {
    super(new GridBagLayout());
    initialize();
  }

  private void initialize() {
    final JPanel buttonPanel = new JPanel();
    final GridBagConstraints buttonPanelC = new GridBagConstraints();

    try {
      BufferedImage img = ImageIO
          .read(new File("../src/codeu/chat/client/simplegui/Controller.png"));
      imageLabel = new JLabel(new ImageIcon(img));
    } catch (IOException e) {
      e.printStackTrace();
    }

    buttonPanelC.gridx = 0;
    buttonPanelC.gridy = 0;
    buttonPanelC.gridwidth = 10;
    buttonPanelC.gridheight = 1;
    buttonPanelC.fill = GridBagConstraints.HORIZONTAL;
    buttonPanelC.anchor = GridBagConstraints.FIRST_LINE_START;

    this.add(buttonPanel, buttonPanelC);
  }

  JLabel getImageLabel() {
    return imageLabel;
  }
}
