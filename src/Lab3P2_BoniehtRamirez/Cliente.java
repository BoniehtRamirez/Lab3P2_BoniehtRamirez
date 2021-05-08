package Lab3P2_BoniehtRamirez;
import java.util.ArrayList;
public class Cliente extends Persona{
    private int cantCredito, cantCompras;
    private ArrayList<Articulo> articulosComprados = new ArrayList();
    private String domicilio;

    public Cliente(int cantCredito, int cantCompras, String domicilio, String nombre, String apellido, String nacionalidad, String usuario, String contraseña, int salario) {
        super(nombre, apellido, nacionalidad, usuario, contraseña, salario);
        this.cantCredito = cantCredito;
        this.cantCompras = cantCompras;
        this.domicilio = domicilio;
    }

    public int getCantCredito() {
        return cantCredito;
    }

    public void setCantCredito(int cantCredito) {
        this.cantCredito = cantCredito;
    }

    public int getCantCompras() {
        return cantCompras;
    }

    public void setCantCompras(int cantCompras) {
        this.cantCompras = cantCompras;
    }

    public ArrayList<Articulo> getArticulosComprados() {
        return articulosComprados;
    }

    public void setArticulosComprados(ArrayList<Articulo> articulosComprados) {
        this.articulosComprados = articulosComprados;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cantCredito=" + cantCredito + ", cantCompras=" + cantCompras + ", articulosComprados=" + articulosComprados + ", domicilio=" + domicilio + '}';
    }
    
}
