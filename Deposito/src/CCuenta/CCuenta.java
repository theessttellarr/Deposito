package CCuenta;


/**
 * Clase que representa una cuenta bancaria.
 */

public class CCuenta {
    private double saldo;

    /**
     * Constructor por defecto.
     */

    public CCuenta() {
    }

    /**
     * Constructor con parámetros.
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial.
     * @param tipo Tipo de interés.
     */

    public CCuenta(String nom, String cue, double sal, double tipo) {
        saldo = sal;
    }

    /**
     * Método que devuelve el estado actual de la cuenta.
     * @return saldo actual de la cuenta.
     */

    public double estado() {
        return saldo;
    }

    /**
     * Método para ingresar una cantidad en la cuenta.
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo += cantidad;
    }

    /**
     * Método para retirar una cantidad de la cuenta.
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo -= cantidad;
    }
}