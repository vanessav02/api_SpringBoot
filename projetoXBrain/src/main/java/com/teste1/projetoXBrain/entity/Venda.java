package com.teste1.projetoXBrain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//anotações do JPA:
@Entity //indica que a classe é uma entidade do banco de dados
public class Venda {

    @Id //campo identificador da entidade
    @GeneratedValue(strategy=GenerationType.AUTO) //indica que o valor será gerado no banco de dados
    private Long id; 

    @Column(name="data", nullable=false) //para definir alguns parâmetros das colunas
    private String data;

    @Column(name="valor", nullable=false)
    private float valor;

//    @Column(name="vendedor_id", nullable=false)
//    private String vendedor_id;

    @Column(name="vendedor", nullable=false)
    private String vendedor;    

    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long qtdadeVendaVendedor; 
    
	public Long getQtdadeVendaVendedor() {
		return qtdadeVendaVendedor+1;
	}

	public void setQtdadeVendaVendedor(Long qtdadeVendaVendedor) {
		this.qtdadeVendaVendedor = qtdadeVendaVendedor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

/*	public String getVendedor_id() {
		return vendedor_id;
	}

	public void setVendedor_id(String vendedor_id) {
		this.vendedor_id = vendedor_id;
	}*/

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor_nome(String vendedor) {
		this.vendedor = vendedor;
	}


}
