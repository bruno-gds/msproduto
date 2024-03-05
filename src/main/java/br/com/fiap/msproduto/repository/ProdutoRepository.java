package br.com.fiap.msproduto.repository;

import br.com.fiap.msproduto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 05/03/2024
 * Project Name: msproduto
 */

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
