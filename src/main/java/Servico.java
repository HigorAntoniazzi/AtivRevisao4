import java.awt.*;

public class Servico extends Impostos{
    public Servico(String nomeProduto, Double custoProduto, Double valorProduto, Double pis, Double confins, Double icmais, Double difal) throws HeadlessException {
        super(nomeProduto, custoProduto, valorProduto, pis, confins, icmais, difal);
    }




    private Double valorIss;

    public Double getValorIss() {
        return valorIss;
    }

    public void setValorIss(Double valorIss) {
        this.valorIss = valorIss;
    }

    public void calcularRob() {

        setNomeProduto(textNomeProduto.getText());
        setCustoProduto(Double.valueOf(textCusto.getText()));
        setValorVenda(Double.valueOf(textVenda.getText()));
        setPis(Double.valueOf(textPis.getText()));
        setConfins(Double.valueOf(textConfis.getText()));
        setIcmais(Double.valueOf(textIcms.getText()));
        setDifal(Double.valueOf(textDifal.getText()));
        setValorIss(Double.valueOf(textIss.getText()));


    }


}
