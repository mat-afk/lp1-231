package semana10;

// Classe - representa um conceito/abstração que deve ser implementada no software
public class Retangulo {

    // Atributos
    public double base;
    public double altura;

    // Métodos
    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
