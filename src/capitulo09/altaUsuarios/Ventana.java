package capitulo09.altaUsuarios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import capitulo09.altaUsuarios.controladores.ControladorAcuerdo;
import capitulo09.altaUsuarios.controladores.ControladorIdioma;
import capitulo09.altaUsuarios.controladores.ControladorPais;
import capitulo09.altaUsuarios.controladores.ControladorUsuario;
import capitulo09.altaUsuarios.modelos.Acuerdo;
import capitulo09.altaUsuarios.modelos.Idioma;
import capitulo09.altaUsuarios.modelos.Pais;
import capitulo09.altaUsuarios.modelos.Usuario;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.util.List;

import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField jtfEmail;
	private JLabel lblNewLabel_1;
	private JTextField jtfUsuario;
	private JLabel lblNewLabel_2;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_3;
	private JPasswordField passwordFieldRep;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JComboBox<Pais> jcbPais;
	private JComboBox<Idioma> jcbIdioma;
	private JCheckBox chk;
	private JButton btnGuardar;
	private JPanel panel;

	/**
	 * Carga la aplicación
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setTitle("Alta de usuario");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Crea el frame
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
//		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
//		gbl_contentPane.columnWeights = new double[]{0.0, 1.0};
//		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
//		gbl_contentPane.rowHeights = new int[]{0, 0};
//		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Email:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		jtfEmail = new JTextField();
		GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
		gbc_jtfEmail.weightx = 1.0;
		gbc_jtfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEmail.gridx = 1;
		gbc_jtfEmail.gridy = 0;
		contentPane.add(jtfEmail, gbc_jtfEmail);
		jtfEmail.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Usuario:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfUsuario = new JTextField();
		GridBagConstraints gbc_jtfUsuario = new GridBagConstraints();
		gbc_jtfUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_jtfUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfUsuario.gridx = 1;
		gbc_jtfUsuario.gridy = 1;
		contentPane.add(jtfUsuario, gbc_jtfUsuario);
		jtfUsuario.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Password:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 2;
		contentPane.add(passwordField, gbc_passwordField);
		
		lblNewLabel_3 = new JLabel("Repetición password:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		passwordFieldRep = new JPasswordField();
		GridBagConstraints gbc_passwordFieldRep = new GridBagConstraints();
		gbc_passwordFieldRep.insets = new Insets(0, 0, 5, 0);
		gbc_passwordFieldRep.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordFieldRep.gridx = 1;
		gbc_passwordFieldRep.gridy = 3;
		contentPane.add(passwordFieldRep, gbc_passwordFieldRep);
		
		lblNewLabel_4 = new JLabel("País:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jcbPais = new JComboBox<Pais>();
		jcbPais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jcbPais.getSelectedItem() != null) {
					getIdiomas();
				}
			}
		});
		GridBagConstraints gbc_jcbPais = new GridBagConstraints();
		gbc_jcbPais.insets = new Insets(0, 0, 5, 0);
		gbc_jcbPais.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbPais.gridx = 1;
		gbc_jcbPais.gridy = 4;
		contentPane.add(jcbPais, gbc_jcbPais);
		
		lblNewLabel_5 = new JLabel("Idioma:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jcbIdioma = new JComboBox<Idioma>();
		jcbIdioma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jcbIdioma.getSelectedItem() != null) {
					getAcuerdo();
				}
			}
		});
		GridBagConstraints gbc_jcbIdioma = new GridBagConstraints();
		gbc_jcbIdioma.insets = new Insets(0, 0, 5, 0);
		gbc_jcbIdioma.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbIdioma.gridx = 1;
		gbc_jcbIdioma.gridy = 5;
		contentPane.add(jcbIdioma, gbc_jcbIdioma);
		
		chk = new JCheckBox("Este texto va a cambiar");
		chk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGuardar.setEnabled(chk.isSelected());
			}
		});
		GridBagConstraints gbc_chk = new GridBagConstraints();
		gbc_chk.insets = new Insets(0, 0, 5, 0);
		gbc_chk.anchor = GridBagConstraints.WEST;
		gbc_chk.gridwidth = 2;
		gbc_chk.gridx = 0;
		gbc_chk.gridy = 6;
		contentPane.add(chk, gbc_chk);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 0);
		gbc_btnGuardar.anchor = GridBagConstraints.EAST;
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 7;
		contentPane.add(btnGuardar, gbc_btnGuardar);
		btnGuardar.setEnabled(false);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weighty = 1.0;
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 8;
		contentPane.add(panel, gbc_panel);
		
		getPaises();
	}
	
	/**
	 * Método para guardar un registro
	 */
	private void guardar() {
		if (jtfEmail.getText().lastIndexOf('.') < jtfEmail.getText().lastIndexOf('@')) {
			JOptionPane.showMessageDialog(null, "El email no es válido");
			return;
		}
		if (jtfUsuario.getText().length() < 8) {
			JOptionPane.showMessageDialog(null, "El nombre de usuario debe tener al menos 8 caracteres");
			return;
		}
		char password[] = passwordField.getText().toCharArray();
		boolean mayus = false, minus = false, digito = false;
		for (int i = 0; i < password.length; i++) {
			if (Character.isUpperCase(password[i])) mayus = true;
			if (Character.isLowerCase(password[i])) minus = true;
			if (Character.isDigit(password[i])) digito = true;
		}
		if (!mayus || !minus || !digito) {
			JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una mayúscula, una minúscula y un dígito");
			return;
		}
		if (!passwordField.getText().equals(passwordFieldRep.getText())) {
			JOptionPane.showMessageDialog(null, "La contraseña y su repetición no coinciden");
			return;
		}
		if (ControladorUsuario.getUsuario(jtfUsuario.getText()) != null) {
			JOptionPane.showMessageDialog(null, "El nombre de usuario está siendo utilizado, elija otro");
		}
		Usuario u = new Usuario();
		u.setEmail(jtfEmail.getText());
		u.setUsuario(jtfUsuario.getText());
		u.setPassword(passwordField.getText());
		u.setIdIdioma(((Idioma) jcbIdioma.getSelectedItem()).getId());
		if (ControladorUsuario.insertar(u) > 0) {
			JOptionPane.showMessageDialog(null, "Se ha guardado correctamente");
		}
		else {
			JOptionPane.showMessageDialog(null, "No se ha podido guardar");
		}
	}
	
	/**
	 * Método para obtener los países
	 */
	private void getPaises() {
		jcbPais.removeAllItems();
		List<Pais> paises = ControladorPais.getAll();
		for (Pais p : paises) {
			jcbPais.addItem(p);
		}
	}
	
	/**
	 * Método para obtener los idiomas
	 */
	private void getIdiomas() {
		jcbIdioma.removeAllItems();
		List<Idioma> idiomas = ControladorIdioma.getAll(((Pais) jcbPais.getSelectedItem()).getId());
		for (Idioma i : idiomas) {
			jcbIdioma.addItem(i);
		}
	}
	
	/**
	 * Método para obtener un acuerdo
	 */
	private void getAcuerdo() {
		Acuerdo a = ControladorAcuerdo.getAcuerdo(((Idioma) jcbIdioma.getSelectedItem()).getId());
		if (a != null) {
			chk.setText(a.getDescripcion());
		}
	}
	
}
