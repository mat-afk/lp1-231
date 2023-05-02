package semana10;

public class Programa {
    public static void main(String[] args) {
        
        // calcular a área e o perímetro de um retângulo
        // Área = base * altura
        // Perímetro = (2 * base + altura)

        // Objeto (ou instância) da classe Retangulo
        Retangulo ret1 = new Retangulo();
        ret1.base = 10.0;
        ret1.altura = 5.0;
        System.out.println(ret1.calcularArea());
        System.out.println(ret1.calcularPerimetro());

        Retangulo ret2 = new Retangulo();
        ret2.base = 30.0;
        ret2.altura = 10.0;
        System.out.println(ret2.calcularArea());
        System.out.println(ret2.calcularPerimetro());

        Quadrado quad1 = new Quadrado();
        quad1.lado = 5.0;
        System.out.println(quad1.calcularArea());
        System.out.println(quad1.calcularPerimetro());

        Circulo circ1 = new Circulo();
        circ1.raio = 10.0;
        System.out.println(circ1.calcularArea());
        System.out.println(circ1.calcularCircunferencia());

    }
}

