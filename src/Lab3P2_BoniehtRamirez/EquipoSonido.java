package Lab3P2_BoniehtRamirez;

public class EquipoSonido extends Articulo {
    private int cantAltavoces, potenciaMax, cantPuertos, cantDiscos, cantUSB;

    public EquipoSonido(int cantAltavoces, int potenciaMax, int cantPuertos, int cantDiscos, int cantUSB, int numSerie, int precio, String color, String garantia) {
        super(numSerie, precio, color, garantia);
        this.cantAltavoces = cantAltavoces;
        this.potenciaMax = potenciaMax;
        this.cantPuertos = cantPuertos;
        this.cantDiscos = cantDiscos;
        this.cantUSB = cantUSB;
    }

    public int getCantAltavoces() {
        return cantAltavoces;
    }

    public void setCantAltavoces(int cantAltavoces) {
        this.cantAltavoces = cantAltavoces;
    }

    public int getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(int potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    public int getCantPuertos() {
        return cantPuertos;
    }

    public void setCantPuertos(int cantPuertos) {
        this.cantPuertos = cantPuertos;
    }

    public int getCantDiscos() {
        return cantDiscos;
    }

    public void setCantDiscos(int cantDiscos) {
        this.cantDiscos = cantDiscos;
    }

    public int getCantUSB() {
        return cantUSB;
    }

    public void setCantUSB(int cantUSB) {
        this.cantUSB = cantUSB;
    }
    
    
}
