package Lab3P2_BoniehtRamirez;
import java.util.ArrayList;
public class AsesorFinanciero extends Persona {
    private ArrayList<Cliente> clientesAtendidos = new ArrayList();
    private int cantProductosClientes, creditosConcedidos;

    public AsesorFinanciero(int cantProductosClientes, int creditosConcedidos, String nombre, String apellido, String nacionalidad, String usuario, String contraseña, int salario) {
        super(nombre, apellido, nacionalidad, usuario, contraseña, salario);
        this.cantProductosClientes = 0;
        for (Cliente c : clientesAtendidos) {
            this.cantProductosClientes += c.getArticulosComprados().size();
        }
        this.creditosConcedidos = creditosConcedidos;
    }

    

    public ArrayList<Cliente> getClientesAtendidos() {
        return clientesAtendidos;
    }
    public void setClientesAtendidos(ArrayList<Cliente> clientesAtendidos) {
        this.clientesAtendidos = clientesAtendidos;
    }
    public int getCantProductosClientes() {
        this.cantProductosClientes = 0;
        for (Cliente c : clientesAtendidos) {
            this.cantProductosClientes += c.getArticulosComprados().size();
        }
        return this.cantProductosClientes;
    }
    public void setCantProductosClientes(int cantProductosClientes) {
        this.cantProductosClientes = cantProductosClientes;
    }
    public int getCreditosConcedidos() {
        return creditosConcedidos;
    }
    public void setCreditosConcedidos(int creditosConcedidos) {
        this.creditosConcedidos = creditosConcedidos;
    }
    
}