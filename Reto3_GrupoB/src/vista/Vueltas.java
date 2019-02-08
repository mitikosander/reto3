package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;

public class Vueltas extends JDialog {

	/**
	 * @author Alexander, Koldo, Eduardo, Jonathan
	 */
	public static final long serialVersionUID = 1L;
	public final JPanel contentPanel = new JPanel();
	public static JButton cancelButton;
	public final JLabel lblVueltas = new JLabel("Vueltas");
	public static JTextArea txtDevolver;
	public static double[] devolver = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };


	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public Vueltas() {
		setBounds(100, 100, 450, 300);
		contentPanel.setBackground(Color.orange);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblVueltas.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblVueltas.setBounds(163, 10, 98, 23);
			contentPanel.add(lblVueltas);
		}

		txtDevolver = new JTextArea();
		txtDevolver.setEditable(false);
		txtDevolver.setBackground(Color.orange);
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


}
