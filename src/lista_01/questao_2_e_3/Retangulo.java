package lista_01.questao_2_e_3;

public class Retangulo extends Forma implements Redimensionavel{
    private double largura, altura;

    public Retangulo(int numLados, int largura, int altura) {
        super(numLados);
//        numLados = 4;
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void redimensionar(double x) {
        setAltura(x*getAltura());
        setLargura(x*getLargura());

    }

    @Override
    public double getArea() {
        return this.getAltura()*this.getLargura();
    }

    @Override
    public double getPerimetro() {
        return 2*(this.getLargura()+this.getAltura());
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "largura=" + largura +
                ", altura=" + altura +
                ", área=" + getArea() +
                ", perímetro=" + getPerimetro() +
                '}';
    }
}

