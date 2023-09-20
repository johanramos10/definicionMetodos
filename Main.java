public class Main {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");

        Rombo rombo = new Rombo(5, 60);
        System.out.println("Area del rombo: " + rombo.calcularArea());
        System.out.println("perimetro del rombo: " + rombo.calcularPerimetro());

        Trapecio trapecio = new Trapecio(10, 8, 6, 5);
        System.out.println("Area del trapecio:" + trapecio.calcularArea());
        System.out.println("Perimetro del trapecio: " + trapecio.calcularPerimetro());

    }

}

class Rombo {
    private double lado;
    private double angulo; // En grados

    public Rombo(double lado, double angulo) {
        this.lado = lado;
        this.angulo = angulo;
    }

    public double calcularArea() {
        return lado * lado * Math.sin(Math.toRadians(angulo));
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}

class Trapecio {
    private double baseMayor;
    private double baseMenor;
    private double lado1;
    private double lado2;

    public Trapecio(double baseMayor, double baseMenor, double lado1, double lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcularArea() {
        return ((baseMayor + baseMenor) / 2) * Math.sqrt(lado1 * lado1 - Math.pow(((baseMayor - baseMenor) / 2), 2));
    }

    public double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}