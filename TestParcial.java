public class TestParcial {
    public static void main(String[] args) {
        Parcial p = new Parcial();

        try {
            int resultado = p.potencia(3, 5);
            System.out.println("Resultado: " + resultado);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}