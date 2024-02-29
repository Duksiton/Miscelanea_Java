package co.edu.sena.miscelanea;

public class Ejercicios {

    public double area(double base, double height) {
        return (base * height) / 2;
    }

    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    public int raise(int v1) {
        return v1 * v1;
    }

    public double converter(int value) {
        return value * 1.08;
    }

    public int square_area(int side) {
        return side * side;
    }
    public int square_perimeter(int side) {
        return side * 4;
    }

    public int cylinder_area(int radio, int height) {
        return (int) (2 * Math.PI * radio * (radio + height));
    }
    public int cylinder_volume(int radio, int height) {
        return (int) ( Math.PI * Math.pow(radio, 2) * height);
    }

}
