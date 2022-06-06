
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre");
            String nombre;
            nombre = leer.nextLine();
            System.out.println("nombre: "+nombre);
        }
    }
}
