package VictorCode.TaskFlow.business.DTO;

import lombok.Builder;

@Builder
public record UserResponseDTO(
        Integer id,
        String nome,
        String email,
        int nivelProdutividade
        ) { }
