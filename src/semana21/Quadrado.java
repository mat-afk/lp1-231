package semana21;

public class Quadrado implements FiguraGeometrica {
    
    private double lado;

    public Quadrado(double lado) {
        setLado(lado);
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    public void setLado(double lado) {
        if(lado <= 0.0)
            throw new RuntimeException("Lado inválido");
        this.lado = lado;
    }
}
