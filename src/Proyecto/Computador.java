
package Proyecto;


public class Computador {
    
    protected String codigo;
    protected String marca;
    protected double precio;
    protected int ram;
    protected int almacenamiento;
    protected double velProcesamiento;
    
    public Computador(){
    }

    public Computador(String codigo, String marca, double precio, int ram, int almacenamiento, double velProcesamiento) {
        this.codigo = codigo;
        this.marca = marca;
        this.precio = precio;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.velProcesamiento = velProcesamiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public double getVelProcesamiento() {
        return velProcesamiento;
    }

    public void setVelProcesamiento(double velProcesamiento) {
        this.velProcesamiento = velProcesamiento;
    }

    @Override
    public String toString() {
        return "Código:" + codigo + " Marca:" + marca + 
              "\n Precio $" + precio + " Ram:" + ram + 
              "\nAlmacenamiento:" + almacenamiento + "Vel.Proces:" + velProcesamiento;
        
    }
    
    
    
    
}
