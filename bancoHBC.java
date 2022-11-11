/* @author josuerom */
import java.util.Scanner;

class bancoHBC {
    public static void main(String[] args) {
        Cuenta obj = new Cuenta(System.in);
        obj.inicio();
    }
}

class Cuenta {
    Scanner sc = new Scanner(System.in);
    private int numero_cuenta;
    private String nombre;
    private float saldo;
    
    public Cuenta(int numero_cuenta, String nombre, float saldo) {
        this.numero_cuenta = numero_cuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public void inicio() {
        int opción = 0;
        String cuenta = "";
        do {
            System.out.println("MENU DE OPCIONES. Presione");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Salir");
            System.out.println("------------------------------");
            System.out.print("Digite su opción: ");
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.print("Que tipo de cuenta desea [CA o CC]");
                cuenta = sc.next();
                cuenta.toUpperCase();
                if (cuenta.equals("CA")) {
                    CuentaAhorro obj1 = new CuentaAhorro();
                    obj1.crearCuenta();
                } else {
                    CuentaCorriente obj2 = new CuentaCorriente();
                    obj2.crearCuenta();
                }
            }
        } while (opcion != 6);
    }
}

class CuentaAhorro extends Cuenta {
    private float interes;
    
    public CuentaAhorro() {
    }
    
    public void crearCuenta() {
    }
    
    public void depositar() {
    }
    
    public void retirar() {
    }
    
    public void consultarSaldo() {
        System.out.println("Su saldo actual es de: $" + saldo);
    }
}

class CuentaCorriente extends Cuenta {
    private cuatro_por_mil;
    
    public CuentaCorriente() {
    }

    public void crearCuenta() {
    }
    
    public void depositar() {
    }
    
    public void retirar() {
    }
    
    public void consultarSaldo() {
        System.out.println("Su saldo actual es de: $" + saldo);
    }
}
