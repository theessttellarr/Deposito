
import CCuenta.CCuenta;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, 2300);
    }

    /**
     * Método que realiza operaciones de ingreso y retiro en la cuenta.
     * cuenta La cuenta sobre la que se realizarán las operaciones.
     * cantidad La cantidad a retirar.
     * @param cuenta
     * @param cantidad
     */

    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        double saldoActual = cuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);
        try {
            cuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar: " + e.getMessage());
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar: " + e.getMessage());
        }
    }
}