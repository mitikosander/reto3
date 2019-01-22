package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Pagar extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tfPagarPagar;
	private JTextField tFIntroducidoPagar;
	private JTextField tFAdevolverPagar;

	/**
	 * Create the panel.
	 */
	public Pagar() {
		setLayout(null);
	   
		
		JLabel lblAPagar = new JLabel("A pagar : ");
		lblAPagar.setBounds(125, 49, 63, 14);
		add(lblAPagar);
		
		tfPagarPagar = new JTextField();
		tfPagarPagar.setBounds(186, 46, 86, 20);
		add(tfPagarPagar);
		tfPagarPagar.setColumns(10);
		
		JLabel lblIntroducido = new JLabel("Introducido: ");
		lblIntroducido.setBounds(125, 77, 63, 14);
		add(lblIntroducido);
		
		tFIntroducidoPagar = new JTextField();
		tFIntroducidoPagar.setBounds(186, 74, 86, 20);
		add(tFIntroducidoPagar);
		tFIntroducidoPagar.setColumns(10);
		
		JLabel lblADevolver = new JLabel("A devolver : ");
		lblADevolver.setBounds(125, 105, 63, 14);
		add(lblADevolver);
		
		tFAdevolverPagar = new JTextField();
		tFAdevolverPagar.setBounds(186, 102, 86, 20);
		add(tFAdevolverPagar);
		tFAdevolverPagar.setColumns(10);
		
		JButton btn50Pagar = new JButton("50");
		btn50Pagar.setBounds(71, 164, 60, 23);
		add(btn50Pagar);
		
		JButton btn20Pagar = new JButton("20");
		btn20Pagar.setBounds(141, 164, 60, 23);
		
		add(btn20Pagar);
		
		JButton btn10Pagar = new JButton("10");
		btn10Pagar.setBounds(211, 164, 61, 23);
		add(btn10Pagar);
		
		JButton btn5Pagar = new JButton("5");
		btn5Pagar.setBounds(287, 164, 63, 23);
		add(btn5Pagar);
		
		JButton btn2Pagar = new JButton("2");
		btn2Pagar.setBounds(71, 198, 60, 23);
		add(btn2Pagar);
		
		JButton btn1Pagar = new JButton("1");
		btn1Pagar.setBounds(141, 198, 60, 23);
		add(btn1Pagar);
		
		JButton btn05Pagar = new JButton("0,5");
		btn05Pagar.setBounds(211, 198, 61, 23);
		add(btn05Pagar);
		
		JButton btn02Pagar = new JButton("0,2");
		btn02Pagar.setBounds(287, 198, 63, 23);
		add(btn02Pagar);
		
		JButton btn01Pagar = new JButton("0,1");
		btn01Pagar.setBounds(71, 232, 60, 23);
		add(btn01Pagar);
		
		JButton btn005Pagar = new JButton("0,05");
		btn005Pagar.setBounds(138, 232, 63, 23);
		add(btn005Pagar);
		
		JButton btn002Pagar = new JButton("0.02");
		btn002Pagar.setBounds(211, 232, 61, 23);
		add(btn002Pagar);
		
		JButton btn001Pagar = new JButton("0.01");
		btn001Pagar.setBounds(287, 232, 63, 23);
		add(btn001Pagar);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setBounds(0, 277, 89, 23);
		add(btnNewButton_1);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(183, 277, 89, 23);
		add(btnCancelar);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(361, 277, 89, 23);
		add(btnFinalizar);

	}
}
