package br.com.fiap.msproduto.controller;

import br.com.fiap.msproduto.model.Produto;
import br.com.fiap.msproduto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 05/03/2024
 * Project Name: msproduto
 */

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;


    @GetMapping
    public List<Produto> listarProdutos() {
        return produtoService.listarProduto();
    }
}
