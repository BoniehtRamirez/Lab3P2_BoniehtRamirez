package Lab3P2_BoniehtRamirez;

public class Cajero extends Persona{
    private int añosLaborando, meta;
    private String horaTrabajo, horaAlmuerzo;

    public Cajero(int añosLaborando, int meta, String horaTrabajo, String horaAlmuerzo, String nombre, String apellido, String nacionalidad, String usuario, String contraseña, int salario) {
        super(nombre, apellido, nacionalidad, usuario, contraseña, salario);
        this.añosLaborando = añosLaborando;
        this.meta = meta;
        this.horaTrabajo = horaTrabajo;
        this.horaAlmuerzo = horaAlmuerzo;
    }

    public int getAñosLaborando() {
        return añosLaborando;
    }

    public void setAñosLaborando(int añosLaborando) {
        this.añosLaborando = añosLaborando;
    }

    public int getMeta() {
        return meta;
    }

    public void setMeta(int meta) {
        this.meta = meta;
    }

    public String getHoraTrabajo() {
        return horaTrabajo;
    }

    public void setHoraTrabajo(String horaTrabajo) {
        this.horaTrabajo = horaTrabajo;
    }

    public String getHoraAlmuerzo() {
        return horaAlmuerzo;
    }

    public void setHoraAlmuerzo(String horaAlmuerzo) {
        this.horaAlmuerzo = horaAlmuerzo;
    }    
       
}