import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Agenda {
    
    private ArrayList <Contacto> contactos;

    public Agenda(){

        contactos = new ArrayList<>();
    }
        public ArrayList<Contacto> getContactos(){
            return contactos;
        }
            
        


    public void agregarContacto(Contacto contacto){
        contactos.add(contacto);
        JOptionPane.showMessageDialog(null, "Agregaste el siguiente contacto nuevo:\n " + contacto);
    }
    
    public void verContacto() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Contactos:\n");
        if(contactos.size() >= 1){
        for (Contacto contacto : contactos) {
            mensaje.append(contacto.toString()).append("\n"); // Agrega la representación de cada contacto a la cadena
        }
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Lista de Contactos", JOptionPane.PLAIN_MESSAGE);
    }else {
        JOptionPane.showMessageDialog(null,"Agenda vacía!", null, 0);

    }

    }

   
    public Contacto buscarContacto(String nombre){
            for(Contacto contacto : contactos){
                if(contacto.getNombre().equalsIgnoreCase(nombre)){
                    return contacto;
                }
            }
                return null;
        }   
        public void editarContacto(int id, String nuevoNombre, String nuevoApellido, String nuevoTel, String nuevoCorreo) {
          
                
                    for (Contacto contacto : contactos) {
                    
                        if (contacto.getId() == id) {
                           JOptionPane.showInputDialog("Ingresa el nuevo nombre: ");
                            contacto.setNombre(nuevoNombre);
                            contacto.setApellido(nuevoApellido);
                            contacto.setTelefono(nuevoTel);
                            contacto.setCorreo(nuevoCorreo);
                            JOptionPane.showMessageDialog(null, "Contacto editado correctamente");
                            return;
                        }
                    }
                
            // Si el contacto no se encuentra, mostramos un mensaje de error
            JOptionPane.showMessageDialog(null, "No se encontró ningún contacto con el ID proporcionado", "Error", JOptionPane.ERROR_MESSAGE);
                        }
    
        public void eliminarContacto(int id) {
            // Verificar si la lista de contactos está vacía
            if (contactos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La lista de contactos está vacía", "Error", JOptionPane.ERROR_MESSAGE);
                return;              
            }
        
            boolean encontrado = false; // Variable para controlar si se encuentra el contacto
            
            // Recorremos la lista de contactos
            
            for (int i = 0; i < contactos.size(); i++) {
                Contacto contacto = contactos.get(i);
                
                // Verificamos si el contacto tiene el ID que estamos buscando
                if (contacto.getId() == id) {
                    contactos.remove(i); // Eliminamos el contacto de la lista
                    JOptionPane.showMessageDialog(null, "Contacto: " + contacto.getNombre() + " eliminado");
                    encontrado = true; // Marcamos que hemos encontrado el contacto
                    break;
                }
            }
        
            // Si no se encontró el contacto, mostrar un mensaje
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "No se encontró el contacto con el ID proporcionado!");   
            }
        }
        
   
        }
    
        
    
