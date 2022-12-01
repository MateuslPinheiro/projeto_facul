package lista_01.questao_2_e_3;

public class Triangulo extends Forma{
    double base, altura;

    public Triangulo(int numLados, int base, int altura) {
        super(numLados);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (getAltura()*getBase())/2;
    }

    @Override
    public double getPerimetro() {
        return getNumLados()*getBase();
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", área=" + getArea() +
                ", perímetro=" + getPerimetro() +
                '}';
    }
}
