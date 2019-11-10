package visual;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import entidades.*;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class Frame8 extends JFrame{
	JButton btnNext;
	Algoritmo Algoritmo;
	int index=8;
	JPanel contentPane;
	JLabel lblPregunta;
	String TextPregunta = "Preguntas: %d/%d";
	JCheckBox chkOp1;
	JCheckBox chkOp2;
	JCheckBox chkOp3;

	
	public Frame8() {
		paint();
	}
	
	public Frame8(Algoritmo algoritmo) {
		Algoritmo = algoritmo;
		paint();
		
	}

	public void NextPanel() {
		int result =0;
		result += chkOp1.isSelected()?1:0;
		result += chkOp2.isSelected()?1:0;
		Pregunta preg = new Pregunta();
		preg.Pergunta=index;
		preg.Resultado =  result;
				
		Algoritmo.Preguntas[index-1]=preg;
		
		setVisible(false);
		Frame9 f = new Frame9(Algoritmo);
		f.setVisible(true);
	}
	private void paint() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Algoritmo de Calidad - Sistema de Pagos.");
		setSize(500, 400);
		setResizable(false);
	    setLocationRelativeTo(null);
	    contentPane= new JPanel();
	    contentPane.setSize(500, 400);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
			
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
			
		btnNext = new JButton("Siguiente");
		panel.add(btnNext);
		 btnNext.addActionListener(new ActionListener() {

		     @Override
		     public void actionPerformed(ActionEvent e) {
		        NextPanel();
		     }

		 });
			btnNext.setBounds(279,343,215,29);
			
			JLabel lblPregunta = new JLabel(String.format(TextPregunta, index, 11));
			lblPregunta.setBounds(32, 348, 187, 16);
			panel.add(lblPregunta);
			
			JLabel lblTexto = new JLabel("Tiene ayudas para facilitar su uso.");
			lblTexto.setBounds(26, 49, 381, 16);
			panel.add(lblTexto);
			
			chkOp1 = new JCheckBox("");
			chkOp1.setBounds(26, 77, 28, 23);
			panel.add(chkOp1);
			
			JLabel lblOp1 = new JLabel("Posee ayuda contextual sobre menús y botones de acción.");
			lblOp1.setBounds(60, 77, 387, 23);
			panel.add(lblOp1);
			
			chkOp2 = new JCheckBox("");
			chkOp2.setBounds(26, 112, 28, 23);
			panel.add(chkOp2);
			
			JLabel lblOp21 = new JLabel("Manual de usuario incorporado al sistema como un menú dedicado.");
			lblOp21.setBounds(60, 115, 387, 16);
			panel.add(lblOp21);
			setContentPane(contentPane);	
	}
}
