import javax.swing.JOptionPane;
import java.lang.Integer;
public class App {
    public static void main(String[] args) {

        Agenda miAgenda = new Agenda();

        // Menú de opciones
        int opcion;
        do {
            String opcionStr = JOptionPane.showInputDialog("=== Menú ===\n"
                    + "1. Agregar contacto\n"
                    + "2. Ver contactos\n"
                    + "3. Eliminar contacto\n"
                    + "4. Editar contacto\n"
                    + "5. Salir\n"
                    + "Seleccione una opción:");
            opcion = Integer.parseInt(opcionStr);

            switch (opcion) {
                case 1: 
                        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del contacto: ");
                        String apellido = JOptionPane.showInputDialog("Ingresa el apellido: ");
                        String telefono = JOptionPane.showInputDialog("Ingresa el número de telefono:");
                        String correo  = JOptionPane.showInputDialog("Agrega el Email:");
                        Contacto newContact = new Contacto(nombre, apellido, telefono, correo);
                        miAgenda.agregarContacto(newContact);
                        break;
                case 2:
                        miAgenda.verContacto();
                        break;
                case 3: 
                      if(miAgenda.getContactos().isEmpty()){
                        JOptionPane.showMessageDialog(null, "No hay contactos en la agenda!", "error", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                        String idString = JOptionPane.showInputDialog("Ingresa el id del contacto a eliminar:");
                        miAgenda.eliminarContacto(Integer.parseInt(idString));
                        break;       
                
                case 4:
                if (miAgenda.getContactos().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay contactos en la agenda", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                    
                    int idContacto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id del contacto:"));

                    String nuevoNombre = JOptionPane.showInputDialog("Ingresa el nuevo nombre: ");
                    String nuevoApellido = JOptionPane.showInputDialog("Ingresa el apellido nuevo: ");
                    String nuevoTel =JOptionPane.showInputDialog("Ingresa el nuevo teléfono (10 digitos)");
                    String nuevoCorreo = JOptionPane.showInputDialog("Ingresa el nuevo correo: ");

                    miAgenda.editarContacto(idContacto, nuevoNombre, nuevoApellido, nuevoTel, nuevoCorreo);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Adios!");
                    break;
                    } 
                
                 }while(opcion != 5);
            }
        }