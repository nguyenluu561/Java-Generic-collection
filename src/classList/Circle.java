package classList;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Circle {

	private int xPos, yPos, radius;

	public Circle(int x, int y, int r) {
		xPos = x;
		yPos = y;
		radius = r;
	}

	public boolean equals(Object arg) {
		if (arg == null)
			return false;
		if (this == arg)
			return true;
		if (arg instanceof Circle) {
			Circle that = (Circle) arg;
			if ((this.xPos == that.xPos) && (this.yPos == that.yPos) && (this.radius == that.radius)) {
				return true;
			}
		}
		return false;
	}

	public int hashCode() {
		return Objects.hash(this.xPos, this.yPos, this.radius);
	}

	public static void main(String[] args) {
		Set<Circle> circleList = new HashSet<Circle>();
		circleList.add(new Circle(10, 20, 5));
		System.out.println(circleList.contains(new Circle(10, 20, 5)));
		
	}

}
