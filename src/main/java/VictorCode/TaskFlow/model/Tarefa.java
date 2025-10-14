package VictorCode.TaskFlow.model;

import VictorCode.TaskFlow.model.enums.Prioridade;
import VictorCode.TaskFlow.model.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tarefa {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String descricao;

    private LocalDate dataCriacao = LocalDate.now();

    private LocalDateTime dataConclusao;

    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

    @Enumerated(EnumType.STRING)
    private Status status = Status.PENDENTE;

    @ManyToOne
    private Usuario usuario;


    void concluir(){
        if (this.status != Status.CONCLUIDA) {
            this.status = Status.CONCLUIDA;
            this.dataConclusao = LocalDateTime.now();
        }
        }


    void atrasar(){
        if (this.status == Status.PENDENTE){
            this.status = Status.ATRASADA;
        }
    }



}
