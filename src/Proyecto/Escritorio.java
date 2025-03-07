package Proyecto;



public class Escritorio extends Computador{
    
    private int cantPerSalida;
    private int cantPerEntrada;

    public Escritorio(int cantPerSalida, int cantPerEntrada, String codigo, String marca, double precio, int ram, int almacenamiento, double velProcesamiento) {
        super(codigo, marca, precio, ram, almacenamiento, velProcesamiento);
        this.cantPerSalida = cantPerSalida;
        this.cantPerEntrada = cantPerEntrada;
    }

    public int getCantPerSalida() {
        return cantPerSalida;
    }

    public void setCantPerSalida(int cantPerSalida) {
        this.cantPerSalida = cantPerSalida;
    }

    public int getCantPerEntrada() {
        return cantPerEntrada;
    }

    public void setCantPerEntrada(int cantPerEntrada) {
        this.cantPerEntrada = cantPerEntrada;
    }

    @Override
    public String toString() {
        return super.toString()+"Cantidad de Perifericos de Salida" + cantPerSalida + " Cantidad de Perifericos de Entrada" + cantPerEntrada ;
    }
    
    
}
