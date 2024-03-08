package br.com.fiap.msproduto.controller;

import br.com.fiap.msproduto.model.Produto;
import br.com.fiap.msproduto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto) {
        return produtoService.cadastrarProduto(produto);
    }

    @GetMapping("/{produtoId}")
    public ResponseEntity<?> listarUmProduto(@PathVariable Integer produtoId) {
        return produtoService.listarUmProduto(produtoId);
    }

    @PutMapping("/{produtoId}")
    public Produto atualizarProduto(@PathVariable Integer produtoId, @RequestBody Produto novoProduto) {
        return produtoService.atualizarProduto(produtoId, novoProduto);
    }

    @DeleteMapping("/{produtoId}")
    public void excluirProduto(@PathVariable Integer produtoId) {
        produtoService.excluirProduto(produtoId);
    }

    @PutMapping("/atualizar/estoque/{produtoId}/{quantidade}")
    public Produto atualizarEstoque(@PathVariable Integer produtoId, @PathVariable int quantidade) {
        return produtoService.atualizarEstoque(produtoId, quantidade);
    }
}
