package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clase.Estudiante;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Vent1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JLabel lblNewLabel;
	private JTextField txtCod;
	private JLabel lblNewLabel_1;
	private JTextField txtNom;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vent1 frame = new Vent1();
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
	public Vent1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(296, 49, 89, 29);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 217, 354, 107);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		lblNewLabel = new JLabel("Codigo: ");
		lblNewLabel.setBounds(43, 31, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtCod = new JTextField();
		txtCod.setBounds(85, 28, 86, 20);
		contentPane.add(txtCod);
		txtCod.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(42, 56, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNom = new JTextField();
		txtNom.setBounds(85, 53, 140, 20);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Nota 1:");
		lblNewLabel_2.setBounds(42, 81, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Nota 2:");
		lblNewLabel_3.setBounds(43, 111, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtN1 = new JTextField();
		txtN1.setBounds(95, 78, 86, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(99, 108, 86, 20);
		contentPane.add(txtN2);
		txtN2.setColumns(10);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			do_btnProcesar_actionPerformed(e);
		}
	}
	
	protected void do_btnProcesar_actionPerformed(ActionEvent e) {
		
		int cod = Integer.parseInt(txtCod.getText());
		String nom = txtNom.getText();
		double n1 = Double.parseDouble(txtN1.getText());
		double n2 = Double.parseDouble(txtN2.getText());
		Estudiante e1 = new Estudiante(cod, nom, n1, n2);
		
		e1.setCod(cod);
		e1.setNom(nom);
		e1.setN1(n1);
		e1.setN2(n2);
		
		listado(e1);
		
	}
	
	void imprimir(String s)
	{
		txtS.append(s+"\n");
	}
	void listado (Estudiante e)
	{
		imprimir("El código es: "+e.getCod());
		imprimir("\nEl nombre es: "+e.getNom());
		imprimir("\nLa nota 1 es: "+e.getN1());
		imprimir("\nLa nota 2 es: "+e.getN2());
	}
}
