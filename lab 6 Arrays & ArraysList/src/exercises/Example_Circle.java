package exercises;

public class Example_Circle {
	private double radius;

	public Example_Circle() {
		
	}
	public Example_Circle(double radius) {
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius >= 0.0 && radius < 20.0) {
			this.radius = radius;
		} else {
			this.radius = 1.0;
		}

	}

	public double getCircumfences() {
		return 2 * getRadius() * Math.PI;

	}

	public double getArea() {
		return Math.PI * Math.pow(getRadius(), 2);

	}
}
