package br.com.fiap.msproduto.service;

import br.com.fiap.msproduto.model.Produto;
import br.com.fiap.msproduto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 05/03/2024
 * Project Name: msproduto
 */

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;


    public List<Produto> listarProduto() {
        return produtoRepository.findAll();
    }
}
