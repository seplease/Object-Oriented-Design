interface Drawable {
	void draw();
}
class Circle extends Shape implements Drawable {
	int radius;
	public void draw() {
		System.out.println("Circle Draw");
	}
}