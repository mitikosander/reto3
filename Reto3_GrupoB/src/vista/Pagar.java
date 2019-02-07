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
	public JTextField tFIntroducidoPagar;
	public JTextField tFAdevolverPagar;
	public JButton btn50Pagar, btn20Pagar, btn10Pagar, btn5Pagar, btn2Pagar,btn1Pagar, btn05Pagar,btn02Pagar,btn01Pagar,btn005Pagar,btn002Pagar, btn001Pagar, btnGuardar, btnCancelar,btnFinalizar;                                                      

	
	
	/**
	 * Create the panel.
	 */
	
	public Pagar() {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		
		JLabel lblIntroducido = new JLabel("Total:");
		lblIntroducido.setBounds(96, 138, 80, 14);
		add(lblIntroducido);
		
		tFIntroducidoPagar = new JTextField();
		tFIntroducidoPagar.setEditable(false);
		tFIntroducidoPagar.setBounds(186, 135, 86, 20);
		add(tFIntroducidoPagar);
		tFIntroducidoPagar.setColumns(10);
		
		JLabel lblADevolver = new JLabel("Vueltas:");
		lblADevolver.setBounds(77, 177, 99, 14);
		add(lblADevolver);
		
		tFAdevolverPagar = new JTextField();
		tFAdevolverPagar.setEditable(false);
		tFAdevolverPagar.setBounds(186, 174, 86, 20);
		add(tFAdevolverPagar);
		tFAdevolverPagar.setColumns(10);
		
		btn50Pagar = new JButton("50");
		btn50Pagar.setBounds(96, 255, 60, 23);
		add(btn50Pagar);
		
		
		 btn20Pagar = new JButton("20");
		btn20Pagar.setBounds(166, 255, 60, 23);
		add(btn20Pagar);
		
		 btn10Pagar = new JButton("10");
		btn10Pagar.setBounds(249, 255, 61, 23);
		add(btn10Pagar);
		
		 btn5Pagar = new JButton("5");
		btn5Pagar.setBounds(320, 255, 63, 23);
		add(btn5Pagar);
		
		 btn2Pagar = new JButton("2");
		btn2Pagar.setBounds(96, 291, 60, 23);
		add(btn2Pagar);
		
		 btn1Pagar = new JButton("1");
		btn1Pagar.setBounds(166, 291, 60, 23);
		add(btn1Pagar);
		
		 btn05Pagar = new JButton("0,5");
		btn05Pagar.setBounds(249, 291, 61, 23);
		add(btn05Pagar);
		
		 btn02Pagar = new JButton("0,2");
		btn02Pagar.setBounds(320, 291, 63, 23);
		add(btn02Pagar);
		
		 btn01Pagar = new JButton("0,1");
		btn01Pagar.setBounds(96, 327, 60, 23);
		add(btn01Pagar);
		
		 btn005Pagar = new JButton("0,05");
		btn005Pagar.setBounds(166, 327, 63, 23);
		add(btn005Pagar);
		
		 btn002Pagar = new JButton("0.02");
		btn002Pagar.setBounds(249, 327, 61, 23);
		add(btn002Pagar);
		
		 btn001Pagar = new JButton("0.01");
		btn001Pagar.setBounds(320, 324, 63, 23);
		add(btn001Pagar);
		
		 btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(10, 466, 89, 23);
		add(btnGuardar);
		
		 btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(221, 466, 89, 23);
		add(btnCancelar);
		
		 btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(401, 466, 89, 23);
		add(btnFinalizar);
		
	

	}
}
