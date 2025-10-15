package VictorCode.TaskFlow.infrastructure.repository;

import VictorCode.TaskFlow.infrastructure.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario , Integer> {
}
