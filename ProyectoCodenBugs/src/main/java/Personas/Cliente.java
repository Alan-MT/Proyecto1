package Personas;

public class Cliente {
    
    private String NIT;
    private String Nombre;
    private String Direccion;
    private String Municipio;
    private String Departamento;

    public Cliente(String NIT, String Nombre, String Direccion, String Municipio, String Departamento) {
        this.NIT = NIT;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Municipio = Municipio;
        this.Departamento = Departamento;
    }

    public Cliente(String NIT, String Nombre) {
        this.NIT = NIT;
        this.Nombre = Nombre;
        this.Direccion = "Ciudad";
    }

    public String getNIT() {
        return NIT;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public String getDepartamento() {
        return Departamento;
    }
    
    
    
}
