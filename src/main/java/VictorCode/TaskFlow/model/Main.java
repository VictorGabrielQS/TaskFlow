package VictorCode.TaskFlow.model;

import VictorCode.TaskFlow.model.enums.Prioridade;
import VictorCode.TaskFlow.model.enums.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Criando Tarefa :
        Tarefa tarefa = Tarefa.builder()
                .titulo("Estudar Java")
                .descricao("Revisar conceitos de Polimorfismo e Enum")
                .dataCriacao(LocalDate.now())
               // .dataConclusao(LocalDateTime.now().plusHours(2))
                .prioridade(Prioridade.ALTA)
                .status(Status.ATRASADA)
                .build();



        System.out.println(tarefa);


        // Criando Lista de Tarefas :
        List<Tarefa> listaTarefa = new ArrayList<>();
        listaTarefa.add(tarefa);

        //Criando usuario e setando tarefas:
        Usuario usuario = new Usuario();
        usuario.setTarefas(listaTarefa);


        // Optional verificando se a tarefas concluidas para retornar Produtividade:
        usuario.nivelDeProdutividade().ifPresentOrElse(
                valor -> System.out.println("Produtividade : " + valor + "%"),
                () -> System.out.println("Nenhuma tarefa cadastrada."));








    }
}
