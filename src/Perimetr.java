public class Perimetr{

    // Метод для вычисления гипотенузы треугольника
    public static double calculateHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static void main(String[] args) {
        // Даны стороны AB, AC и CD
        double AB = 3.0; // длина стороны AB
        double AC = 4.0; // длина стороны AC
        double CD = 5.0; // длина стороны CD

        // Вычисляем длину стороны BD
        double BD = calculateHypotenuse(AB, AC); // длина BD - гипотенуза треугольника ABD

        // Периметр фигуры ABCD
        double perimeter = AB + AC + CD + BD;

        // Выводим результат
        System.out.printf("Периметр фигуры ABCD: %.2f", perimeter);
    }
}
