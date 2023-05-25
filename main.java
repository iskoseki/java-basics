// Primera parte
public class SumaNumeros {
    public static int sumar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        int resultado = sumar(2, 3, 5);
        System.out.println("La suma de los números es: " + resultado);
    }
}

// Segunda parte
public class Coche {
    private int numPuertas;

    public Coche() {
        numPuertas = 0;
    }

    public void incrementarPuertas() {
        numPuertas++;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("El número de puertas del coche es: " + miCoche.getNumPuertas());
    }
}

