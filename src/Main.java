import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("---------EJERCICIO 1----------");
        //EJERCICIO 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Habilidad: ");
        String habilididad = scanner.nextLine();


        System.out.println(nombre + " es " + habilididad);

        System.out.println("---------EJERCICIO 2----------");

        //EJERCICIO 2

        System.out.print("Número: ");
        int num = scanner.nextInt();
        System.out.println("Resultado: " + Math.pow(num, 2));

        System.out.println("---------EJERCICIO 3----------");

        //EJERCICIO 3

        System.out.print("Radio: ");
        double radio = scanner.nextDouble();

        double circ = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Circunferencia: " + Math.round(circ * 100.0) / 100.0);
        System.out.println("Área: " + Math.round(area * 100.0) / 100.0);

        System.out.println("---------EJERCICIO 4----------");

        //EJERCICIO 4

        Automovil auto = new Automovil("Mazda", 2008, "KT", 24, 5);
        System.out.println(auto.toString());

        System.out.println("---------EJERCICIO 5----------");

        //EJERCICIO 5

        System.out.print("Número: ");
        int numero = scanner.nextInt();


        System.out.println(isPar(numero));

        System.out.println("---------EJERCICIO 6----------");
        //EJERCICIO 6 (pruebe con "." o "," )

        System.out.print("Número 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Número 2: ");
        double num2 = scanner.nextDouble();

        System.out.println(mult(num1, num2));

    }
    public static String isPar(int num){
        String res;

        if(num == 0){
            res = "Es CERO";
        }
        else if(num % 2 == 0){
            res = "Es Par";
        }else{
            res = "Es Impar";
        }

        return res;
    }

    public static double mult(double num1, double num2){
        return Math.round((num1 * num2) * 100.0)/ 100.0 ;
    }
}

