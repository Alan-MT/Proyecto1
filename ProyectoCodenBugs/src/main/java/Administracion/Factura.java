package Administracion;


public class Factura {
    
     private int NumeroFactura;
     private String Fecha;
     private String NombreMueble;
     private String NitCliente;

    public Factura(int NumeroFactura, String Fecha, String NombreMueble, String NitCliente) {
        this.NumeroFactura = NumeroFactura;
        this.Fecha = Fecha;
        this.NombreMueble = NombreMueble;
        this.NitCliente = NitCliente;
    }



    public int getNumeroFactura() {
        return NumeroFactura;
    }

    public void setNumeroFactura(int NumeroFactura) {
        this.NumeroFactura = NumeroFactura;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getNombreMueble() {
        return NombreMueble;
    }

    public String getNitCliente() {
        return NitCliente;
    }
    
     
}
