import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Fibonacci extends JFrame {

	private JPanel contentPane;
	private JTextField txtV1;
	private JTextField txtV2;
	private JTextField txtV3;
	/**
	 * 
	 */


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fibonacci frame = new Fibonacci();
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
	public Fibonacci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 193);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtV1.setText(null);
                txtV2.setText(null);
                txtV3.setText(null);
                JOptionPane.showMessageDialog(null, "Textos borrados");
			}
		});
		btnNewButton.setBounds(109, 116, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 int X, Y, Iteraciones, Ciclo=1, Resultado = 0;
	                String Cadena = " ";
	                X = Integer.parseInt(txtV1.getText());
	                Y = Integer.parseInt(txtV2.getText());
	                Iteraciones = Integer.parseInt(txtV3.getText());

	                while(Ciclo<=Iteraciones)
	                {
	                    Resultado = X + Y;
	                    Cadena = Cadena + " " + String.valueOf(Resultado);
	                    X = Y;
	                    Y = Resultado;
	                    Ciclo = Ciclo + 1;
	                }
	                JOptionPane.showMessageDialog(null, Cadena);
			}
		});
		btnImprimir.setBounds(10, 116, 89, 23);
		contentPane.add(btnImprimir);
		
		JLabel lblNewLabel = new JLabel("Valor 1");
		lblNewLabel.setBounds(24, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblValor = new JLabel("Valor 2");
		lblValor.setBounds(125, 11, 46, 14);
		contentPane.add(lblValor);
		
		JLabel lblCantidadDeRepeticiones = new JLabel("Repeticiones");
		lblCantidadDeRepeticiones.setBounds(218, 12, 68, 23);
		contentPane.add(lblCantidadDeRepeticiones);
		
		txtV1 = new JTextField();
		txtV1.setBounds(10, 46, 86, 20);
		contentPane.add(txtV1 );
		txtV1.setColumns(10);
		
		txtV2 = new JTextField();
		txtV2.setColumns(10);
		txtV2.setBounds(112, 46, 86, 20);
		contentPane.add(txtV2);
		
		txtV3 = new JTextField();
		txtV3.setColumns(10);
		txtV3.setBounds(208, 46, 86, 20);
		contentPane.add(txtV3);
	}
}
