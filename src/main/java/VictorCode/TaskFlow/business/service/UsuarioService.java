package VictorCode.TaskFlow.business.service;

import VictorCode.TaskFlow.business.DTO.UserRequestDTO;
import VictorCode.TaskFlow.business.DTO.UserResponseDTO;
import VictorCode.TaskFlow.business.exceptions.UsuarioException;
import VictorCode.TaskFlow.infrastructure.model.Usuario;
import VictorCode.TaskFlow.infrastructure.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    // Metodo registar Usuario :

    public UserResponseDTO registrarUsuario(UserRequestDTO userRequestDTO){

        // ✅ Regra de negócio: verificar se e-mail já existe
       usuarioRepository.findByEmail(userRequestDTO.email()).ifPresent(usuario ->{
           throw new UsuarioException("Usuario ja criado com esse email.");
       });


       Usuario novoUsuario = Usuario.builder()
               .nome(userRequestDTO.nome())
               .email(userRequestDTO.email())
               .build();

       usuarioRepository.save(novoUsuario);

       return new UserResponseDTO(
               novoUsuario.getId(),
               novoUsuario.getNome(),
               novoUsuario.getEmail(),
               novoUsuario.getNivelProdutividade()
       );
    }

}
