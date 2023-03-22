package Examenes.examen14032023.vista;

import javax.swing.JPanel;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;

import Examenes.examen14032023.controlador.ControladorCentroEducativo;
import Examenes.examen14032023.controlador.ControladorMateria;
import Examenes.examen14032023.controlador.ControladorNivel;
import Examenes.examen14032023.modelo.CentroEducativo;
import Examenes.examen14032023.modelo.Materia;
import Examenes.examen14032023.modelo.Nivel;

import java.awt.Insets;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class PanelMateria extends JPanel {

	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JPanel panel;
	private JButton btnSave;
	private JComboBox<CentroEducativo> jcbCentro;
	private JComboBox<Nivel> jcbNivel;
	private JComboBox<Materia> jcbMateria;
	private JCheckBox ckbMatricula;
	private JTextField jtfId;
	private JTextField jtfNombre;
	private JTextField jtfCodigo;
	private JTextField jtfUrl;
	private JTextField jtfFecha;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	/**
	 * Crea el panel
	 */
	public PanelMateria() {

		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0};
//		gbl_contentPane.columnWeights = new double[]{0.0, 1.0};
//		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0};
//		gbl_contentPane.columnWeights = new double[]{1.0, 1.0};
//		gbl_contentPane.columnWidths = new int[]{0};
//		gbl_contentPane.rowHeights = new int[]{0};
//		gbl_contentPane.columnWeights = new double[]{Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{Double.MIN_VALUE};
		setLayout(gbl_contentPane);
		
		lblNewLabel_2 = new JLabel("Gestión de Materias");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridwidth = 3;
		gbc_lblNewLabel_2.insets = new Insets(15, 15, 15, 15);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 0;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		lblNewLabel = new JLabel("Centro:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		jcbCentro = new JComboBox<CentroEducativo>();
		jcbCentro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jcbCentro.getSelectedItem() != null) {
					getNiveles();
				}
			}
		});
		GridBagConstraints gbc_jcbCentro = new GridBagConstraints();
		gbc_jcbCentro.gridwidth = 2;
		gbc_jcbCentro.insets = new Insets(0, 0, 5, 5);
		gbc_jcbCentro.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbCentro.gridx = 1;
		gbc_jcbCentro.gridy = 1;
		add(jcbCentro, gbc_jcbCentro);
		
		lblNewLabel_1 = new JLabel("Nivel:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jcbNivel = new JComboBox<Nivel>();
		jcbNivel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jcbNivel.getSelectedItem() != null) {
					getMaterias();
				}
			}
		});
		GridBagConstraints gbc_jcbNivel = new GridBagConstraints();
		gbc_jcbNivel.gridwidth = 2;
		gbc_jcbNivel.insets = new Insets(0, 0, 5, 5);
		gbc_jcbNivel.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbNivel.gridx = 1;
		gbc_jcbNivel.gridy = 2;
		add(jcbNivel, gbc_jcbNivel);
		
		lblNewLabel_3 = new JLabel("Materia:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jcbMateria = new JComboBox<Materia>();
		jcbMateria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jcbMateria.getSelectedItem() != null) {
					cargar(ControladorMateria.getMateria(((Materia) jcbMateria.getSelectedItem()).getId()));
				}
				else {
					limpiar();
				}
			}
		});
		GridBagConstraints gbc_jcbMateria = new GridBagConstraints();
		gbc_jcbMateria.gridwidth = 2;
		gbc_jcbMateria.insets = new Insets(0, 0, 5, 5);
		gbc_jcbMateria.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbMateria.gridx = 1;
		gbc_jcbMateria.gridy = 3;
		add(jcbMateria, gbc_jcbMateria);
		
		lblNewLabel_4 = new JLabel("Datos de la materia");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.gridwidth = 3;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("id:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtfId = new JTextField();
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.gridwidth = 2;
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 5;
		add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		jtfId.setEnabled(false);
		
		lblNewLabel_6 = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		jtfNombre = new JTextField();
		jtfNombre.setColumns(10);
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.gridwidth = 2;
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 6;
		add(jtfNombre, gbc_jtfNombre);
		
		lblNewLabel_7 = new JLabel("Código:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 7;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		jtfCodigo = new JTextField();
		jtfCodigo.setColumns(10);
		GridBagConstraints gbc_jtfCodigo = new GridBagConstraints();
		gbc_jtfCodigo.gridwidth = 2;
		gbc_jtfCodigo.insets = new Insets(0, 0, 5, 0);
		gbc_jtfCodigo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfCodigo.gridx = 1;
		gbc_jtfCodigo.gridy = 7;
		add(jtfCodigo, gbc_jtfCodigo);
		
		lblNewLabel_8 = new JLabel("URL Classroom:");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 8;
		add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		jtfUrl = new JTextField();
		jtfUrl.setColumns(10);
		GridBagConstraints gbc_jtfUrl = new GridBagConstraints();
		gbc_jtfUrl.gridwidth = 2;
		gbc_jtfUrl.insets = new Insets(0, 0, 5, 0);
		gbc_jtfUrl.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfUrl.gridx = 1;
		gbc_jtfUrl.gridy = 8;
		add(jtfUrl, gbc_jtfUrl);
		
		lblNewLabel_9 = new JLabel("Fecha inicio:");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 9;
		add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		jtfFecha = new JTextField();
		jtfFecha.setColumns(10);
		GridBagConstraints gbc_jtfFecha = new GridBagConstraints();
		gbc_jtfFecha.gridwidth = 2;
		gbc_jtfFecha.insets = new Insets(0, 0, 5, 0);
		gbc_jtfFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFecha.gridx = 1;
		gbc_jtfFecha.gridy = 9;
		add(jtfFecha, gbc_jtfFecha);
		
		ckbMatricula = new JCheckBox("");
		ckbMatricula.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_ckbMatricula = new GridBagConstraints();
		gbc_ckbMatricula.anchor = GridBagConstraints.EAST;
		gbc_ckbMatricula.insets = new Insets(0, 0, 5, 5);
		gbc_ckbMatricula.gridx = 0;
		gbc_ckbMatricula.gridy = 10;
		add(ckbMatricula, gbc_ckbMatricula);
		
		lblNewLabel_10 = new JLabel("Admite matrícula");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 1;
		gbc_lblNewLabel_10.gridy = 10;
		add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weighty = 1.0;
		gbc_panel.gridwidth = 3;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 11;
		add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnSave = new JButton("Guardar");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		panel.add(btnSave);
		
		getCentros();
	}
	
	/**
	 * Método para cargar un registro
	 * @param m
	 */
	private void cargar(Materia m) {
		if (m != null) {
			jtfId.setText("" + m.getId());
			jtfNombre.setText(m.getNombre());
			jtfCodigo.setText(m.getCodigo());
			jtfUrl.setText(m.getUrl());
			jtfFecha.setText(sdf.format(m.getFechaInicio()));
			ckbMatricula.setSelected(m.getMatricula());
		}
	}
	
	/**
	 * Método para limpiar los datos
	 */
	private void limpiar() {
		jtfId.setText("");
		jtfNombre.setText("");
		jtfCodigo.setText("");
		jtfUrl.setText("");
		jtfFecha.setText("");
		ckbMatricula.setSelected(false);
	}
	
	/**
	 * Método para guardar un registro
	 */
	private void guardar() {
		Materia m = new Materia();
		int mayus = 0, minus = 0;
		m.setId(Integer.parseInt(jtfId.getText()));
		m.setNombre(jtfNombre.getText());
		char codigo[] = jtfCodigo.getText().toCharArray();
		for (int i = 0; i < codigo.length; i++) {
			if (Character.isUpperCase(codigo[i])) mayus++;
			if (Character.isLowerCase(codigo[i])) minus++;
		}
		if (mayus > 2 || minus > 2) {
			m.setCodigo(jtfCodigo.getText());
		}
		else {
			JOptionPane.showMessageDialog(null, "El código no es correcto");
			return;
		}
		if (jtfUrl.getText().startsWith("http://") || jtfUrl.getText().startsWith("https://")) {
			m.setUrl(jtfUrl.getText());
		}
		else {
			JOptionPane.showMessageDialog(null, "La URL no es correcta");
			return;
		}
		try {
			m.setFechaInicio(sdf.parse(jtfFecha.getText()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		m.setMatricula(ckbMatricula.isSelected());
		if (ControladorMateria.modificar(m) != 1) {
			JOptionPane.showMessageDialog(null, "No se ha podido guardar");
		}
		else {
			JOptionPane.showMessageDialog(null, "Se ha guardado correctamente");
		}
	}
	
	/**
	 * Método para obtener los centros
	 */
	private void getCentros() {
		jcbCentro.removeAllItems();
		List<CentroEducativo> centros = ControladorCentroEducativo.getAll();
		for (CentroEducativo c : centros) {
			jcbCentro.addItem(c);
		}
	}
	
	/**
	 * Método para obtener los niveles
	 */
	private void getNiveles() {
		jcbNivel.removeAllItems();
		List<Nivel> niveles = ControladorNivel.getAll(((CentroEducativo) jcbCentro.getSelectedItem()).getId());
		for (Nivel n : niveles) {
			jcbNivel.addItem(n);
		}
	}
	
	/**
	 * Método para obtener los centros
	 */
	private void getMaterias() {
		jcbMateria.removeAllItems();
		List<Materia> materias = ControladorMateria.getAll(((Nivel) jcbNivel.getSelectedItem()).getId());
		for (Materia m : materias) {
			jcbMateria.addItem(m);
		}
	}
	
}
