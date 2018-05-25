import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class DocuInfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DocuInfo frame = new DocuInfo();
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
	public DocuInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("\uD0A4\uC6CC\uB4DC(K)");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel.setPreferredSize(new Dimension(60, 15));
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(32);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JLabel label = new JLabel("\uD0A4\uC6CC\uB4DC(K)");
		label.setPreferredSize(new Dimension(60, 15));
		label.setHorizontalTextPosition(SwingConstants.LEFT);
		panel_2.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(32);
		panel_2.add(textField_1);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JLabel label_1 = new JLabel("\uD0A4\uC6CC\uB4DC(K)");
		label_1.setPreferredSize(new Dimension(60, 15));
		label_1.setHorizontalTextPosition(SwingConstants.LEFT);
		panel_3.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(32);
		panel_3.add(textField_2);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		
		JLabel label_2 = new JLabel("\uD0A4\uC6CC\uB4DC(K)");
		label_2.setPreferredSize(new Dimension(60, 15));
		label_2.setHorizontalTextPosition(SwingConstants.LEFT);
		panel_4.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(32);
		panel_4.add(textField_3);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
		JLabel label_3 = new JLabel("\uD0A4\uC6CC\uB4DC(K)");
		label_3.setPreferredSize(new Dimension(60, 15));
		label_3.setHorizontalTextPosition(SwingConstants.LEFT);
		panel_5.add(label_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setPreferredSize(new Dimension(4, 42));
		textArea.setColumns(31);
		//panel_5.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		//scrollPane.setPreferredSize(new Dimension(223, 50));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel_5.add(scrollPane);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		
		JLabel label_4 = new JLabel("\uD0A4\uC6CC\uB4DC(K)");
		label_4.setPreferredSize(new Dimension(60, 15));
		label_4.setHorizontalTextPosition(SwingConstants.LEFT);
		panel_6.add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(32);
		panel_6.add(textField_5);
	}

}
