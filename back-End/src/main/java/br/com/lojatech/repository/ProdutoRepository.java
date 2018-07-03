package br.com.lojatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lojatech.domain.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

	

}
