package Examenes.examen23032023.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Examenes.examen23032023.controlador.ControladorInquilino;
import Examenes.examen23032023.controlador.ControladorLocalidad;
import Examenes.examen23032023.controlador.ControladorVivienda;
import Examenes.examen23032023.modelo.Inquilino;
import Examenes.examen23032023.modelo.Localidad;
import Examenes.examen23032023.modelo.Vivienda;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField jtfId;
	private JTextField jtfDni;
	private JTextField jtfNombre;
	private JTextField jtfFechaInicio;
	private JTextField jtfFechaFin;
	private JTextField jtfCuota;
	private JLabel lblTotal;
	private JComboBox<Localidad> jcbLocalidad;
	private JComboBox<Vivienda> jcbVivienda;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	/**
	 * Carga la aplicación
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
//		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
//		gbl_contentPane.columnWeights = new double[]{1.0, 1.0};
//		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
//		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
//		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Modificación de alquileres");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Localidad:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jcbLocalidad = new JComboBox<Localidad>();
		jcbLocalidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jcbLocalidad.getSelectedItem() != null) {
					getViviendas();
				}
			}
		});
		GridBagConstraints gbc_jcbLocalidad = new GridBagConstraints();
		gbc_jcbLocalidad.weightx = 1.0;
		gbc_jcbLocalidad.insets = new Insets(0, 0, 5, 0);
		gbc_jcbLocalidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbLocalidad.gridx = 1;
		gbc_jcbLocalidad.gridy = 1;
		contentPane.add(jcbLocalidad, gbc_jcbLocalidad);
		
		JLabel lblNewLabel_2 = new JLabel("Vivienda:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jcbVivienda = new JComboBox<Vivienda>();
		jcbVivienda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jcbVivienda.getSelectedItem() != null) {
					getInquilino();
				}
			}
		});
		GridBagConstraints gbc_jcbVivienda = new GridBagConstraints();
		gbc_jcbVivienda.insets = new Insets(0, 0, 5, 0);
		gbc_jcbVivienda.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbVivienda.gridx = 1;
		gbc_jcbVivienda.gridy = 2;
		contentPane.add(jcbVivienda, gbc_jcbVivienda);
		
		JLabel lblNewLabel_3 = new JLabel("Datos del inquilino");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridwidth = 2;
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Id:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 4;
		contentPane.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("DNI:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtfDni = new JTextField();
		GridBagConstraints gbc_jtfDni = new GridBagConstraints();
		gbc_jtfDni.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDni.gridx = 1;
		gbc_jtfDni.gridy = 5;
		contentPane.add(jtfDni, gbc_jtfDni);
		jtfDni.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Nombre completo:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		contentPane.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 6;
		contentPane.add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Fecha inicio:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 7;
		contentPane.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		jtfFechaInicio = new JTextField();
		GridBagConstraints gbc_jtfFechaInicio = new GridBagConstraints();
		gbc_jtfFechaInicio.insets = new Insets(0, 0, 5, 0);
		gbc_jtfFechaInicio.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFechaInicio.gridx = 1;
		gbc_jtfFechaInicio.gridy = 7;
		contentPane.add(jtfFechaInicio, gbc_jtfFechaInicio);
		jtfFechaInicio.setColumns(10);
		
		JCheckBox chk = new JCheckBox("Alquiler en activo");
		chk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chk.isSelected()) {
					jtfFechaFin.setEnabled(false);
					jtfFechaFin.setText("");
				}
				else {
					jtfFechaFin.setEnabled(true);
				}
			}
		});
		chk.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_chk = new GridBagConstraints();
		gbc_chk.insets = new Insets(0, 0, 5, 0);
		gbc_chk.gridwidth = 2;
		gbc_chk.gridx = 0;
		gbc_chk.gridy = 8;
		contentPane.add(chk, gbc_chk);
		
		JLabel lblNewLabel_8 = new JLabel("Fecha de fin:");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 9;
		contentPane.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		jtfFechaFin = new JTextField();
		GridBagConstraints gbc_jtfFechaFin = new GridBagConstraints();
		gbc_jtfFechaFin.insets = new Insets(0, 0, 5, 0);
		gbc_jtfFechaFin.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFechaFin.gridx = 1;
		gbc_jtfFechaFin.gridy = 9;
		contentPane.add(jtfFechaFin, gbc_jtfFechaFin);
		jtfFechaFin.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Cuota mensual (€):");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 10;
		contentPane.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		jtfCuota = new JTextField();
		jtfCuota.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				lblTotal.setText("" + Float.parseFloat(jtfCuota.getText()) * 1.21 + " €");
			}
		});
		GridBagConstraints gbc_jtfCuota = new GridBagConstraints();
		gbc_jtfCuota.insets = new Insets(0, 0, 5, 0);
		gbc_jtfCuota.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfCuota.gridx = 1;
		gbc_jtfCuota.gridy = 10;
		contentPane.add(jtfCuota, gbc_jtfCuota);
		jtfCuota.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Total mensual (IVA incluido) (€):");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 0;
		gbc_lblNewLabel_10.gridy = 11;
		contentPane.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		lblTotal = new JLabel();
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.insets = new Insets(0, 0, 5, 0);
		gbc_lblTotal.gridx = 1;
		gbc_lblTotal.gridy = 11;
		contentPane.add(lblTotal, gbc_lblTotal);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weighty = 1.0;
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 12;
		contentPane.add(panel, gbc_panel);
		
		JButton btnNewButton = new JButton("Modificar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificar();
			}
		});
		panel.add(btnNewButton);
		
		getLocalidades();
	}
	
	/**
	 * Método para modificar un inquilino
	 */
	private void modificar() {
		if (!jtfDni.getText().matches("\\d{8}+[A-z]")) {
			JOptionPane.showMessageDialog(null, "El DNI no es válido");
			return;
		}
		if (jtfNombre.getText().isBlank()) {
			JOptionPane.showMessageDialog(null, "El campo 'Nombre completo' no puede estar vacío");
			return;
		}
		if (!jtfFechaInicio.getText().isBlank()) {
			try {
				sdf.parse(jtfFechaInicio.getText());
			} catch (ParseException e) {
				JOptionPane.showMessageDialog(null, "La fecha de inicio no tiene el formato correcto (dd/MM/yyyy)");
				return;
			}
		}
		if (!jtfFechaFin.getText().isBlank()) {
			try {
				sdf.parse(jtfFechaFin.getText());
			} catch (ParseException e) {
				JOptionPane.showMessageDialog(null, "La fecha de fin no tiene el formato correcto (dd/MM/yyyy)");
				return;
			}
		}
		Inquilino i = new Inquilino();
		i.setId(Integer.parseInt(jtfId.getText()));
		i.setDni(jtfDni.getText());
		i.setNombreCompleto(jtfNombre.getText());
		if (jtfFechaInicio.getText().isBlank()) {
			i.setFechaInicioAlquiler(null);
		}
		else {
			try {
				i.setFechaInicioAlquiler(sdf.parse(jtfFechaInicio.getText()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		if (jtfFechaFin.getText().isBlank()) {
			i.setFechaFinAlquiler(null);
		}
		else {
			try {
				i.setFechaFinAlquiler(sdf.parse(jtfFechaFin.getText()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		i.setCuotaMensual(Float.parseFloat(jtfCuota.getText()));
		if (ControladorInquilino.modificar(i) != 1) {
			JOptionPane.showMessageDialog(null, "No se ha podido guardar");
		}
		else {
			JOptionPane.showMessageDialog(null, "Se ha guardado correctamente");
		}
	}
	
	/**
	 * Método para obtener las localidades
	 */
	private void getLocalidades() {
		jcbLocalidad.removeAllItems();
		List<Localidad> localidades = ControladorLocalidad.getAll();
		for (Localidad l : localidades) {
			jcbLocalidad.addItem(l);
		}
	}
	
	/**
	 * Método para obtener las viviendas
	 */
	private void getViviendas() {
		jcbVivienda.removeAllItems();
		List<Vivienda> viviendas = ControladorVivienda.getAll(((Localidad) jcbLocalidad.getSelectedItem()).getId());
		for (Vivienda v : viviendas) {
			jcbVivienda.addItem(v);
		}
	}
	
	/**
	 * Método para obtener un inquilino
	 */
	private void getInquilino() {
		Inquilino i = ControladorInquilino.getInquilino(((Vivienda) jcbVivienda.getSelectedItem()).getId());
		if (i != null) {
			jtfId.setText("" + i.getId());
			jtfDni.setText(i.getDni());
			jtfNombre.setText(i.getNombreCompleto());
			if (i.getFechaInicioAlquiler() != null) {
				jtfFechaInicio.setText(sdf.format(i.getFechaInicioAlquiler()));
			}
			else {
				jtfFechaInicio.setText("");
			}
			if (i.getFechaFinAlquiler() != null) {
				jtfFechaFin.setText(sdf.format(i.getFechaFinAlquiler()));
			}
			else {
				jtfFechaFin.setText("");
			}
			jtfCuota.setText("" + i.getCuotaMensual());
			lblTotal.setText("" + Float.parseFloat(jtfCuota.getText()) * 1.21 + " €");
		}
	}

}
