import java.awt.*;

public class Dot {

	private Point center;
	private int radius;
	private Color color;

	public Dot(Point center) {
		this.center = center;
		radius = 30;
		color = Color.BLUE;
	}

	void paint(Graphics g){
		g.setColor(color);
		g.fillOval(center.x-radius,center.y-radius, radius*2, radius*2 );
	}

}
