package br.edu.infnet.AppATMarcelo_Carlos.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppATMarcelo_Carlos.model.negocio.Produto;

@Repository
public interface IProdutoRepository extends CrudRepository<Produto, Integer> {
	
	@Query("from Produto p where p.usuario.id=:id")
	List<Produto> obterLista(Integer id, Sort by);

}
