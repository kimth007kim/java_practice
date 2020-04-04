package method_Overloading;

public class Calculator {

	//정사각형의넓이
	double areaRectangle(double width) {
		return width * width;
	}

	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
