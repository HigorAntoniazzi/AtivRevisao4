import java.awt.*;

public class Produto extends Impostos{

    double rob;
    public Produto(String nomeProduto, Double custoProduto, Double valorProduto, Double pis, Double confins, Double icmais, Double difal, Double valorFrete) throws HeadlessException {
        super(nomeProduto, custoProduto, valorProduto, pis, confins, icmais, difal);
        this.valorFrete = valorFrete;
    }

    private Double valorFrete;

    public Double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public void calcularRob() {

        setNomeProduto(textNomeProduto.getText());
        setCustoProduto(Double.valueOf(textCusto.getText()));
        setValorVenda(Double.valueOf(textVenda.getText()));
        setPis(Double.valueOf(textPis.getText()));
        setConfins(Double.valueOf(textConfis.getText()));
        setIcmais(Double.valueOf(textIcms.getText()));
        setDifal(Double.valueOf(textDifal.getText()));
        setValorFrete(Double.valueOf(textFrete.getText()));

         rob = ((getValorVenda() - getCustoProduto() - getPis() - getConfins()  - getDifal() - valorFrete)/ getValorVenda()) * 100;
    }



    @Override
    public String toString() {
        return super.toString()+"/nROB: "+produto;
    }
}
