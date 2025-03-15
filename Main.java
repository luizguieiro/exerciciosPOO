public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "Luiz Miguel", "luiz@gmail.com", "(11) 99999-9999", "Rua Serra das Furnas, 100");
        Curso curso = new Curso(101, "JAVA POO", 40, 299.90f);

        System.out.println(cliente);
        System.out.println(curso);
    }
}
