package Lab3P2_BoniehtRamirez;

public class Teatro extends Articulo {
   private int cantAltavoces, cantBluRay;
   private String infoLimpieza, infoLector;

    public Teatro(int cantAltavoces, int cantBluRay, String infoLimpieza, String infoLector, int numSerie, int precio, String color, String garantia) {
        super(numSerie, precio, color, garantia);
        this.cantAltavoces = cantAltavoces;
        this.cantBluRay = cantBluRay;
        this.infoLimpieza = infoLimpieza;
        this.infoLector = infoLector;
    }

    public int getCantAltavoces() {
        return cantAltavoces;
    }
    public void setCantAltavoces(int cantAltavoces) {
        this.cantAltavoces = cantAltavoces;
    }
    public int getCantBluRay() {
        return cantBluRay;
    }
    public void setCantBluRay(int cantBluRay) {
        this.cantBluRay = cantBluRay;
    }
    public String getInfoLimpieza() {
        return infoLimpieza;
    }
    public void setInfoLimpieza(String infoLimpieza) {
        this.infoLimpieza = infoLimpieza;
    }
    public String getInfoLector() {
        return infoLector;
    }
    public void setInfoLector(String infoLector) {
        this.infoLector = infoLector;
    }
     
}