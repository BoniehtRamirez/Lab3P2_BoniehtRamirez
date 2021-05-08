package Lab3P2_BoniehtRamirez;

public class Articulo {
    private int numSerie,precio;
    private String color, garantia;

    public Articulo(int numSerie, int precio, String color, String garantia) {
        this.numSerie = numSerie;
        this.precio = precio;
        this.color = color;
        this.garantia = garantia;
    }

    public int getNumSerie() {
        return numSerie;
    }
    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getGarantia() {
        return garantia;
    }
    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "Articulo{" + "numSerie=" + numSerie + ", precio=" + precio + '}';
    }
    
}