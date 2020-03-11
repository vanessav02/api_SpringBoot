package com.teste1.projetoXBrain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.teste1.projetoXBrain.entity.Venda;
import com.teste1.projetoXBrain.repository.VendaRepository;
  
import java.util.List;

@Controller //indica que a classe é um controlador
@RequestMapping("/") //indica o caminho para acessar o controlador
public class VendaController {

	private VendaRepository vendaRepository;
	
    @Autowired //delega ao Spring Boot a inicialização do objeto
    public VendaController(VendaRepository vendaRepository) {
          this.vendaRepository = vendaRepository;
    }
    
    
  //listar as vendas por vendedor:(recebe como parâmetro o nome do vendedor, por onde é feita a busca no BD para encontrar todas as suas vendas).
      @RequestMapping(value = "/{vendedor}", method = RequestMethod.GET) //@ResquestMapping permite definir uma rota
      public String listaVendas(@PathVariable("vendedor") String vendedor_nome, Model model) { //@PathVariable indica que o valor da variável virá de uma informação da rota
            List<Venda> listaVendas = vendaRepository.findByVendedor(vendedor_nome);
            if (listaVendas != null) {
                  model.addAttribute("vendas", listaVendas);
            }
            return "listaVendas";
      }
    
//adicionar o vendedor na venda: (recebe como parâmetro o nome do vendedor)
//também recebe os dados da venda, que é feito por um formulário.
    @RequestMapping(value = "/{vendedor_nome}", method = RequestMethod.POST)
    public String adicionaVendaVendedor(@PathVariable("vendedor_nome") String vendedor_nome, Venda venda) { //@PathVariable indica que o valor da variável virá de uma informação da rota
          venda.setVendedor_nome(vendedor_nome);
          vendaRepository.save(venda);
          return "redirect:/{vendedor_nome}";
    }

}
