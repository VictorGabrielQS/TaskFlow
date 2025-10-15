package VictorCode.TaskFlow.DTO;

import VictorCode.TaskFlow.model.enums.Prioridade;
import VictorCode.TaskFlow.model.enums.Status;
import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
public record TarefaResponseDTO(

        Integer id,
        String titulo,
        String descricao,
        LocalDate dataCriacao,
        LocalDateTime dataConclusao,
        Prioridade prioridade,
        Status status

) {}
