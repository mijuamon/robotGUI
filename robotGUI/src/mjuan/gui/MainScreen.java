package mjuan.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;
import java.awt.Insets;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
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
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton JButtonSetProject = new JButton("");
		JButtonSetProject.setIcon(new ImageIcon(MainScreen.class.getResource("/img/url.png")));
		JButtonSetProject.setToolTipText("Indica donde se encuentra el proyecto");
		GridBagConstraints gbc_JButtonSetProject = new GridBagConstraints();
		gbc_JButtonSetProject.insets = new Insets(0, 0, 5, 5);
		gbc_JButtonSetProject.gridx = 0;
		gbc_JButtonSetProject.gridy = 0;
		contentPane.add(JButtonSetProject, gbc_JButtonSetProject);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.gridheight = 7;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 3;
		gbc_separator.gridy = 0;
		contentPane.add(separator, gbc_separator);
		
		JButton btnAadirBrazo = new JButton("A\u00F1adir Brazo");
		btnAadirBrazo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				NewArm n = new NewArm();
				n.setVisible(true);
			}
		});
		GridBagConstraints gbc_btnAadirBrazo = new GridBagConstraints();
		gbc_btnAadirBrazo.gridheight = 2;
		gbc_btnAadirBrazo.gridwidth = 2;
		gbc_btnAadirBrazo.fill = GridBagConstraints.BOTH;
		gbc_btnAadirBrazo.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadirBrazo.gridx = 1;
		gbc_btnAadirBrazo.gridy = 1;
		contentPane.add(btnAadirBrazo, gbc_btnAadirBrazo);
		
		JButton btnAadirPiezas = new JButton("A\u00F1adir Piezas");
		GridBagConstraints gbc_btnAadirPiezas = new GridBagConstraints();
		gbc_btnAadirPiezas.gridwidth = 2;
		gbc_btnAadirPiezas.gridheight = 2;
		gbc_btnAadirPiezas.fill = GridBagConstraints.BOTH;
		gbc_btnAadirPiezas.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadirPiezas.gridx = 4;
		gbc_btnAadirPiezas.gridy = 1;
		contentPane.add(btnAadirPiezas, gbc_btnAadirPiezas);
		
		JSeparator separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.fill = GridBagConstraints.BOTH;
		gbc_separator_1.gridwidth = 3;
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 0;
		gbc_separator_1.gridy = 3;
		contentPane.add(separator_1, gbc_separator_1);
		
		JSeparator separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.fill = GridBagConstraints.BOTH;
		gbc_separator_2.gridwidth = 3;
		gbc_separator_2.insets = new Insets(0, 0, 5, 0);
		gbc_separator_2.gridx = 4;
		gbc_separator_2.gridy = 3;
		contentPane.add(separator_2, gbc_separator_2);
		
		JButton btnModificarBrazo = new JButton("Modificar Brazo");
		GridBagConstraints gbc_btnModificarBrazo = new GridBagConstraints();
		gbc_btnModificarBrazo.gridwidth = 2;
		gbc_btnModificarBrazo.gridheight = 2;
		gbc_btnModificarBrazo.fill = GridBagConstraints.BOTH;
		gbc_btnModificarBrazo.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarBrazo.gridx = 1;
		gbc_btnModificarBrazo.gridy = 4;
		contentPane.add(btnModificarBrazo, gbc_btnModificarBrazo);
		
		JButton btnModificarPieza = new JButton("Modificar Pieza");
		GridBagConstraints gbc_btnModificarPieza = new GridBagConstraints();
		gbc_btnModificarPieza.gridwidth = 2;
		gbc_btnModificarPieza.gridheight = 2;
		gbc_btnModificarPieza.fill = GridBagConstraints.BOTH;
		gbc_btnModificarPieza.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarPieza.gridx = 4;
		gbc_btnModificarPieza.gridy = 4;
		contentPane.add(btnModificarPieza, gbc_btnModificarPieza);
		
		JButton JButtonDBConection = new JButton("");
		JButtonDBConection.setToolTipText("Configura la conexion a la base de datos");
		JButtonDBConection.setIcon(new ImageIcon(MainScreen.class.getResource("/img/db.png")));
		GridBagConstraints gbc_JButtonDBConection = new GridBagConstraints();
		gbc_JButtonDBConection.gridx = 6;
		gbc_JButtonDBConection.gridy = 6;
		contentPane.add(JButtonDBConection, gbc_JButtonDBConection);
	}

}
