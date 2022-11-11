/* @author josuerom */
import java.util.Scanner;

class bancoHBC {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        Cuenta obj = new Cuenta(123, "Kevin el loco Moreno", 150000, "CA");
    }
}

class Cuenta {
    private int numero_cuenta;
    private String nombre;
    private float saldo;
    private String tipo_cuenta;
    
    public Cuenta(int numero_cuenta, String nombre, float saldo, String tipo_cuenta) {
        this.numero_cuenta = numero_cuenta;
        this.nombre = nombre;
        this.saldo = saldo;
        this.tipo_cuenta = tipo_cuenta;
    }
    
    public void tipoCuenta() {
    }
    
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}

class CuentaAhorro extends Cuenta {
    private float interes;
    
    public void crearCuenta() {
    }
    
    public void depositar() {
    }
    
    public void retirar() {
    }
    
    public void consultarSaldo() {
        System.out.println("Su saldo actual es de: $" + getSaldo());
    }
}

class CuentaCorriente extends Cuenta {
    private float cuatro_por_mil;
    

    public void crearCuenta() {
    }
    
    public void depositar() {
    }
    
    public void retirar() {
    }
    
    public void consultarSaldo() {
        System.out.println("Su saldo actual es de: $" + getSaldo());
    }
}
