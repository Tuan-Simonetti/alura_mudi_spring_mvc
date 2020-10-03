package br.com.alura.mvc.mudi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nomeProduto;
    private String valorNegociado;
    private String dataEntrega;
    private String urlProduto;
    private String urlImagem;
    private String descricao;



    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(final String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getValorNegociado() {
        return valorNegociado;
    }

    public void setValorNegociado(final String valorNegociado) {
        this.valorNegociado = valorNegociado;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(final String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(final String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(final String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(final String descricao) {
        this.descricao = descricao;
    }

}
