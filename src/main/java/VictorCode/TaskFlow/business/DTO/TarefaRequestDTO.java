package VictorCode.TaskFlow.business.DTO;


import VictorCode.TaskFlow.infrastructure.model.enums.Prioridade;

import java.time.LocalDate;

public record TarefaRequestDTO(
        String titulo,
        String descricao,
        LocalDate dataCriacao,
        Prioridade prioridade
){}
