package semana12;

public class Retangulo {
    public double base;
    public double altura;
    
    public Retangulo(double base, double altura) {
        if(base <= 0)
            throw new IllegalArgumentException("Base inválida");
        
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(double lado) {
        this(lado, lado);
    }
    
    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base +  altura);
    }
}
