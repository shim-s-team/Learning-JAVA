import java.awt.*;
import java.applet.*;

public class HelloApplet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Hello, Applet!", 50, 100);
    }
}