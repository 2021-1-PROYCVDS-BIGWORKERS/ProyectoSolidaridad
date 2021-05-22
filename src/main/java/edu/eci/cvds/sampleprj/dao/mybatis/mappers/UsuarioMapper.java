package edu.eci.cvds.sampleprj.dao.mybatis.mappers;
import edu.eci.cvds.samples.entities.Usuario;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsuarioMapper {
    List<Usuario> consultarUsuarios();

    Usuario consultarUsuario(@Param("correo") String correo);
}
