package beans;

public class Usuarios {
    
    private int id_usuario;
    private String nombre_usuario;
    private String apellidos_usuario;
    private String email;
    private String apodo;
    private String contrasena;
    private short fichas;

    public Usuarios(int id_usuario, String nombre_usuario, String apellidos_usuario, String email, String apodo, String contrasena, short fichas) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.apellidos_usuario = apellidos_usuario;
        this.email = email;
        this.apodo = apodo;
        this.contrasena = contrasena;
        this.fichas = fichas;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellidos_usuario() {
        return apellidos_usuario;
    }

    public void setApellidos_usuario(String apellidos_usuario) {
        this.apellidos_usuario = apellidos_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public short getFichas() {
        return fichas;
    }

    public void setFichas(short fichas) {
        this.fichas = fichas;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "id_usuario=" + id_usuario + ", nombre_usuario=" + nombre_usuario 
                + ", apellidos_usuario=" + apellidos_usuario + ", email=" + email + ", apodo=" 
                + apodo + ", contrasena=" + contrasena + ", fichas=" + fichas + '}';
    }
    
    
    
    
}
