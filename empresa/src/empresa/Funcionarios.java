
package empresa;

import javax.swing.JOptionPane;

public abstract class Funcionarios {
    int horas;
    int valorh;
    int result;
    public int soma() {
    horas = Integer.parseInt(JOptionPane.showInputDialog(null, "digite as horas trabalhadas: "));
    valorh = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o valor da hora: "));
    result = horas * valorh;
    return result;
    }
}
