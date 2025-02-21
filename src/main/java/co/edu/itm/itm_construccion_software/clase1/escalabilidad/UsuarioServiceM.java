package co.edu.itm.itm_construccion_software.clase1.escalabilidad;

import java.util.List;

public class UsuarioServiceM {
  private final UsuarioRepository usuarioRepository;

  public UsuarioServiceM(UsuarioRepository usuarioRepository) {
    this.usuarioRepository = usuarioRepository;
  }

  public List<Usuario> obtenerUsuarios() {
    return usuarioRepository.obtenerTodos(); //✅ Consulta única optimizada
  }

}
