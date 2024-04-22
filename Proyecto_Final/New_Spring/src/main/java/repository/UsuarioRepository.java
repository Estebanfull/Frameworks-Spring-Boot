package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    // Método para buscar usuarios por su dirección de correo electrónico
    Optional<Usuario> findByCorreoElectronico(String correoElectronico);
    
    // Método para buscar usuarios por su tipo de asistencia
    List<Usuario> findByTipoDeAsistencia(String tipoDeAsistencia);
    
    // Método para buscar usuarios por su nombre, ignorando mayúsculas y minúsculas
    List<Usuario> findByNombreIgnoreCase(String nombre);
    
    // Método para buscar usuarios por su dirección, ignorando mayúsculas y minúsculas
    List<Usuario> findByDireccionIgnoreCase(String direccion);
    
    // Método para contar el número de usuarios por su tipo de asistencia
    long countByTipoDeAsistencia(String tipoDeAsistencia);
    
    // Método para contar el número de usuarios por su dirección
    long countByDireccion(String direccion);
    
    // Método para buscar usuarios por su nombre y tipo de asistencia
    List<Usuario> findByNombreAndTipoDeAsistencia(String nombre, String tipoDeAsistencia);
    
    // Método para buscar usuarios cuyo nombre contenga una cadena específica
    List<Usuario> findByNombreContaining(String nombre);
    
    // Método para buscar usuarios cuya dirección contenga una cadena específica
    List<Usuario> findByDireccionContaining(String direccion);
}
