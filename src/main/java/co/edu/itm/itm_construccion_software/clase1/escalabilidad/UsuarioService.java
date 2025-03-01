package co.edu.itm.itm_construccion_software.clase1.escalabilidad;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
  public List<Usuario> obtenerUsuarios() {
    List<Usuario> usuarios = new ArrayList<>();
    for (int i = 0; i < 1000000; i++) {
      usuarios.add(getUsuarioDesdeDB(i)); //Llamadas innecesarias a la BD
    }
    return usuarios;
  }

  private Usuario getUsuarioDesdeDB(int i) {
    // Implementacion
    return null;
  }
}
