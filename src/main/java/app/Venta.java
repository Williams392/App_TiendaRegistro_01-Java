
package app;

//  Almacenar y Gestionar
public class Venta {
    String Nomnbre;
    int DNI;
    int id;
    int cantidad;
    double precio;
    double importe;
    String descripcion;
    
    public String getNombre() {
        return Nomnbre;
    }

    public void setNomnbre(String Nomnbre) {
        this.Nomnbre = Nomnbre;
    }
    
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public Venta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
