package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/produtos")
public class ProdutoController {
    @GetMapping
    public String produtosEmEstoque(){
        return "Produtos em estoque...";
    }
}
