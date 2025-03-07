
package Proyecto;


public class Compra {
    
    private int cantArticulos;
    private boolean domicilio; 
    public double valorTotal;
    private double porcentajeDePortatiles;
    private Cliente cliente;
    private Computador computadores[]= new Computador[3];//comutadores de una compra minmimo 3;
    

    
    public Compra(){}
    public Compra(boolean domicilio) {
        this.cantArticulos = 0;
        this.domicilio = domicilio;
    }

    public int getCantArticulos() {
        return cantArticulos;
    }

    public void setCantArticulos(int cantArticulos) {
        this.cantArticulos = cantArticulos;
    }

    public boolean isDomicilio() {
        return domicilio;
    }

    public void setDomicilio(boolean domicilio) {
        this.domicilio = domicilio;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getPorcentajeDePortatiles() {
        return porcentajeDePortatiles;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Computador getComputadores(int p) {
        return computadores[p];
    }

    public void setComputadores(Computador computadores) {
        this.computadores[cantArticulos] = computadores;
        cantArticulos++;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void valorTotalPagar(){
        valorTotal=0;
        for (int i = 0; i < cantArticulos; i++) {
            valorTotal+=computadores[i].getPrecio();
        }
        if (domicilio) {
            valorTotal+=10000;
        }
    }
    
    
    
    public void porcentajePortatil(){
        int p=0;
        for (int i = 0; i < cantArticulos; i++) {
            if (computadores[i] instanceof Portatil) {
                p++;
            }
        }
        porcentajeDePortatiles=(double)p*100/cantArticulos;
        
    }
    
    
    @Override
    public String toString() {
        String cadena="Compra(" + "Cantidad de Articulos:" + cantArticulos + " Domicilio:" + domicilio + " Valor Total de la Compra" + valorTotal + " Porcentaje de Portatiles en la compra:" + porcentajeDePortatiles + " Cliente:" + cliente.toString();
        for (int i = 0; i < cantArticulos; i++) {
            cadena+=computadores[i].toString();
            
        }
      return cadena;  
        
    }
   



}
