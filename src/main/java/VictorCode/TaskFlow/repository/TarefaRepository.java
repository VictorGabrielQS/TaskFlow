package VictorCode.TaskFlow.repository;

import VictorCode.TaskFlow.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {

}
