public class App {
    public static void main(String[] args) throws Exception {
        multiply(Integer.parseInt(args[0]));
    }

    private static void multiply(Integer number) {
        System.out.println("Tabela de multiplicação de " + number + ":");
        for(int i = 1; i<=10; i++) {
            System.out.println(i*number);
        }
    }
}
