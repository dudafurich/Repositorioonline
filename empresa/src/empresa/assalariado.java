
package empresa;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class assalariado {

    public static void main(String[] args) {
        ArrayList<assalariado> Funci = new ArrayList<assalariado>();
        String nome;
        String CPF;
        String endereco;
        int telefone;
        String setor;
        char tipo;
        int salario;
        
        nome = (JOptionPane.showInputDialog(null, "digite o nome: "));
        CPF = (JOptionPane.showInputDialog(null, "digite o CPF: "));
        endereco = (JOptionPane.showInputDialog(null, "digite o endereco: "));
        telefone = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o telefone: "));
        setor = (JOptionPane.showInputDialog(null, "digite o setor: "));
        tipo = (JOptionPane.showInputDialog(null, "digite o tipo de funcionário: a para assalariado ou h para horista ")).charAt(0);
        switch (tipo){
            case 'a': 
            case 'A': {
                salario = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o salário: "));
            }break;
            case 'h':
            case 'H': {
                salario = soma(result);
            }break;
        }
    }
    
    
}
