package lista_01.questao_2_e_3;

public class Main {

    public static void main(String[] args) {
        Retangulo r = new Retangulo(4,2,3);
        Triangulo t = new Triangulo(3, 5,6);

        System.out.println("Área: " + r.getArea());
        System.out.println("Perímetro: " + r.getPerimetro());
        r.redimensionar(2);

        System.out.println("Área: " + r.getArea());
        System.out.println("Perímetro: " + r.getPerimetro());

    }

}
