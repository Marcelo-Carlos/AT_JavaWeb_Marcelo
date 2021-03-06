package br.edu.infnet.AppATMarcelo_Carlos.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppATMarcelo_Carlos.model.negocio.Usuario;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Integer> {
	
	@Query("from Usuario u where u.email =: email and u.senha =: senha")
	Usuario autenticacao(String email, String senha);
	
}

