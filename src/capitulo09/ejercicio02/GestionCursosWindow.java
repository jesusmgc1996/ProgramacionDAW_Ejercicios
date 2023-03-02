package capitulo09.ejercicio02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import capitulo08.bloque02.Principal;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class GestionCursosWindow extends JFrame {

	private static Connection conn = null;
	private JPanel contentPane;
	private JTextField jtfId;
	private JTextField jtfDescription;
	private JLabel lblNewLabel_2;
	private JPanel panel;
	private JButton btnFirst;
	private JButton btnPrevious;
	private JButton btnNext;
	private JButton btnLast;
	private JButton btnSave;
	private JButton btnNew;
	private JButton btnDelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionCursosWindow frame = new GestionCursosWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GestionCursosWindow() {
		try {
			conn = ConnectionManager.getConnection();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
//		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0};
//		gbl_contentPane.columnWeights = new double[]{1.0, 1.0};
//		gbl_contentPane.columnWidths = new int[]{0};
//		gbl_contentPane.rowHeights = new int[]{0};
//		gbl_contentPane.columnWeights = new double[]{Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblNewLabel_2 = new JLabel("Gestión de cursos");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridwidth = 2;
		gbc_lblNewLabel_2.insets = new Insets(15, 15, 15, 15);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 0;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("ID:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		jtfId = new JTextField();
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.weightx = 1.0;
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 1;
		contentPane.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Descripción:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfDescription = new JTextField();
		GridBagConstraints gbc_jtfDescription = new GridBagConstraints();
		gbc_jtfDescription.weightx = 1.0;
		gbc_jtfDescription.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDescription.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDescription.gridx = 1;
		gbc_jtfDescription.gridy = 2;
		contentPane.add(jtfDescription, gbc_jtfDescription);
		jtfDescription.setColumns(10);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weighty = 1.0;
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 3;
		contentPane.add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from centroeducativo.curso order by id limit 1");
			if (rs.next()) {
				jtfId.setText(rs.getString(1));
				jtfId.setEnabled(false);
				jtfDescription.setText(rs.getString(2));
			}
			rs.close();
			st.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		btnFirst = new JButton("<<");
		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFirst();
			}
		});
		panel.add(btnFirst);
		
		btnPrevious = new JButton("<");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPrevious();
			}
		});
		panel.add(btnPrevious);
		
		btnNext = new JButton(">");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getNext();
			}
		});
		panel.add(btnNext);
		
		btnLast = new JButton(">>");
		btnLast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getLast();
			}
		});
		panel.add(btnLast);
		
		btnSave = new JButton("Guardar");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveRecord();
			}
		});
		panel.add(btnSave);
		
		btnNew = new JButton("Nuevo");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtfId.setText("0");
				jtfDescription.setText("");
			}
		});
		panel.add(btnNew);
		
		btnDelete = new JButton("Eliminar");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteRecord();
			}
		});
		panel.add(btnDelete);
	}
	
	/**
	 * Método para cargar el primer registro
	 */
	private void getFirst() {
		try {
			PreparedStatement ps = conn.prepareStatement("select * from centroeducativo.curso order by id limit 1");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				jtfId.setText(rs.getString(1));
				jtfDescription.setText(rs.getString(2));
			}
			rs.close();
			ps.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método para cargar el registro anterior
	 */
	private void getPrevious() {
		try {
			PreparedStatement ps = conn.prepareStatement("select * from centroeducativo.curso where id < "
					+ Integer.parseInt(jtfId.getText()) + " order by 1 desc limit 1");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				jtfId.setText(rs.getString(1));
				jtfDescription.setText(rs.getString(2));
			}
			rs.close();
			ps.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método para cargar el siguiente registro
	 */
	private void getNext() {
		try {
			PreparedStatement ps = conn.prepareStatement("select * from centroeducativo.curso where id > "
					+ Integer.parseInt(jtfId.getText()) + " order by 1 limit 1");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				jtfId.setText(rs.getString(1));
				jtfDescription.setText(rs.getString(2));
			}
			rs.close();
			ps.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método para cargar el último registro
	 */
	private void getLast() {
		try {
			PreparedStatement ps = conn.prepareStatement("select * from centroeducativo.curso order by id desc limit 1");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				jtfId.setText(rs.getString(1));
				jtfDescription.setText(rs.getString(2));
			}
			rs.close();
			ps.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método para guardar un registro
	 */
	private void saveRecord() {
		try {
			if (Integer.parseInt(jtfId.getText()) != 0) {
				PreparedStatement ps = conn.prepareStatement("update centroeducativo.curso set"
						+ " descripcion = ? where id = " + Integer.parseInt(jtfId.getText()));
				ps.setString(1, jtfDescription.getText());
				ps.executeUpdate();
				ps.close();
			}
			else {
				PreparedStatement ps = conn.prepareStatement("insert into centroeducativo.curso"
						+ " (id, descripcion) values (?, ?)");
				ps.setInt(1, getNextValid());
				ps.setString(2, jtfDescription.getText());
				ps.executeUpdate();
				ps.close();
				getLast();
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método para eliminar un registro
	 */
	private void deleteRecord() {
		try {
			if (JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro?") == JOptionPane.YES_OPTION) {
				PreparedStatement ps = conn.prepareStatement("delete from centroeducativo.curso where id = "
						+ Integer.parseInt(jtfId.getText()));
				ps.executeUpdate();
				ps.close();
				getPrevious();
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	/**
	 * Método para comprobar el siguiente registro válido
	 * @return
	 * @throws SQLException 
	 */
	public static int getNextValid() throws SQLException {
		PreparedStatement ps = conn.prepareStatement("select max(id) from centroeducativo.curso");
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			int id = rs.getInt(1) + 1;
			rs.close();
			ps.close();
			return id;
		}
		rs.close();
		ps.close();
		return 1;
	}
}
