package capitulo07.bloque04;

public interface CalculationListener {

	public void resultOverThousand(CalculationEvent e);
	
	public void resultIsNegative(CalculationEvent e);
	
	public void dividerIsZero();
	
	public void numIsNegative(CalculationEvent e);
	
}
