import javax.swing.JOptionPane;

public class Entrada_joption {
    
public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog(message:"Digite seu nome:");

    String idade = JOptionPane.showInputDialog(message:"Digite sua idade");

    double altura = Double parseDouble(JOptionPane.showInputDialog(message:"digite sua altura:"));

    int idadeStr = Interger.parseInt(idade);

    JOptionPane.showMessageDialog(null, nome + idade+ altura);
    
}
}
