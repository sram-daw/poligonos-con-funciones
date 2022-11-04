import java.util.Scanner;

public class poligonosFunciones {

    public static float valor1 = 0;
    public static float valor2 = 0;
    public static float triangulo(float n1, float n2) {
        float areaTriangulo = 0;
        areaTriangulo = n1 * n2 / 2;
        return areaTriangulo;
    }

    public static float rectangulo(float n1, float n2) {
        float areaRectangulo = 0;
        areaRectangulo = n1 * n2;
        return areaRectangulo;
    }

    public static float pentagono(float n1, float n2) {
        float perimetro = 0;
        perimetro = n1 * 5;
        float areaPentagono = perimetro * n2 / 2;
        return areaPentagono;
    }

    public static float hexagono(float n1, float n2) {
        float perimetro = 0;
        perimetro = n1 * 6;
        float areaHexagono = perimetro * n2 / 2;
        return areaHexagono;
    }

    public static void solicitarValores(String figura) {
        String n1 = "";
        String n2 = "";
        if (figura.equals("triangulo") | figura.equals("rectangulo")) {
            n1 = "la base";
            n2 = "la altura";
        }
        else if (figura.equals("pentagono") | figura.equals("hexagono")) {
            n1 = "el lado";
            n2 = "el apotema";
        }
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce " + n1 + ":");
        valor1 = entrada.nextFloat();
        System.out.println("Introduce " + n2 + ":");
        valor2 = entrada.nextFloat();

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escoja una figura geométrica de entre las siguientes: triangulo, rectangulo, pentagono, hexagono:");
        String figura = input.nextLine();


        switch (figura) {
            case "triangulo":
                solicitarValores("triangulo");
                System.out.println("El area del triangulo es " + triangulo(valor1, valor2));
                break;
            case "rectangulo":
                solicitarValores("rectangulo");
                System.out.println("El area del rectangulo es " + rectangulo(valor1, valor2));
                break;

            case "pentagono":
                solicitarValores("pentagono");
                System.out.println("El area del pentagono es " + pentagono(valor1, valor2));
                break;

            case "hexagono":
                solicitarValores("hexagono");
                System.out.println("El area del hexagono es " + hexagono(valor1, valor2));
                break;
            default:
                System.out.print("Introduzca una figura valida. ");
                break;
        }
    }


}
