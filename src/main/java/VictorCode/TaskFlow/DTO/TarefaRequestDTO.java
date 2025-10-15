package VictorCode.TaskFlow.DTO;


import VictorCode.TaskFlow.model.enums.Prioridade;

import java.time.LocalDate;

public record TarefaRequestDTO(
        String titulo,
        String descricao,
        LocalDate dataCriacao,
        Prioridade prioridade
){}
