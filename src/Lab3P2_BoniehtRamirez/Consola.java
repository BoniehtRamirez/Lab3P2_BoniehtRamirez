package Lab3P2_BoniehtRamirez;

public class Consola extends Articulo {
    private String marca,infoTarjeta;
    private int almacenamiento, cantControles, numAccesorios;

    public Consola(String marca, String infoTarjeta, int almacenamiento, int cantControles, int numAccesorios, int numSerie, int precio, String color, String garantia) {
        super(numSerie, precio, color, garantia);
        this.marca = marca;
        this.infoTarjeta = infoTarjeta;
        this.almacenamiento = almacenamiento;
        this.cantControles = cantControles;
        this.numAccesorios = numAccesorios;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getInfoTarjeta() {
        return infoTarjeta;
    }

    public void setInfoTarjeta(String infoTarjeta) {
        this.infoTarjeta = infoTarjeta;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getCantControles() {
        return cantControles;
    }

    public void setCantControles(int cantControles) {
        this.cantControles = cantControles;
    }

    public int getNumAccesorios() {
        return numAccesorios;
    }

    public void setNumAccesorios(int numAccesorios) {
        this.numAccesorios = numAccesorios;
    }
    
    
}
