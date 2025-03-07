
package Proyecto;



public class Portatil extends Computador {
    
    private boolean guaya;
    private boolean cd;

    public Portatil(boolean guaya, boolean cd, String codigo, String marca, double precio, int ram, int almacenamiento, double velProcesamiento) {
        super(codigo, marca, precio, ram, almacenamiento, velProcesamiento);
        this.guaya = guaya;
        this.cd = cd;
    }

    public boolean isGuaya() {
        return guaya;
    }

    public void setGuaya(boolean guaya) {
        this.guaya = guaya;
    }

    public boolean isCd() {
        return cd;
    }

    public void setCd(boolean cd) {
        this.cd = cd;
    }

    @Override
    public String toString() {
        return super.toString()+ "Guaya: " + guaya + " CD:" + cd;
    }
    
    
}
