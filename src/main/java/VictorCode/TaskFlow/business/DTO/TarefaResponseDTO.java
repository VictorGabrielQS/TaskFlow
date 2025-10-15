package VictorCode.TaskFlow.business.DTO;

import VictorCode.TaskFlow.infrastructure.model.enums.Prioridade;
import VictorCode.TaskFlow.infrastructure.model.enums.Status;
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
