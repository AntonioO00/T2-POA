import java.util.Scanner;

public class SaltoRio {
    private String rio;

    public SaltoRio(String rio) {
        this.rio = rio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a string: ");
        String rio = scanner.nextLine();

        if (!rio.startsWith("m") || !rio.endsWith("m")) {
            System.out.println("Formato inválido! A string deve começar e terminar com 'm'.");
            return;
        }

        String pedras = rio.substring(1, rio.length() - 1);
        SaltoRio saltoRio = new SaltoRio(pedras);


        Contador contador = new Contador(saltoRio.rio);
        System.out.println("Recursão simples: existem " + contador.recursivoSimples(0) + " maneiras");
        System.out.println("Recursão memorizada: existem " + contador.recursivoMemorizado(0) + " maneiras");
        System.out.println("Sem recursão: existem " + contador.naoRecursivo() + " maneiras");

        scanner.close();
    }
}