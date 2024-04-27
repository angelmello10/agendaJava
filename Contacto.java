public class Contacto {
    private static int contadorID = 1;
    private int id; 
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;

    public Contacto() {
        this.id = contadorID++;
    }

    public Contacto(String nombre) {
        this();
        this.nombre = nombre;
    }

    public Contacto(int id, String nombre, String apellido, String telefono, String correo) {
        this.id = (id != 0) ? id : contadorID++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Contacto(String nombre, String apellido, String telefono, String correo) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\nNombre: " + nombre + " " + apellido + "\nTelefono: " + telefono + "\nE-mail: " + correo;
    }
}
