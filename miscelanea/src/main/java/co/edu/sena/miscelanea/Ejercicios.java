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
        return (int) (Math.PI * Math.pow(radio, 2) * height);
    }

    public int circum_length(int radio) {
        return (int) (2 * Math.PI * radio);
    }

    public int circum_area(int radio) {
        return (int) (Math.PI * Math.pow(radio, 2));
    }

    public int average(int number1, int number2, int number3) {
        return (number1 + number2 + number3) / 3;
    }

    public void num(int val) {
        if (val == 0) {
            System.out.println("El número ingresado es neutro");
        } else if (val > 0) {
            System.out.println("El número ingresado es positivo");
        } else {
            System.out.println("El número ingresado es negativo");
        }
    }

    public void numame(int num, int num2) {
        if (num > num2) {
            System.out.println(num + " Es mayor que " + num2);
        } else if (num < num2) {
            System.out.println(num2 + " Es mayor que " + num);
        } else {
            System.out.println("Los números son iguales");
        }
    }

    public void treen(int vl, int vl2, int vl3) {
        if (vl > vl2 && (vl > vl3)) {
            System.out.println(vl + " Es mayor que " + vl2 + " y " + vl3);
        } else if (vl2 > vl && (vl2 > vl3)) {
            System.out.println(vl2 + " Es mayor que " + vl + " y " + vl3);
        } else if (vl3 > vl && (vl3 > vl2)) {
            System.out.println(vl3 + " Es mayor que " + vl2 + " y " + vl);
        }
    }

    public int sumnum(int vl, int vl2) {
        if (vl < vl2) {
            return vl + vl2;
        } else {
            return vl - vl2;
        }
    }
    public void div(int A, int B) {
        if (B == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            double R = (double) A / B;
            System.out.println("El cociente entre " + A + " y " + B + " es: " + R);
        }
    }

    public int numne(int A, int B) {
        if (A < 0 || B < 0) {
            return A + B;
        }
        return A * B;
    }
    public void yb(int a) {
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            System.out.println(a + " si es un año bisiesto");
        } else {
            System.out.println(a + " no es un año bisiesto");
        }
    }
    
    
}
