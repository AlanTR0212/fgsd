package recuperacion2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class crud {

	private JFrame frmProvedor;
	private JTextField txtProvedor;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtDireccion;
	private JTextField txtUrl;
	private JTextField txtContacto;
	private JButton btnEliminar;
	private JButton btnCargar;
	private JButton btnIncertar;
	private JButton btnActualizar;
	Dataprovedor pro=new Dataprovedor();

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crud window = new crud();
					window.frmProvedor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public crud() {
		initialize();
	}

	
	private void initialize() {
		frmProvedor = new JFrame();
		frmProvedor.setTitle("Provedor");
		frmProvedor.setBounds(100, 100, 625, 366);
		frmProvedor.setLocationRelativeTo(null);
		frmProvedor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProvedor.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IDPROVEDOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(34, 41, 83, 14);
		frmProvedor.getContentPane().add(lblNewLabel);
		
		txtProvedor = new JTextField();
		txtProvedor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		txtProvedor.setBounds(147, 39, 107, 20);
		frmProvedor.getContentPane().add(txtProvedor);
		txtProvedor.setColumns(10);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(34, 83, 83, 14);
		frmProvedor.getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		txtNombre.setColumns(10);
		txtNombre.setBounds(147, 81, 107, 20);
		frmProvedor.getContentPane().add(txtNombre);
		
		JLabel lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTelefono.setBounds(34, 119, 83, 14);
		frmProvedor.getContentPane().add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(147, 112, 107, 20);
		frmProvedor.getContentPane().add(txtTelefono);
		
		JLabel lblCorreo = new JLabel("CORREO");
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCorreo.setBounds(34, 155, 83, 14);
		frmProvedor.getContentPane().add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(147, 149, 107, 20);
		frmProvedor.getContentPane().add(txtCorreo);
		
		JLabel lblDireccion = new JLabel("DIRECCION");
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDireccion.setBounds(34, 190, 83, 14);
		frmProvedor.getContentPane().add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(147, 188, 107, 20);
		frmProvedor.getContentPane().add(txtDireccion);
		
		JLabel lblUrl = new JLabel("URL");
		lblUrl.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUrl.setBounds(34, 225, 83, 14);
		frmProvedor.getContentPane().add(lblUrl);
		
		txtUrl = new JTextField();
		txtUrl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		txtUrl.setColumns(10);
		txtUrl.setBounds(147, 223, 107, 20);
		frmProvedor.getContentPane().add(txtUrl);
		
		JLabel lblContacto = new JLabel("CONTACTO");
		lblContacto.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContacto.setBounds(34, 256, 83, 14);
		frmProvedor.getContentPane().add(lblContacto);
		
		txtContacto = new JTextField();
		txtContacto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		txtContacto.setColumns(10);
		txtContacto.setBounds(147, 254, 107, 20);
		frmProvedor.getContentPane().add(txtContacto);
		
		btnIncertar = new JButton("INSERTAR");
		btnIncertar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Dataprovedor c = new Dataprovedor();
					   c.setidProvedor(Integer.parseInt(txtProvedor.getText()));
						c.setNombre(txtNombre.getText());
						c.setTelfono(txtTelefono.getText());
						c.setCorreo(txtCorreo.getText());
						c.setDireccion(txtDireccion.getText());
						c.setUrl(txtUrl.getText());
						c.setContacto(txtContacto.getText());
						if (c.insertar()) {
							JOptionPane.showMessageDialog(null, "Ok");
						} else {
							JOptionPane.showMessageDialog(null, "ERROR");
						}
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "ERROR");
					}
				
			}
		});
		btnIncertar.setBounds(298, 38, 89, 23);
		frmProvedor.getContentPane().add(btnIncertar);
		
		btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					pro.setidProvedor(Integer.parseInt(txtProvedor.getText()));
					pro.setNombre(txtNombre.getText());
					pro.setTelfono(txtTelefono.getText());
					pro.setCorreo(txtCorreo.getText());
					pro.setDireccion(txtDireccion.getText());
					pro.setUrl(txtUrl.getText());
					pro.setContacto(txtContacto.getText());
					if (pro.actualizar()) {
						JOptionPane.showMessageDialog(null, "Ok");
					} else {
						JOptionPane.showMessageDialog(null, "ERROR");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			}
		});
		btnActualizar.setBounds(429, 38, 89, 23);
		frmProvedor.getContentPane().add(btnActualizar);
		
		btnCargar = new JButton("CARGAR");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int idProvedor = Integer.parseInt(JOptionPane.showInputDialog("ID a cargar"));
					pro.setidProvedor(idProvedor);
					if (pro.cargar()) {
						txtProvedor.setText("" + pro.getidProvedor());
						txtNombre.setText(pro.getNombre());
						txtTelefono.setText(pro.getTelfono());
						txtCorreo.setText(pro.getCorreo());
						txtDireccion.setText(pro.getDireccion());
						txtUrl.setText(pro.getUrl());
						txtContacto.setText(pro.getContacto());
						JOptionPane.showMessageDialog(null, "SE CARGO CORRECTAMENTE");
					} else {
						JOptionPane.showMessageDialog(null, "Error 404");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error 404");
				}
			}
		});
		btnCargar.setBounds(298, 94, 89, 23);
		frmProvedor.getContentPane().add(btnCargar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int idProvedor = Integer.parseInt(JOptionPane.showInputDialog("ID a cargar"));
					pro.setidProvedor(idProvedor);
					if (pro.eliminar()) {
						JOptionPane.showMessageDialog(null, "SE ELIMINO CORRECTAMENTE");
					} else {
						JOptionPane.showMessageDialog(null, "Error 404");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error 404");
				}
			}
		});
		btnEliminar.setBounds(429, 94, 89, 23);
		frmProvedor.getContentPane().add(btnEliminar);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}

			private void limpiar() {
				txtProvedor.setText("");
				txtNombre.setText("");
				txtTelefono.setText("");
				txtCorreo.setText("");
				txtDireccion.setText("");
				txtContacto.setText("");
				txtUrl.setText("");
				
			}
		});
		btnBorrar.setBounds(298, 152, 89, 23);
		frmProvedor.getContentPane().add(btnBorrar);
	}
}
