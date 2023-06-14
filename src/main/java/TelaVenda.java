import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class TelaVenda extends JFrame {
    Produto produto;
    public JTextField textNomeProduto;
    public JTextField textCusto;
    public JTextField textVenda;
    public JTextField textPis;
    public JTextField textConfis;
    public JTextField textIcms;
    public JTextField textDifal;
    public JTable tableValores;
    public JTextField textFrete;
    public JTextField textIss;
    public JPanel panelRob;
    private JButton calcularButton;
    private JTextField textResultado;
    private JComboBox comboValores;
public TelaVenda() {



    calcularButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           // Double rob = ((produto.getValorVenda() - produto.getCustoProduto() - produto.getPis() - produto.getConfins()  - produto.getDifal() - produto.getValorFrete())/ produto.getValorVenda()) * 100;
            String nome = (textNomeProduto.getText());
            Double custo = (Double.valueOf(textCusto.getText()));
            Double venda = (Double.valueOf(textVenda.getText()));
            Double pis = (Double.valueOf(textPis.getText()));
            Double confis = (Double.valueOf(textConfis.getText()));
            Double icms = (Double.valueOf(textIcms.getText()));
            Double difal = (Double.valueOf(textDifal.getText()));
            Double frete = (Double.valueOf(textFrete.getText()));

           Double somaRob = ((venda - custo - pis - confis - icms - difal - frete)/ venda) * 100;

           textResultado.setText(somaRob.toString());
        }
    });
}
}
