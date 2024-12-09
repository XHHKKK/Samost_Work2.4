public class Triangle {

    // Метод для вычисления периметра треугольника
    public double calculatePerimeter(double A, double B, double C) {

        return A + B + C;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        // Пример: со стороны 3.0, 4.0 и 5.0
        double sideA = 3.0;
        double sideB = 4.0;
        double sideC = 5.0;

        double perimeter = triangle.calculatePerimeter(sideA, sideB, sideC);

        System.out.println("Периметр треугольника: " + perimeter);
    }
}