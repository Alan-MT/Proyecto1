package Fabrica;


public class Piezas {
    
    private int Codigo;
    private String TipoPieza;
    private double Costo; 

    public Piezas(int Codigo, String TipoPieza, double Costo) {
        this.Codigo = CodigoRandom();
        this.TipoPieza = TipoPieza;
        this.Costo = Costo;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getTipoPieza() {
        return TipoPieza;
    }

    public void setTipoPieza(String TipoPieza) {
        this.TipoPieza = TipoPieza;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }
    
    public int CodigoRandom(){
        return (int)(Math.random()*(1000-1)+1);
    }
    
}
