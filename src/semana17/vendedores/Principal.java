package semana17.vendedores;

public class Principal {

    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("Pedro", 50000.0, 10.0);
        Vendedor v2 = new Vendedor("João", 100000.0, 12.0);
        Vendedor v3 = new VendedorFixo("Marcia", 200000.0, 5.0, 2000.0);

        System.out.println(v1.obterSalario());
        System.out.println(v2.obterSalario());
        System.out.println(v3.obterSalario());
    }
    
}
