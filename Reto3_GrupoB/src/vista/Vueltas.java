package vista;

import java.awt.BorderLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;

public class Vueltas extends JDialog {

	/**
	 * @author Alexander, Koldo, Eduardo, Jonathan
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton cancelButton;
	private final JLabel lblVueltas = new JLabel("Vueltas");
	private static JTextArea txtDevolver;
	private static double[] devolver = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };


	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public Vueltas() {
		setBounds(100, 100, 450, 300);
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblVueltas.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblVueltas.setBounds(163, 10, 54, 23);
			contentPanel.add(lblVueltas);
		}

		txtDevolver = new JTextArea();
		txtDevolver.setBackground(UIManager.getColor("Button.background"));
		txtDevolver.setEditable(false);
		
		txtDevolver.setBounds(10, 44, 414, 250);
		contentPanel.add(txtDevolver);

		

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				cancelButton = new JButton("Salir");

				buttonPane.add(cancelButton);
			}
		}
		
		Controlador.devolver(txtDevolver,devolver);

	}


	public JButton getCancelButton() {
		return cancelButton;
	}


	public void setCancelButton(JButton cancelButton) {
		this.cancelButton = cancelButton;
	}


	public static JTextArea getTxtDevolver() {
		return txtDevolver;
	}


	public static void setTxtDevolver(JTextArea txtDevolver) {
		Vueltas.txtDevolver = txtDevolver;
	}


	public static double[] getDevolver() {
		return devolver;
	}


	public static void setDevolver(double[] devolver) {
		Vueltas.devolver = devolver;
	}


	public JPanel getContentPanel() {
		return contentPanel;
	}


	public JLabel getLblVueltas() {
		return lblVueltas;
	}


}
