package imc;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Tela {

	private JFrame frame;
	private CalculadoraIMC calculadoraIMC;

	// Inicialização da aplicação
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Construtor da classe
	public Tela() {
		calculadoraIMC = new CalculadoraIMC();
		initialize();
	}

	// Componentes da interface gráfica
	private JTextField textFieldNome;
	private JTextField textFieldAltura;
	private JTextField textFieldPeso;
	private JTable table;
	private JTextField textFieldIdade;
	private JTextField textFieldTelefone;
	private JTextField textFieldEndereço;
	private JRadioButton rdbtnMasculino;
	private JRadioButton rdbtnFeminino;
	private JRadioButton rdbtnPrefiroNaoInformar;
	private ButtonGroup buttonGroup;

	// Inicializa os componentes da interface gráfica
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 14));
		frame.setBounds(100, 100, 618, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(240, 240, 240));

		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1.setBounds(32, 91, 61, 14);
		frame.getContentPane().add(lblNewLabel_1);

		textFieldNome = new JTextField();
		textFieldNome.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 14));
		textFieldNome.setBounds(80, 88, 311, 20);
		frame.getContentPane().add(textFieldNome);
		textFieldNome.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Sexo:");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2.setBounds(120, 165, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);

		rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setFont(new Font("Arial Black", Font.BOLD, 14));
		rdbtnMasculino.setBounds(160, 160, 161, 23);
		frame.getContentPane().add(rdbtnMasculino);

		rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setFont(new Font("Arial Black", Font.BOLD, 14));
		rdbtnFeminino.setBounds(271, 160, 131, 23);
		frame.getContentPane().add(rdbtnFeminino);

		rdbtnPrefiroNaoInformar = new JRadioButton("Prefiro não informar");
		rdbtnPrefiroNaoInformar.setFont(new Font("Arial Black", Font.BOLD, 14));
		rdbtnPrefiroNaoInformar.setBounds(366, 160, 187, 23);
		frame.getContentPane().add(rdbtnPrefiroNaoInformar);

		buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnMasculino);
		buttonGroup.add(rdbtnFeminino);
		buttonGroup.add(rdbtnPrefiroNaoInformar);

		JLabel lblNewLabel_3 = new JLabel("Altura:");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_3.setBounds(131, 117, 55, 14);
		frame.getContentPane().add(lblNewLabel_3);

		textFieldAltura = new JTextField();
		textFieldAltura.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 14));
		textFieldAltura.setBounds(131, 133, 47, 20);
		frame.getContentPane().add(textFieldAltura);
		textFieldAltura.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Peso:");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(198, 117, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);

		textFieldPeso = new JTextField();
		textFieldPeso.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 14));
		textFieldPeso.setBounds(198, 133, 37, 20);
		frame.getContentPane().add(textFieldPeso);
		textFieldPeso.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 230, 549, 100);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, },
				new String[] { "Nome", "Sexo", "Altura", "Peso", "Idade", "IMC", "Classifica\u00E7\u00E3o" }));
		table.getColumnModel().getColumn(1).setPreferredWidth(60);
		table.getColumnModel().getColumn(2).setPreferredWidth(45);
		table.getColumnModel().getColumn(3).setPreferredWidth(45);
		table.getColumnModel().getColumn(4).setPreferredWidth(45);
		table.getColumnModel().getColumn(5).setPreferredWidth(45);
		table.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(table);

		// Define a fonte da tabela
		table.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 14));

		// Define a fonte do cabeçalho da tabela
		JTableHeader header = table.getTableHeader();
		header.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 14));

		JLabel lblNewLabel_5 = new JLabel("Idade:");
		lblNewLabel_5.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_5.setBounds(73, 117, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);

		textFieldIdade = new JTextField();
		textFieldIdade.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 14));
		textFieldIdade.setBounds(73, 133, 46, 20);
		frame.getContentPane().add(textFieldIdade);
		textFieldIdade.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Telefone:");
		lblNewLabel_6.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_6.setBounds(247, 117, 86, 14);
		frame.getContentPane().add(lblNewLabel_6);

		textFieldTelefone = new JTextField();
		textFieldTelefone.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 14));
		textFieldTelefone.setBounds(247, 133, 86, 20);
		frame.getContentPane().add(textFieldTelefone);
		textFieldTelefone.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Endereço:");
		lblNewLabel_7.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_7.setBounds(382, 117, 105, 14);
		frame.getContentPane().add(lblNewLabel_7);

		textFieldEndereço = new JTextField();
		textFieldEndereço.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 14));
		textFieldEndereço.setBounds(345, 133, 236, 20);
		frame.getContentPane().add(textFieldEndereço);
		textFieldEndereço.setColumns(10);

		JButton calcularButton = new JButton("Calcular");
		calcularButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		calcularButton.setBounds(199, 195, 161, 23);
		frame.getContentPane().add(calcularButton);
		calcularButton.setFocusPainted(false);
		calcularButton.setBackground(new Color(194, 197, 193));
		calcularButton.setForeground(new Color(0, 128, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(34, 139, 34));
		panel.setBounds(0, 0, 618, 69);
		frame.getContentPane().add(panel);
		
				// ... Configuração dos rótulos, campos de texto, botões, etc
		
				JLabel lblNewLabel = new JLabel("Calculadora de IMC");
				lblNewLabel.setForeground(new Color(173, 255, 47));
				panel.add(lblNewLabel);
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Phosphate", Font.BOLD, 20));

		calcularButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularIMC();
			}
		});
	}

	// Limpa os campos após o botão de calcular ser clicado
	private void limparCampos() {
		textFieldNome.setText("");
		textFieldAltura.setText("");
		textFieldPeso.setText("");
		textFieldIdade.setText("");
		textFieldEndereço.setText("");
		textFieldTelefone.setText("");
		buttonGroup.clearSelection();
	}

	// Calcula o IMC e exibe os resultados na tabela
	private void calcularIMC() {

		// Mensagem de erro para campos vazios
		if (camposVazios()) {
			JOptionPane.showMessageDialog(frame, "Preencha todos os campos antes de calcular o IMC.", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		// Obtendo os valores dos campos
		String nome = textFieldNome.getText();
		double altura = Double.parseDouble(textFieldAltura.getText());
		double peso = Double.parseDouble(textFieldPeso.getText());
		double idade = Double.parseDouble(textFieldIdade.getText());
		String endereco = textFieldEndereço.getText();
		String telefone = textFieldTelefone.getText();

		// Calculando o IMC usando o método existente na classe AppCalculadoraIMC
		double imc = calculadoraIMC.calcularIMC(altura, peso);
		String classificacao = calculadoraIMC.classificarIMC(imc);

		// Adicionando os resultados à tabela
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int limiteLinhas = 4;

		int linhaVazia = -1;
		for (int i = 0; i < model.getRowCount(); i++) {
			boolean linhaVaziaAtual = true;
			for (int j = 0; j < model.getColumnCount(); j++) {
				if (model.getValueAt(i, j) != null) {
					linhaVaziaAtual = false;
					break;
				}
			}
			if (linhaVaziaAtual) {
				linhaVazia = i;
				break;
			}
		}

		if (linhaVazia != -1) {
			model.setValueAt(nome, linhaVazia, 0);
			model.setValueAt(getSexoSelecionado(), linhaVazia, 1);
			model.setValueAt(altura, linhaVazia, 2);
			model.setValueAt(peso, linhaVazia, 3);
			model.setValueAt(idade, linhaVazia, 4);
			model.setValueAt(String.format("%.1f", imc), linhaVazia, 5);
			model.setValueAt(classificacao, linhaVazia, 6);
		} else {
			model.addRow(new Object[] { nome, getSexoSelecionado(), altura, peso, idade, String.format("%.1f", imc),
					classificacao });
		}
		limparCampos();

	}

	// Verifica se os campos estão vazios
	private boolean camposVazios() {
		return textFieldNome.getText().isEmpty() || textFieldAltura.getText().isEmpty()
				|| textFieldPeso.getText().isEmpty() || textFieldIdade.getText().isEmpty();
	}

	// Retorna a opção de sexo selecionada nos botões de opção
	private String getSexoSelecionado() {
		if (rdbtnMasculino.isSelected()) {
			return "Masculino";
		} else if (rdbtnFeminino.isSelected()) {
			return "Feminino";
		} else {
			return "Prefiro não informar";
		}
	}
}
