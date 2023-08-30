package semana21;

import java.util.ArrayList;
import java.util.Set;

// interface = contrato
// conjunto de métodos (somente assinatura, sem corpo)
// classe concreta que IMPLEMENTA a interface

// interface FiguraGeometrica - calcularArea() / calcularPerimetro()

// Quadrado - lado - calcularArea() / calcularPerimetro()
// Retangulo - base, altura - calcularArea() / calcularPerimetro()
// Circulo - raio - calcularArea() / calcularPerimetro()

public class Main {

    public static void main(String[] args) {

        Tela tela = new Tela();

        Quadrado q1 = new Quadrado(10.0);
        Quadrado q2 = new Quadrado(20.0);

        Retangulo r1 = new Retangulo(10.0, 5.0);

        Circulo c1 = new Circulo(2.0);

        tela.addFigura(q1);
        tela.addFigura(q2);
        tela.addFigura(r1);
        tela.addFigura(c1);

        System.out.println(tela.areaTotal());
        System.out.println(tela.perimetroTotal());

        // List
        // Set    
        // Map

        ArrayList<String> nomes = new ArrayList<String>();

        // Adicionar
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Pedro");

        // Tamanho
        System.out.println(nomes.size());

        // Remover
        // nomes.remove(1);
        nomes.remove("João");

        //   0      1     2

        // Maria, João, Pedro

        // Maria, Pedro

        // Remover todos os elementos
        nomes.clear();

        // Pegar elemento
        System.out.println(nomes.get(0));
    }
}