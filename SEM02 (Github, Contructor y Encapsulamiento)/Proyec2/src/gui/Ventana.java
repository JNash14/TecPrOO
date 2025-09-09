package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import caso1.Triangulo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JButton btnCalcular;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("BASE: ");
		lblNewLabel.setBounds(23, 22, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("ALTURA: ");
		lblNewLabel_1.setBounds(23, 47, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtBase = new JTextField();
		txtBase.setBounds(79, 19, 86, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(79, 44, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(this);
		btnCalcular.setBounds(244, 18, 89, 23);
		contentPane.add(btnCalcular);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 98, 304, 101);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCalcular) {
			do_btnCalcular_actionPerformed(e);
		}
	}
	protected void do_btnCalcular_actionPerformed(ActionEvent e) {
		double base = Double.parseDouble(txtBase.getText());
		double altura = Double.parseDouble(txtAltura.getText());
		Triangulo t = new Triangulo(base, altura);
		listado(t);
	}
	
	void imprimir(String s)
	{
		txtS.append(s+"\n");
	}
	void listado(Triangulo t)
	{
		imprimir("La base es: "+t.getBase());
		imprimir("La altura es: "+t.getAltura());
		imprimir("El área es: "+t.Area());
	}
}
