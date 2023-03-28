package semana06;

public class Metodos {
    public static void main(String[] args) {
        
        System.out.println(Math.sqrt(25));

        imprimirPalavra("Domingos Latorre");

        System.out.println(Calculadora.somar(10.0, 3.0)); 
    }

    // public - modificador de acesso: qualquer classe em qualquer pacote pode acessar esse método
    // static: o método fica associado à classe e não aos objetos dela
    // void - tipo de retorno: não retorna nenhum valor
    // imprimirPalavra: nome do método
    // parâmetro: referências aos valores passados na chamada do método

    public static void imprimirPalavra (String palavra) {

        System.out.println(palavra.toUpperCase());
    }
}
