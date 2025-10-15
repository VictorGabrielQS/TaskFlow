package VictorCode.TaskFlow.business.service;

import VictorCode.TaskFlow.business.DTO.UserRequestDTO;
import VictorCode.TaskFlow.business.DTO.UserResponseDTO;
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

        Optional.ofNullable(usuarioRepository)

        Usuario novoUsuario =

        usuarioRepository.save()
        return UserResponseDTO();
    }

}
