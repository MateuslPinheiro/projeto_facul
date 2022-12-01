package lista_01.questao_2_e_3;

import java.util.ArrayList;

public class Main3_3 {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(4,2,3);
        Triangulo t = new Triangulo(3, 5,6);

        ArrayList<Forma> ls = new ArrayList<Forma>();
        ls.add(r);
        ls.add(t);
        r.redimensionar(0.5);

        for (int i = 0; i < ls.size(); i++) {
            System.out.println("Área: " + ls.get(i).getArea());
            System.out.println("Perímetro: " + ls.get(i).getPerimetro());
        }
    }
}
