package VictorCode.TaskFlow.infrastructure.repository;

import VictorCode.TaskFlow.infrastructure.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {

}
