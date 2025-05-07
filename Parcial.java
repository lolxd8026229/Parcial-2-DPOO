public class Parcial {

    public int potencia(int b, int e) {
        if (e < 0) {
            throw new IllegalArgumentException("El exponente no puede ser negativo.");
        }

        long resultado = 1;
        for (int i = 0; i < e; i++) {
            resultado *= b;

            if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
                throw new ArithmeticException("El resultado excede el rango de int.");
            }
        }

        return (int) resultado;
    }
}