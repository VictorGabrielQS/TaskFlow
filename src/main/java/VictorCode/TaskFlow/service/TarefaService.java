package VictorCode.TaskFlow.service;

import VictorCode.TaskFlow.DTO.TarefaRequestDTO;
import VictorCode.TaskFlow.DTO.TarefaResponseDTO;
import VictorCode.TaskFlow.model.Tarefa;
import VictorCode.TaskFlow.model.Usuario;
import VictorCode.TaskFlow.model.enums.Status;
import VictorCode.TaskFlow.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;
    @Autowired
    private Usuario usuario;


    // Metodo Criar Tarefa:
    public TarefaResponseDTO criarTarefa(TarefaRequestDTO dto){


        //Cria uma nova Tarefa com Builder
        Tarefa novaTarefa = Tarefa.builder()
                .titulo(dto.titulo())
                .descricao(dto.descricao())
                .prioridade(dto.prioridade())
                .build();


        //Insere a tarefa no banco de Dados
        Tarefa tarefaSalva = tarefaRepository.save(novaTarefa);


        return TarefaResponseDTO.builder()
                .id(tarefaSalva.getId())
                .titulo(tarefaSalva.getTitulo())
                .descricao(tarefaSalva.getDescricao())
                .prioridade(tarefaSalva.getPrioridade())
                .status(tarefaSalva.getStatus())
                .dataCriacao(tarefaSalva.getDataCriacao())
                .build();

    }



    // Metodo atualizar Status da Tarefa:
    public TarefaResponseDTO atualizarStatusTarefa(Integer id , Status novoStatus){

        // Busca Tarefa no Banco de dados
        Tarefa tarefa = tarefaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa Não Encontrada!"));

        // Atualiza estatus da tarefa
        tarefa.setStatus(novoStatus);

        // Salva no banco de dados a tarefa atualizada
        tarefaRepository.save(tarefa);

        // Monta a resposta e retorna
        return TarefaResponseDTO.builder()
                .titulo(tarefa.getTitulo())
                .descricao(tarefa.getDescricao())
                .status(tarefa.getStatus())
                .prioridade(tarefa.getPrioridade())
                .dataCriacao(tarefa.getDataCriacao())
                .build();

    }


    // Metodo Calcular Progresso :
    public Optional<String> calcularProgresso(){
        return  Optional.ofNullable(usuario.getTarefas()).
    }

}
