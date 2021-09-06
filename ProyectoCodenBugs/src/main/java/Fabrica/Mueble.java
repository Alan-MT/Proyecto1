package Fabrica;

public class Mueble {
    
    private int Identificador;
    private String Nombre;
    private double Precio;
    private String FechaEnsamble;
    private String Ensamblador;
    private int CantidadPiezas;

    public Mueble(int Identificador, String Nombre, Double Precio, String FechaEnsamble, String Ensamblador, int CantidadPiezas) {
        this.Identificador = Identificador;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.FechaEnsamble = FechaEnsamble;
        this.Ensamblador = Ensamblador;
        this.CantidadPiezas = CantidadPiezas;
    }

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int Identificador) {
        this.Identificador = Identificador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public String getFechaEnsamble() {
        return FechaEnsamble;
    }

    public void setFechaEnsamble(String FechaEnsamble) {
        this.FechaEnsamble = FechaEnsamble;
    }

    public String getEnsamblador() {
        return Ensamblador;
    }

    public void setEnsamblador(String Ensamblador) {
        this.Ensamblador = Ensamblador;
    }

    public int getCantidadPiezas() {
        return CantidadPiezas;
    }

    public void setCantidadPiezas(int CantidadPiezas) {
        this.CantidadPiezas = CantidadPiezas;
    }
    
    
   }