package semana07;

public class ExerciciosRevisao {
    
    public static void main(String[] args) {
        
    }

    // 1.
    public static double somar(double a, double b, double c) {
        return a + b + c;
    }

    // 2.
    public static double calcularMediaAritmetica(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // 3.
    public static int maiorNumero(int a, int b, int c) {
        if(a >= b && a >= c) {
            return a;

        } else if(b >= a && b >= c) {
            return b;

        } else {
            return c;
        }
    }

    // 4.
    public static int menorNumero(int a, int b, int c) {
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
    public static double somarArrayDeDoubles(double [] array) {
        double soma = 0;

        for (double d : array) {
            soma = soma + d;
        }

        return soma;
    }

    // 7.
    public static double calcularMediaAritmeticaArray(double [] array) {
        return somarArrayDeDoubles(array) / array.length;
    }

    // 8.
    public static double maiorNumeroArray(double [] array) {
        double auxiliar = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]) {
                    auxiliar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliar;
                }
            }
        }

        return array[array.length - 1];
    }

    // 9.
    public static double menorNumeroArray(double [] array) {
        double auxiliar = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]) {
                    auxiliar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliar;
                }
            }
        }

        return array[0];
    }

    // 10.
    public static int [] fundirArrays(int [] array1, int [] array2) {
        int [] fusao = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            fusao[i] = array1[i];
        } 

        for (int i = array1.length; i < fusao.length; i++) {
            fusao[i] = array2[i - array1.length];
        } 

        return fusao;
    }
}
