package HW4.TriangleProblem;

//Yonatan Mattar - 315957571
//Riad Zoabi - 211830369

public class Triangle_classification {
	
    enum Triangle_Types {
        equilateral,
        isosceles,
        Scalene,
        Nottriangle,
        ERROR
    }

    public static String classifyTriangle(int a, int b, int c) {
        Triangle_Types triangle;
        if (a + b > c) {
            if (a + c > b) {
                if (b + c > a) {
                    if (a == b) {
                        if (b == c) {
                            triangle = Triangle_Types.equilateral;
                        } else {
                            triangle = Triangle_Types.isosceles;
                        }
                    } else if (a == c) {
                        triangle = Triangle_Types.isosceles;
                    } else if (b == c) {
                        triangle = Triangle_Types.isosceles;
                    } else {
                        triangle = Triangle_Types.Scalene;
                    }
                } else {
                    triangle = Triangle_Types.Nottriangle;
                }
            } else {
                triangle = Triangle_Types.Nottriangle;
            }
        } else {
            triangle = Triangle_Types.Nottriangle;
        }
        return triangle.toString();
    }
}