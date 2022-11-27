package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Button;
import java.awt.Checkbox;
import javax.swing.JEditorPane;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela_servicos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_servicos frame = new tela_servicos();
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
	public tela_servicos() {
		setTitle("ForcTec - Assistência Técnica");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Desktop\\images.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quase lá!...");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(10, 22, 86, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Qual tipo de serviço gostaria de solicitar?");
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 51, 329, 23);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox box_limpeza = new JCheckBox("01 - Limpeza");
		box_limpeza.setHorizontalAlignment(SwingConstants.LEFT);
		box_limpeza.setBounds(23, 98, 97, 23);
		contentPane.add(box_limpeza);
		
		JCheckBox box_troca_de_hd = new JCheckBox("03 - Troca de HD");
		box_troca_de_hd.setHorizontalAlignment(SwingConstants.LEFT);
		box_troca_de_hd.setBounds(23, 141, 125, 23);
		contentPane.add(box_troca_de_hd);
		
		JCheckBox box_formatacao = new JCheckBox("02 - Formatação");
		box_formatacao.setHorizontalAlignment(SwingConstants.LEFT);
		box_formatacao.setBounds(143, 98, 117, 23);
		contentPane.add(box_formatacao);
		
		JCheckBox box_troca_de_tela = new JCheckBox("04 - Troca de Tela");
		box_troca_de_tela.setHorizontalAlignment(SwingConstants.LEFT);
		box_troca_de_tela.setBounds(150, 141, 132, 23);
		contentPane.add(box_troca_de_tela);
		
		JButton botao_voltar_servicos = new JButton("Voltar");
		botao_voltar_servicos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		botao_voltar_servicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela_produto telaProduto = new tela_produto();
				telaProduto.setVisible(true);
			}
		});
		botao_voltar_servicos.setBounds(63, 197, 117, 35);
		contentPane.add(botao_voltar_servicos);
		
		JButton botao_proximo = new JButton("Próximo");
		botao_proximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela_pedido telaPedido = new tela_pedido();
				telaPedido.setVisible(true);
			}
		});
		botao_proximo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		botao_proximo.setBounds(222, 197, 117, 35);
		contentPane.add(botao_proximo);
	}
}