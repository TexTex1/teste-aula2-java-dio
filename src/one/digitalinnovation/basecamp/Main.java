package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

        //retornos
        System.out.println("Exercício Quadrilátero.");
       double areaQuadrado = Quadrilatero.area(3);
       System.out.println("Área do quadrado:" + areaQuadrado);
       double areaRetangulo = Quadrilatero.area(5d,5d);
       System.out.println("Área do Retãngulo:" + areaRetangulo);
       double areaTrapezio = Quadrilatero.area(7,8,9);
       System.out.println("Área do Trapézio:" + areaTrapezio);
    }
}
