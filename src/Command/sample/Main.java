package Command.sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import Command.sample.command.Command;
import Command.sample.command.MacroCommand;
import Command.sample.drawer.DrawCanvas;
import Command.sample.drawer.DrawCommand;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
  // 描画履歴
  private MacroCommand history = new MacroCommand();
  // 描画領域
  private DrawCanvas canvas = new DrawCanvas(400, 400, history);
  // 消去ボタン
  private JButton clearButton = new JButton("clear");

  // コンストラクタ
  public Main(String title) {
    super(title);

    this.addWindowListener(this);
    canvas.addMouseMotionListener(this);
    clearButton.addActionListener(this);

    Box buttonBox = new Box(BoxLayout.X_AXIS);
    buttonBox.add(clearButton);
    Box mainBox = new Box(BoxLayout.Y_AXIS);
    mainBox.add(buttonBox);
    mainBox.add(canvas);
    getContentPane().add(mainBox);

    pack();
    show();
  }

  // ActionListener用
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == clearButton) {
      history.clear();
      canvas.repaint();
    }
  }

  // MouseMotionListener用
  public void mouseMoved(MouseEvent e) {}

  public void mouseDragged(MouseEvent e) {
    Command cmd = new DrawCommand(canvas, e.getPoint());
    history.append(cmd);
    cmd.execute();
  }

  // WindowListener用
  public void windowClosing(WindowEvent e) {
    System.exit(0);
  }

  public void windowActivated(WindowEvent e) {}

  public void windowClosed(WindowEvent e) {}

  public void windowDeactivated(WindowEvent e) {}

  public void windowDeiconified(WindowEvent e) {}

  public void windowIconified(WindowEvent e) {}

  public void windowOpened(WindowEvent e) {}

  public static void main(String[] args) {
    new Main("Command Pattern Sample");
  }
}
