package ej_5_servicio;

/**
 *
 * @author akila
 */
public class cuenta {
    private int numeroCuenta;
    private long DNI;
    private int saldoActual;

    public cuenta() {
    }

    public cuenta(int numeroCuenta, long DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
}
