package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela_produto extends JFrame {

	private JPanel contentPane;
	private JTextField campo_nome_do_produto;
	private JTextField campo_marca_do_produto;
	private JTextField campo_modelo_do_produto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_produto frame = new tela_produto();
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
	public tela_produto() {
		setFont(new Font("Dubai", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Desktop\\images.png"));
		setTitle("ForcTec - Assistência Técnica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Para darmos continuidade ao seu pedido, nos");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(10, 27, 362, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("informe os seguintes dados abaixo.");
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(10, 47, 325, 24);
		contentPane.add(lblNewLabel_1);
		
		campo_nome_do_produto = new JTextField();
		campo_nome_do_produto.setBounds(77, 111, 295, 20);
		contentPane.add(campo_nome_do_produto);
		campo_nome_do_produto.setColumns(10);
		
		campo_marca_do_produto = new JTextField();
		campo_marca_do_produto.setBounds(77, 142, 295, 20);
		contentPane.add(campo_marca_do_produto);
		campo_marca_do_produto.setColumns(10);
		
		campo_modelo_do_produto = new JTextField();
		campo_modelo_do_produto.setBounds(77, 173, 295, 20);
		contentPane.add(campo_modelo_do_produto);
		campo_modelo_do_produto.setColumns(10);
		
		JLabel nome_do_produto = new JLabel("Nome:");
		nome_do_produto.setBounds(24, 114, 46, 14);
		contentPane.add(nome_do_produto);
		
		JLabel marca_do_produto = new JLabel("Marca:");
		marca_do_produto.setBounds(24, 145, 46, 14);
		contentPane.add(marca_do_produto);
		
		JLabel modelo_do_produto = new JLabel("Modelo:");
		modelo_do_produto.setBounds(24, 174, 46, 14);
		contentPane.add(modelo_do_produto);
		
		JButton botao_proximo = new JButton("Próximo");
		botao_proximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela_servicos telaServicos = new tela_servicos();
				telaServicos.setVisible(true);
			}
		});
		botao_proximo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		botao_proximo.setBounds(150, 220, 133, 46);
		contentPane.add(botao_proximo);
	}
}