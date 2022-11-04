import java.util.Scanner;

public class poligonos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escoja una figura geométrica de entre las siguientes: triángulo, rectángulo, pentágono, hexágono:");
        String figura = input.nextLine();
        if (figura.equals("triángulo")) {
            figura = "triangulo";
        }
        if (figura.equals("rectángulo")) {
            figura = "rectangulo";
        }
        if (figura.equals("pentágono")) {
            figura = "pentagono";
        }
        if (figura.equals("hexágono")) {
            figura = "hexagono";
        }
        switch (figura) {
            case "triangulo":
                System.out.print("Introduzca la base del triángulo: ");
                int baseTriangulo = input.nextInt();
                System.out.print("Introduzca la altura del triángulo: ");
                int alturaTriangulo = input.nextInt();
                float areaTriangulo = baseTriangulo * alturaTriangulo / 2;
                System.out.println("El área del triángulo con altura " + alturaTriangulo + " y base " + baseTriangulo + " es igual a " + areaTriangulo + ".");
                break;
            case "rectangulo":
                System.out.print("Introduzca la base del rectángulo: ");
                int baseRectangulo = input.nextInt();
                System.out.print("Introduzca la altura del rectángulo: ");
                int alturaRectangulo = input.nextInt();
                float areaRectangulo = baseRectangulo * alturaRectangulo;
                System.out.println("El área del rectángulo con altura " + alturaRectangulo + " y base " + baseRectangulo + " es igual a " + areaRectangulo + ".");
                break;
            case "pentagono":
                System.out.print("Introduzca el tamaño de cada lado: ");
                int lado_p = input.nextInt();
                System.out.print("Introduzca el tamaño del apotema: ");
                int apotemaPentagono = input.nextInt();
                int perimetroPentagono = lado_p * 5;
                float areaPentagono = perimetroPentagono * apotemaPentagono / 2;
                System.out.println("El área del pentágono con lado " + lado_p + " y apotema " + apotemaPentagono + " es igual a " + areaPentagono + ".");
                break;
            case "hexagono":
                System.out.print("Introduzca el tamaño de cada lado: ");
                int ladoHexagono = input.nextInt();
                System.out.print("Introduzca el tamaño del apotema: ");
                int apotemaHexagono = input.nextInt();
                int perimetroHexagono = ladoHexagono * 6;
                float areaHexagono = perimetroHexagono * apotemaHexagono / 2;
                System.out.println("El área del hexágono con lado " + ladoHexagono + " y apotema " + apotemaHexagono + " es igual a " + areaHexagono + ".");
                break;
            default:
                System.out.print("Introduzca una figura válida. ");
                break;
        }
    }
}

