package Lab3P2_BoniehtRamirez;


public class Televisor extends Articulo {
    
    private int tamañoPantalla, cantConexiones, grosor;
    private boolean smart;
    private String marca;

    public Televisor(int tamañoPantalla, int cantConexiones, int grosor, boolean smart, String marca, int numSerie, int precio, String color, String garantia) {
        super(numSerie, precio, color, garantia);
        this.tamañoPantalla = tamañoPantalla;
        this.cantConexiones = cantConexiones;
        this.grosor = grosor;
        this.smart = smart;
        this.marca = marca;
    }

    public int getTamañoPantalla() {
        return tamañoPantalla;
    }
    public void setTamañoPantalla(int tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }
    public int getCantConexiones() {
        return cantConexiones;
    }
    public void setCantConexiones(int cantConexiones) {
        this.cantConexiones = cantConexiones;
    }
    public int getGrosor() {
        return grosor;
    }
    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }
    public boolean isSmart() {
        return smart;
    }
    public void setSmart(boolean smart) {
        this.smart = smart;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
