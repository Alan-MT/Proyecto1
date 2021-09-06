package Personas;

public class Usuario {
    private String NombreU;
    private String Password;
    private int Codigo;

    public Usuario(String NombreU, String Password, int Codigo) {
        this.NombreU = NombreU;
        this.Password = Password;
        this.Codigo = Codigo;
    }
    
    public String getNombreU() {
        return NombreU;
    }

    public String getPassword() {
        return Password;
    }

    public int getCodigo() {
        return Codigo;
    }
    
}
