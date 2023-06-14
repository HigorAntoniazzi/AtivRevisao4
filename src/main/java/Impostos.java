import javax.swing.*;
import java.awt.*;

public abstract class Impostos extends TelaVenda {

private String nomeProduto;

private Double custoProduto;

private Double valorVenda;

private Double pis;

private Double confins;

private  Double icmais;

private Double difal;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getCustoProduto() {
        return custoProduto;
    }

    public void setCustoProduto(Double custoProduto) {
        this.custoProduto = custoProduto;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Double getPis() {
        return pis;
    }

    public void setPis(Double pis) {
        this.pis = pis;
    }

    public Double getConfins() {
        return confins;
    }

    public void setConfins(Double confins) {
        this.confins = confins;
    }

    public Double getIcmais() {
        return icmais;
    }

    public void setIcmais(Double icmais) {
        this.icmais = icmais;
    }

    public Double getDifal() {
        return difal;
    }

    public void setDifal(Double difal) {
        this.difal = difal;
    }

    public Impostos(String nomeProduto, Double custoProduto, Double valorProduto, Double pis, Double confins, Double icmais, Double difal) throws HeadlessException {
        this.nomeProduto = nomeProduto;
        this.custoProduto = custoProduto;
        this.valorVenda = valorVenda;
        this.pis = pis;
        this.confins = confins;
        this.icmais = icmais;
        this.difal = difal;
    }

    public abstract void calcularRob();

    public String toString(){
        return "Nome Produto: "+getNomeProduto()+"/nCusto Produto: "+getCustoProduto();

    }






}
