package semana12.exercicios;

public class Aquario {

    public double comprimento;
    public double altura;
    public double largura;

    public Aquario(double comprimento, double altura, double largura) {

        if(comprimento <= 0.0)
            throw new IllegalArgumentException("Comprimento inválido");

        if(altura <= 0.0)
            throw new IllegalArgumentException("Altura inválida");

        if(largura <= 0.0)
            throw new IllegalArgumentException("Largura inválida");

        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public Aquario(double valor) {
        this(valor, valor, valor);
    }

    public double calcularVolume() {
        return (comprimento * altura * largura) / 1000;
    }

    public double calcularPotenciaDoTermostato(double temperaturaDesejada, double temperaturaAmbiente) {
        return calcularVolume() * 0.05 * Math.abs(temperaturaDesejada - temperaturaAmbiente);
    }

    public double [] calcularQuantidadeLitrosFiltro() {
        double [] filtragem = {calcularVolume() * 2, calcularVolume() * 3};
        return filtragem;
    }
}
