package ParteB.Persistencia.de.Datos;

// Clase que representa una cuenta bancaria sencilla
public class Account {
    private String id;      // Identificador de la cuenta
    private String name;    // Nombre del titular
    private int balance;    // Saldo de la cuenta

    // Constructor por defecto: inicializa el saldo a 0
    public Account (){
        balance = 0;
    }

    // Constructor que inicializa id y nombre (el saldo queda por defecto en 0)
    public Account (String id, String name){
        this.id = id;
        this.name= name;
    }

    // Constructor completo: inicializa todos los atributos
    public Account (String id, String name, int balance){
        this.id = id;
        this.name= name;
        this.balance= balance;
    }

    // Devuelve el id de la cuenta
    public String getId() {
        return id;
    }

    // Devuelve el nombre del titular
    public String getName() {
        return name;
    }

    // Devuelve el saldo actual
    public int getBalance() {
        return balance;
    }

    // Método para ingresar dinero en la cuenta
    public int credit(int amount){
        balance += amount;   // Se suma la cantidad al saldo
        return balance;      // Se devuelve el nuevo saldo
    }

    // Método para retirar dinero de la cuenta
    public int debit(int amount){
        if (amount <= balance){   // Solo se permite si hay saldo suficiente
            balance-=amount;
        }
        else{
            System.out.println("Amount exceeded balance"); // Mensaje si no hay saldo
        }
        return balance;
    }

    // Método para transferir dinero a otra cuenta
    public int transferTo(Account another, int amount){
        if (amount <= balance){   // Comprueba si hay suficiente saldo
            this.balance -= amount;       // Resta en la cuenta actual
            another.balance += amount;    // Suma en la cuenta destino
        }
        else{
            System.out.println("Amount exceeded balance"); // Aviso si no se puede
        }
        return balance;
    }

    // Método que devuelve la información de la cuenta en formato texto
    public String toString(){
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
