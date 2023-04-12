package capitulo07.bloque04;

import javax.swing.JOptionPane;

public class Calculation implements CalculationListener {

	public Calculation() {
		Main.addCalculationListener(this);
	}
	
	@Override
	public void resultOverThousand(CalculationEvent e) {
		JOptionPane.showMessageDialog(null, "El resultado es mayor que mil: " + e.getResult());
	}

	@Override
	public void resultIsNegative(CalculationEvent e) {
		JOptionPane.showMessageDialog(null, "El resultado es negativo: " + e.getResult());
	}

	@Override
	public void dividerIsZero() {
		JOptionPane.showMessageDialog(null, "El divisor no puede ser cero");
	}

	@Override
	public void numIsNegative(CalculationEvent e) {
		JOptionPane.showMessageDialog(null, "El número introducido no puede ser negativo: " + e.getNum());
	}

}
