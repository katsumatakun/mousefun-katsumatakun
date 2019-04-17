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

	public int getRadius() {
		return radius;
	}

	public Point getCenter() {
		return center;
	}

	public boolean isInside(Point p){
		return p.distance(center)<radius;
	}

	public void setColor(Color c){
		this.color = c;

	}
	void paint(Graphics g){
		g.setColor(color);
		g.fillOval(center.x-radius,center.y-radius, radius*2, radius*2 );
	}

}
