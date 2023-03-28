package semana06;

public class Calculadora {

    public static double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;        
    }

    public static double dividir(double numero1, double numero2) {
        if(numero2 == 0) 
            throw new RuntimeException("Denominador não pode ser 0!");
        
        return numero1 / numero2;
    }
}
