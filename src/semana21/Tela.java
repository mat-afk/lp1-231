package semana21;

import java.util.ArrayList;

public class Tela {
    private ArrayList<FiguraGeometrica> figuras;

    public Tela() {
        figuras = new ArrayList<>();
    }

    public void addFigura(FiguraGeometrica figura) {
        figuras.add(figura);
    }

    public double areaTotal() {
        double areaTotal = 0.0;

        for (FiguraGeometrica figura : figuras) {
            areaTotal += figura.calcularArea();
        }

        return areaTotal;
    }

    public double perimetroTotal() {
        double perimetroTotal = 0.0;

        for (FiguraGeometrica figura : figuras) {
            perimetroTotal += figura.calcularPerimetro();
        }

        return perimetroTotal;
    }

    public int getNumeroFiguras() {
        return figuras.size();
    }
    
}
