package semana21;

public class Circulo implements FiguraGeometrica {

    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void setRaio(double raio) {
        if(raio <= 0)
            throw new RuntimeException("Raio inválido");
        this.raio = raio;
    }
}