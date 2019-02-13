package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Lineas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton  btnCancelarLineas;
	private JButton  btnaceptarLineas;
	private JComboBox<Object> LineascB;
	private JLabel label;
	/**
	 * Create the panel.
	 */
	public Lineas() {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		
		 btnCancelarLineas = new JButton("Cancelar");
		btnCancelarLineas.setBounds(79, 404, 89, 23);
		add(btnCancelarLineas);
		
		LineascB = new JComboBox<Object>();
		LineascB.setBounds(150, 151, 195, 20);
		add(LineascB);
		
		 btnaceptarLineas = new JButton("Aceptar");
		btnaceptarLineas.setBounds(307, 403, 97, 25);
		add(btnaceptarLineas);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Lineas.class.getResource("/vista/fondo3.jpg")));
		label.setBounds(0, 0, 500, 500);
		add(label);
		

	}
	public JButton getBtnCancelarLineas() {
		return btnCancelarLineas;
	}
	public void setBtnCancelarLineas(JButton btnCancelarLineas) {
		this.btnCancelarLineas = btnCancelarLineas;
	}
	public JButton getBtnaceptarLineas() {
		return btnaceptarLineas;
	}
	public void setBtnaceptarLineas(JButton btnaceptarLineas) {
		this.btnaceptarLineas = btnaceptarLineas;
	}
	public JComboBox<Object> getLineascB() {
		return LineascB;
	}
	public void setLineascB(JComboBox<Object> lineascB) {
		LineascB = lineascB;
	}
}
