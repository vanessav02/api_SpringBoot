package com.teste1.projetoXBrain.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.teste1.projetoXBrain.entity.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long>{

    /*
     * Encontra todas as vendas para um determinado vendedor
     * 
     * @param vendedor_nome
     * @return lista de vendedores
     */
    List<Venda> findByVendedor(String vendedor_nome);
	
}
