package VictorCode.TaskFlow.infrastructure.model;

import VictorCode.TaskFlow.business.service.TarefaService;
import VictorCode.TaskFlow.infrastructure.model.enums.Prioridade;
import VictorCode.TaskFlow.infrastructure.model.enums.Status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Criando Tarefa :
        Tarefa tarefa1 = Tarefa.builder()
                .titulo("Estudar Java")
                .descricao("Revisar conceitos de Polimorfismo e Enum")
                .dataCriacao(LocalDate.now())
               // .dataConclusao(LocalDateTime.now().plusHours(2))
                .prioridade(Prioridade.ALTA)
                .status(Status.ATRASADA)
                .build();


        Tarefa tarefa2 = Tarefa.builder()
                .titulo("Treinar")
                .descricao("Fazer treino de costas e bíceps")
                .dataCriacao(LocalDate.now())
                .prioridade(Prioridade.MEDIA)
                .status(Status.PENDENTE)
                .build();



        System.out.println(tarefa1);


        // Criando Lista de Tarefas :
        List<Tarefa> listaTarefa = new ArrayList<>();
        listaTarefa.add(tarefa1);
        listaTarefa.add(tarefa2);


        //Criando usuario e setando tarefas:
        Usuario usuario = new Usuario();
        usuario.setNome("Victor Gabriel");
        usuario.setTarefas(listaTarefa);



        // Optional verificando se a tarefas concluidas para retornar Produtividade:
        usuario.nivelDeProdutividade().ifPresentOrElse(
                valor -> System.out.println("Produtividade : " + valor + "%"),
                () -> System.out.println("Nenhuma tarefa cadastrada."));










    }
}
