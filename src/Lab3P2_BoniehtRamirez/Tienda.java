package Lab3P2_BoniehtRamirez;

public class Tienda {
    private int id, cantmaxEmpleados, cantmaxCajas, cantmaxArticulos;
    private Articulo productoFav;
    private String ubicacion;

    public Tienda(int id, int cantmaxEmpleados, int cantmaxCajas, int cantmaxArticulos, Articulo productoFav, String ubicacion) {
        this.id = id;
        this.cantmaxEmpleados = cantmaxEmpleados;
        this.cantmaxCajas = cantmaxCajas;
        this.cantmaxArticulos = cantmaxArticulos;
        this.productoFav = productoFav;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantmaxEmpleados() {
        return cantmaxEmpleados;
    }

    public void setCantmaxEmpleados(int cantmaxEmpleados) {
        this.cantmaxEmpleados = cantmaxEmpleados;
    }

    public int getCantmaxCajas() {
        return cantmaxCajas;
    }

    public void setCantmaxCajas(int cantmaxCajas) {
        this.cantmaxCajas = cantmaxCajas;
    }

    public int getCantmaxArticulos() {
        return cantmaxArticulos;
    }

    public void setCantmaxArticulos(int cantmaxArticulos) {
        this.cantmaxArticulos = cantmaxArticulos;
    }

    public Articulo getProductoFav() {
        return productoFav;
    }

    public void setProductoFav(Articulo productoFav) {
        this.productoFav = productoFav;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    
}
