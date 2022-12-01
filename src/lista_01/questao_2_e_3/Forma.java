package lista_01.questao_2_e_3;

public abstract class Forma {
    private int numLados;

    public Forma(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public abstract double getArea();
    public abstract double getPerimetro();
}
