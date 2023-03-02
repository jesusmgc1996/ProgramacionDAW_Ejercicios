package capitulo09.ejercicio01;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Estudiante extends JFrame {
	
	public Estudiante() {
		super("Formulario");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setContentPane(getMainPanel());
	}
	
	/**
	 * @return
	 */
	private JPanel getMainPanel() {
		JPanel jpn = new JPanel();
		jpn.setLayout(new GridBagLayout());
		
		// Primera fila
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		c.weighty = 1;
		
		JLabel jlbTitle = new JLabel("Gestión de los estudiantes");
		jlbTitle.setFont(new Font("Tahoma", Font.BOLD, 50));
		jpn.add(jlbTitle, c);
		
		// Primer elemento en la segunda fila
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 1;
		c.anchor = GridBagConstraints.EAST;
		c.insets = new Insets(10, 10, 10, 10);
		
		JLabel jlbName = new JLabel("Nombre:");
		jpn.add(jlbName, c);
		
		// Segundo elemento, a la derecha en la segunda fila
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1;
		c.insets = new Insets(10, 10, 10, 10);
		
		JTextField jtfName = new JTextField();
		jpn.add(jtfName, c);
		
		// Primer elemento en la tercera fila
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 2;
		c.anchor = GridBagConstraints.EAST;
		c.insets = new Insets(10, 10, 10, 10);
		
		JLabel jlbFirstSurname = new JLabel("Primer apellido:");
		jpn.add(jlbFirstSurname, c);
		
		// Segundo elemento, a la derecha en la tercera fila
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 2;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1;
		c.insets = new Insets(10, 10, 10, 10);
		
		JTextField jtfFirstSurname = new JTextField();
		jpn.add(jtfFirstSurname, c);
		
		// Primer elemento en la cuarta fila
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 3;
		c.anchor = GridBagConstraints.EAST;
		c.insets = new Insets(10, 10, 10, 10);
		
		JLabel jlbSecondSurname = new JLabel("Segundo apellido:");
		jpn.add(jlbSecondSurname, c);
		
		// Segundo elemento, a la derecha en la cuarta fila
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 3;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1;
		c.insets = new Insets(10, 10, 10, 10);
		
		JTextField jtfSecondSurname = new JTextField();
		jpn.add(jtfSecondSurname, c);
		
		// Primer elemento en la quinta fila
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 4;
		c.anchor = GridBagConstraints.EAST;
		c.insets = new Insets(10, 10, 10, 10);
		
		JLabel jlbDni = new JLabel("DNI:");
		jpn.add(jlbDni, c);
		
		// Segundo elemento, a la derecha en la quinta fila
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 4;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1;
		c.insets = new Insets(10, 10, 10, 10);
		
		JTextField jtfDni = new JTextField();
		jpn.add(jtfDni, c);
		
		// Primer elemento en la sexta fila
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 5;
		c.anchor = GridBagConstraints.EAST;
		c.insets = new Insets(10, 10, 10, 10);
		
		JLabel jlbAddress = new JLabel("Dirección:");
		jpn.add(jlbAddress, c);
		
		// Segundo elemento, a la derecha en la sexta fila
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 5;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1;
		c.insets = new Insets(10, 10, 10, 10);
		
		JTextField jtfAddress = new JTextField();
		jpn.add(jtfAddress, c);
		
		// Primer elemento en la séptima fila
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 6;
		c.anchor = GridBagConstraints.EAST;
		c.insets = new Insets(10, 10, 10, 10);
		
		JLabel jlbEmail = new JLabel("E-mail:");
		jpn.add(jlbEmail, c);
		
		// Segundo elemento, a la derecha en la séptima fila
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 6;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1;
		c.insets = new Insets(10, 10, 10, 10);
		
		JTextField jtfEmail = new JTextField();
		jpn.add(jtfEmail, c);
		
		// Primer elemento en la octava fila
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 7;
		c.anchor = GridBagConstraints.EAST;
		c.insets = new Insets(10, 10, 10, 10);
		
		JLabel jlbPhone = new JLabel("Teléfono:");
		jpn.add(jlbPhone, c);
		
		// Segundo elemento, a la derecha en la octava fila
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 7;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1;
		c.insets = new Insets(10, 10, 10, 10);
		
		JTextField jtfPhone = new JTextField();
		jpn.add(jtfPhone, c);
		
		// Novena fila
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 8;
		c.gridwidth = 2;
		c.weighty = 4;
		c.insets = new Insets(10, 10, 10, 10);
		
		JPanel jpnBottom = new JPanel();
		jpn.add(jpnBottom, c);
		
		return jpn;
	}

}
