package VictorCode.TaskFlow.infrastructure.model;

import VictorCode.TaskFlow.infrastructure.model.enums.Status;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String nome;

    @NotBlank
    private String email;

    private int nivelProdutividade;

    private List<Tarefa> tarefas;


    public Optional<Double> nivelDeProdutividade() {
        return Optional.ofNullable(tarefas)
                .filter(list -> !list.isEmpty())

                .map(listaTarefas -> {
                    long concluidas = listaTarefas.stream()
                            .filter(tarefa -> tarefa.getStatus()
                                    .equals(Status.CONCLUIDA))
                                            .count();

                    return (concluidas * 100.0) / listaTarefas.size();

                });

    }


}
