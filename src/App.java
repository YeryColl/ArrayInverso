import java.util.Scanner;

public class App {

    public static int tamArreglo = 0;
    public static Scanner leer = new Scanner(System.in);
    public static boolean continuar = true;

    public static void main(String[] args) throws Exception {
        int[] arreglo =PedirTamañoArreglo();
        llenado(arreglo);
        System.out.println("Mostrar");
        Mostrar(arreglo);
        valoresInvertidos(arreglo);
    }
    
    public static int[] PedirTamañoArreglo() {
        do {
            try {
                System.out.print("Ingrese la cantidad de valores a ingresar: ");
                tamArreglo = leer.nextInt();
                if (tamArreglo <= 1 || tamArreglo > 15) {
                    System.out.println("La cantidad debe ser mayor que 1 y menor que 15.");
                    return PedirTamañoArreglo();
                }
                continuar = false;
            } catch (Exception e) {
                System.out.println("Solo numeros enteros");
                leer.nextLine();
            }
        } while (continuar);
        int arreglo[] = new int[tamArreglo];
        return arreglo;
    }
    public static int[] llenado(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            try {
                System.out.println("ingrese el valor [" + (i+1) + "]");
            arreglo[i] = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Solo numeros enteros");
                leer.nextLine();
                i--;
            }
        }
        return arreglo;
    }
    public static void Mostrar(int[] arreglo ) {
        System.out.println("Mostrando el arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("-> "+arreglo[i]);
        }

    }
    public static void valoresInvertidos(int[] arreglo){
        System.out.println("mostrando el Array invertido");
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + ", ");
        }
    }
}