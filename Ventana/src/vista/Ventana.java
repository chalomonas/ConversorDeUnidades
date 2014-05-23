package vista;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField campoUno;
	private JTextField campoTres;
	private JMenuBar barraMenu;
	private JMenu menu;
	private JMenuItem itemMenuUno;
	private JMenuItem itemMenuDos;
	private JLabel etiquetaUno;
	private JLabel etiquetaDos;
	private JTextField campoDos;
	private JLabel etiquetaTres;
	private JLabel etiquetaCuatro;
	private JComboBox comboBox;
	private JPanel panelBaseUnidades;
	private JPanel panelTeclado;
	private JButton botonSiete;
	private JButton botonOcho;
	private JButton botonNueve;
	private JButton botonCuatro;
	private JButton botonCinco;
	private JButton botonSeis;
	private JButton botonUno;
	private JButton botonDos;
	private JButton botonTres;
	private JButton botonCero;
	private JButton botonPunto;
	private JLabel lblTrabajoRealizadoPor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
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
		setBackground(new Color(128, 0, 128));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana.class.getResource("/imagenes/nuevo.jpg")));
		setTitle("Conversor de unidades");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 374);

		barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);

		menu = new JMenu("Archivo");
		barraMenu.add(menu);

		itemMenuUno = new JMenuItem("Acerca de");
		itemMenuUno.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/acercade.jpg")));
		menu.add(itemMenuUno);

		itemMenuDos = new JMenuItem("Salir");
		itemMenuDos.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes/cerrar.jpg")));
		menu.add(itemMenuDos);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 145, 145, 0 };
		gbl_contentPane.rowHeights = new int[] { 14, 25, 14, 25, 14, 25, 164, 14, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		etiquetaUno = new JLabel("X unidades equivalen a Y unidades");
		etiquetaUno.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_etiquetaUno = new GridBagConstraints();
		gbc_etiquetaUno.anchor = GridBagConstraints.NORTHWEST;
		gbc_etiquetaUno.insets = new Insets(0, 0, 5, 0);
		gbc_etiquetaUno.gridwidth = 2;
		gbc_etiquetaUno.gridx = 0;
		gbc_etiquetaUno.gridy = 0;
		contentPane.add(etiquetaUno, gbc_etiquetaUno);

		campoUno = new JTextField();
		campoUno.setEditable(false);
		GridBagConstraints gbc_campoUno = new GridBagConstraints();
		gbc_campoUno.fill = GridBagConstraints.BOTH;
		gbc_campoUno.insets = new Insets(0, 0, 5, 0);
		gbc_campoUno.gridwidth = 2;
		gbc_campoUno.gridx = 0;
		gbc_campoUno.gridy = 1;
		contentPane.add(campoUno, gbc_campoUno);
		campoUno.setColumns(10);

		etiquetaDos = new JLabel("Factor de conversi\u00F3n    ");
		etiquetaDos.setFont(new Font("Arial", Font.BOLD, 12));
		etiquetaDos.setHorizontalTextPosition(SwingConstants.LEFT);
		etiquetaDos.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_etiquetaDos = new GridBagConstraints();
		gbc_etiquetaDos.anchor = GridBagConstraints.NORTHWEST;
		gbc_etiquetaDos.insets = new Insets(0, 0, 5, 5);
		gbc_etiquetaDos.gridx = 0;
		gbc_etiquetaDos.gridy = 2;
		contentPane.add(etiquetaDos, gbc_etiquetaDos);

		campoDos = new JTextField();
		campoDos.setEditable(false);
		campoDos.setColumns(10);
		GridBagConstraints gbc_campoDos = new GridBagConstraints();
		gbc_campoDos.fill = GridBagConstraints.BOTH;
		gbc_campoDos.insets = new Insets(0, 0, 5, 0);
		gbc_campoDos.gridwidth = 2;
		gbc_campoDos.gridx = 0;
		gbc_campoDos.gridy = 3;
		contentPane.add(campoDos, gbc_campoDos);

		etiquetaTres = new JLabel("Unidad de origen");
		etiquetaTres.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_etiquetaTres = new GridBagConstraints();
		gbc_etiquetaTres.anchor = GridBagConstraints.NORTHWEST;
		gbc_etiquetaTres.insets = new Insets(0, 0, 5, 5);
		gbc_etiquetaTres.gridx = 0;
		gbc_etiquetaTres.gridy = 4;
		contentPane.add(etiquetaTres, gbc_etiquetaTres);

		etiquetaCuatro = new JLabel("Valor introducido");
		etiquetaCuatro.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_etiquetaCuatro = new GridBagConstraints();
		gbc_etiquetaCuatro.anchor = GridBagConstraints.NORTHWEST;
		gbc_etiquetaCuatro.insets = new Insets(0, 0, 5, 0);
		gbc_etiquetaCuatro.gridx = 1;
		gbc_etiquetaCuatro.gridy = 4;
		contentPane.add(etiquetaCuatro, gbc_etiquetaCuatro);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Longitud (metros)", "Masa (gramos)", "Volumen (litros)" }));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.BOTH;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 5;
		contentPane.add(comboBox, gbc_comboBox);

		campoTres = new JTextField();
		GridBagConstraints gbc_campoTres = new GridBagConstraints();
		gbc_campoTres.fill = GridBagConstraints.BOTH;
		gbc_campoTres.insets = new Insets(0, 0, 5, 0);
		gbc_campoTres.gridx = 1;
		gbc_campoTres.gridy = 5;
		contentPane.add(campoTres, gbc_campoTres);
		campoTres.setColumns(10);

		panelBaseUnidades = new JPanel();
		panelBaseUnidades.setBackground(new Color(255, 255, 255));
		panelBaseUnidades.setFont(new Font("Arial", Font.BOLD, 12));
		panelBaseUnidades.setBorder(new TitledBorder(null, "Unidad de destino", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelBaseUnidades = new GridBagConstraints();
		gbc_panelBaseUnidades.fill = GridBagConstraints.BOTH;
		gbc_panelBaseUnidades.insets = new Insets(0, 0, 5, 5);
		gbc_panelBaseUnidades.gridx = 0;
		gbc_panelBaseUnidades.gridy = 6;
		contentPane.add(panelBaseUnidades, gbc_panelBaseUnidades);
		panelBaseUnidades.setLayout(new CardLayout(0, 0));

		panelTeclado = new JPanel();
		panelTeclado.setBackground(new Color(255, 255, 255));
		panelTeclado.setBorder(new TitledBorder(null, "Teclado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelTeclado = new GridBagConstraints();
		gbc_panelTeclado.fill = GridBagConstraints.BOTH;
		gbc_panelTeclado.insets = new Insets(0, 0, 5, 0);
		gbc_panelTeclado.gridx = 1;
		gbc_panelTeclado.gridy = 6;
		contentPane.add(panelTeclado, gbc_panelTeclado);
		panelTeclado.setLayout(null);

		botonSiete = new JButton("7");
		botonSiete.setBackground(new Color(255, 255, 255));
		botonSiete.setBounds(6, 16, 42, 31);
		panelTeclado.add(botonSiete);

		botonOcho = new JButton("8");
		botonOcho.setBounds(53, 16, 42, 31);
		panelTeclado.add(botonOcho);

		botonNueve = new JButton("9");
		botonNueve.setBounds(100, 16, 42, 31);
		panelTeclado.add(botonNueve);

		botonCuatro = new JButton("4");
		botonCuatro.setBounds(6, 52, 42, 31);
		panelTeclado.add(botonCuatro);

		botonCinco = new JButton("5");
		botonCinco.setBounds(53, 52, 42, 31);
		panelTeclado.add(botonCinco);

		botonSeis = new JButton("6");
		botonSeis.setBounds(100, 52, 42, 31);
		panelTeclado.add(botonSeis);

		botonUno = new JButton("1");
		botonUno.setBounds(6, 88, 42, 31);
		panelTeclado.add(botonUno);

		botonDos = new JButton("2");
		botonDos.setBounds(53, 88, 42, 31);
		panelTeclado.add(botonDos);

		botonTres = new JButton("3");
		botonTres.setBounds(100, 88, 42, 31);
		panelTeclado.add(botonTres);

		botonCero = new JButton("0");
		botonCero.setBounds(6, 124, 89, 31);
		panelTeclado.add(botonCero);

		botonPunto = new JButton(".");
		botonPunto.setBounds(100, 124, 42, 31);
		panelTeclado.add(botonPunto);

		lblTrabajoRealizadoPor = new JLabel("Autores: Saul, Waseem, Gonzalo, Jes\u00FAs");
		lblTrabajoRealizadoPor.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		GridBagConstraints gbc_lblTrabajoRealizadoPor = new GridBagConstraints();
		gbc_lblTrabajoRealizadoPor.anchor = GridBagConstraints.NORTH;
		gbc_lblTrabajoRealizadoPor.gridwidth = 2;
		gbc_lblTrabajoRealizadoPor.gridx = 0;
		gbc_lblTrabajoRealizadoPor.gridy = 7;
		contentPane.add(lblTrabajoRealizadoPor, gbc_lblTrabajoRealizadoPor);
	}
}
