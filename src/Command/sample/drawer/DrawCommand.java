package Command.sample.drawer;

import java.awt.Point;
import Command.sample.command.Command;

public class DrawCommand implements Command {
  protected Drawable drawable;
  private Point position;

  public DrawCommand(Drawable drawable, Point position) {
    this.drawable = drawable;
    this.position = position;
  }

  @Override
  public void execute() {
    drawable.draw(position.x, position.y);
  }

}
