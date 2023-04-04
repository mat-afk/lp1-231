package semana07;

public class ExerciciosRevisao {
    
    public static void main(String[] args) {
        
    }

    // 1.
    public static double somar(double a, double b, double c) {
        return a + b + c;
    }

    // 2.
    public static double calcularMedia(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // 3.
    public static int encontrarMaiorNumero(int a, int b, int c) {
        if(a >= b && a >= c) {
            return a;

        } else if(b >= a && b >= c) {
            return b;

        } else {
            return c;
        }
    }

    // 4.
    public static int encontrarMenorNumero(int a, int b, int c) {
        if(a <= b && a <= c) {
            return a;

        } else if(b <= a && b <= c) {
            return b;

        } else {
            return c;
        }
    }

    // 5.
    public static double [] transformarEmArray(double a, double b, double c) {
        double [] array = {a, b, c};
        return array;
    }

    // 6.
    public static double somarArray(double [] array) {
        double soma = 0;

        for (double d : array) {
            soma = soma + d;
        }

        return soma;
    }

    // 7.
    public static double calcularMediaArray(double [] array) {
        return somarArray(array) / array.length;
    }

    // 8.
    public static double encontrarMaiorValorArray(double [] array) {
        double maior = 0;

        for (int i = 1; i < array.length; i++) {
            if(array[i] > maior) {
                maior = array[i];
            }
        }

        return maior;
    }

    // 9.
    public static double encontrarMenorValorArray(double [] array) {
        double menor = 0;

        for (int i = 1; i < array.length; i++) {
            if(array[i] < menor) {
                menor = array[i];
            }
        }

        return menor;
    }

    // 10.
    public static int [] juntarArrays(int [] array1, int [] array2) {
        int [] fusao = new int[array1.length + array2.length];
        int i = 0;

        for (int elemento : array1) {
            fusao[i] = elemento;
            i++;
        }

        for (int elemento : array2) {
            fusao[i] = elemento;
            i++;
        }

        return fusao;
    }
}
