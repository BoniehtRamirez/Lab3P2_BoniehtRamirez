package Lab3P2_BoniehtRamirez;
import java.util.ArrayList;
public class Supervisor extends Persona {
    private ArrayList<Cajero> cajeros = new ArrayList();
    private int salarioPromedio, metaPromedio;

    public Supervisor(String nombre, String apellido, String nacionalidad, String usuario, String contraseña, int salario) {
        super(nombre, apellido, nacionalidad, usuario, contraseña, salario);
        this.salarioPromedio = 0;
        this.metaPromedio = 0;
    }  

    public ArrayList<Cajero> getCajeros() {
        return cajeros;
    }
    public void setCajeros(ArrayList<Cajero> cajeros) {
        this.cajeros = cajeros;
    }
    public int getSalarioPromedio() {
        if(this.cajeros.size()==0){
            return this.salarioPromedio;
        } else {
            int acumSalario = 0;
            for (Cajero c : cajeros)
                acumSalario += c.getSalario();

            this.salarioPromedio = acumSalario/this.cajeros.size();
        }
        return this.salarioPromedio;
    }
    public void setSalarioPromedio(int salarioPromedio) {
        this.salarioPromedio = salarioPromedio;
    }
    public int getMetaPromedio() {
        if(this.cajeros.size()==0){
            return this.metaPromedio;
        } else {
            int acumPromedio = 0;
            for (Cajero c : cajeros)
                acumPromedio += c.getMeta();
            this.metaPromedio = acumPromedio/this.cajeros.size();
            return this.metaPromedio;
        }
    }
    public void setMetaPromedio(int metaPromedio) {
        this.metaPromedio = metaPromedio;
    }
    
    
}
