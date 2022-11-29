package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Label;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;

public class tela_pedido extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_pedido frame = new tela_pedido();
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
	public tela_pedido() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Desktop\\images.png"));
		setTitle("ForcTec - Assistência Técnica");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Até agora vimos que foi pedido os seguintes");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 11, 346, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("serviços. gostaria de finalizar?");
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 33, 245, 19);
		contentPane.add(lblNewLabel_1);
		
		JButton botao_confirmar = new JButton("Confirmar");
		botao_confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela_finalizacao tela_finalizacao = new tela_finalizacao();
				tela_finalizacao.setVisible(true);
			}
		});
		botao_confirmar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		botao_confirmar.setBounds(204, 214, 127, 36);
		contentPane.add(botao_confirmar);
		
		JButton botao_voltar = new JButton("Voltar");
		botao_voltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		botao_voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tela_servicos telaServicos = new tela_servicos();
				telaServicos.setVisible(true);
			}
		});
		botao_voltar.setBounds(30, 214, 127, 36);
		contentPane.add(botao_voltar);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(53, 63, 89, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel valor_total = new JLabel("Valor total:");
		valor_total.setHorizontalAlignment(SwingConstants.LEFT);
		valor_total.setBounds(10, 100, 64, 14);
		contentPane.add(valor_total);
		
		JLabel prazo_de_entrega = new JLabel("Prazo de entrega:");
		prazo_de_entrega.setBounds(10, 138, 101, 14);
		contentPane.add(prazo_de_entrega);
		
		JTextPane campo_valor_total_texto = new JTextPane();
		campo_valor_total_texto.setBackground(new Color(240, 240, 240));
		campo_valor_total_texto.setBounds(75, 95, 180, 19);
		contentPane.add(campo_valor_total_texto);
		
		JTextPane campo_prazo_de_entrega_texto = new JTextPane();
		campo_prazo_de_entrega_texto.setBackground(new Color(240, 240, 240));
		campo_prazo_de_entrega_texto.setBounds(112, 138, 180, 20);
		contentPane.add(campo_prazo_de_entrega_texto);
	}
}