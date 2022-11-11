/* @author josuerom */
import java.util.Scanner;

class bancoHBC {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        Cuenta obj = new Cuenta(123, "Kevin el loco Moreno", 150000, "CA");
        
        /*do {
            System.out.println("MENU DE OPCIONES. Presione");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.println("------------------------------");
            System.out.print("Digite su opcion: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1: System.out.println("Hola");
                break;
                case 2: 
                break;
                case 3: 
                break;
                default: System.out.println("La opcion no existe, gracias por usar nuestro software.");
            }
        } while (opcion != 4);*/
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
        System.out.println("Su saldo actual es de: $" + saldo);
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
        System.out.println("Su saldo actual es de: $" + saldo);
    }
}
