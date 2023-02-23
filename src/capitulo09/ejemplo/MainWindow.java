package capitulo09.ejemplo;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainWindow extends JFrame {
	
	public MainWindow() {
		super("Título de la ventana");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		this.setContentPane(getMainPanel());
	}
	
	/**
	 * @return
	 */
	private JPanel getMainPanel() {
		JPanel jpn = new JPanel();
		
		jpn.setLayout(new GridBagLayout());
		
		// Primer elemento en la primera fila
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.NONE;
		c.weightx = 0;
		c.insets = new Insets(10, 10, 10, 10);
		c.anchor = GridBagConstraints.EAST;
		
		JLabel jlb = new JLabel("Introduzca el ID:");
		jpn.add(jlb, c);
		
		// Segundo elemento, a la derecha en la primera fila
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1;
		
		JTextField jtf = new JTextField("Texto dentro");
		jpn.add(jtf, c);
		
		// Tercer elemento, un botón a la derecha en la primera fila
		c = new GridBagConstraints();
		c.gridx = 2;
		c.gridy = 0;
		c.fill = GridBagConstraints.NONE;
		c.weightx = 0;
		
		JButton jbt = new JButton("Botón");
		jpn.add(jbt, c);
		
		// Primer elemento en la segunda fila
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.NONE;
		c.weightx = 0;
		
		JLabel jlb2 = new JLabel("Introduzca el identificador:");
		jpn.add(jlb2, c);
		
		// Segundo elemento, a la derecha en la segunda fila
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1;
		
		JTextField jtf2 = new JTextField("Texto dentro");
		jpn.add(jtf2, c);
		
		// Tercer elemento, un botón a la derecha en la segunda fila
		c = new GridBagConstraints();
		c.gridx = 2;
		c.gridy = 1;
		c.fill = GridBagConstraints.NONE;
		c.weightx = 0;
		
		JButton jbt2 = new JButton("Botón");
		jpn.add(jbt2, c);
		
		// Tercera fila
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 2;
		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = 3;
		c.weighty = 1;
		
		JPanel jpnBotton = new JPanel();
		jpnBotton.setBackground(Color.CYAN);
		jpn.add(jpnBotton, c);
		
		return jpn;
	}

}
