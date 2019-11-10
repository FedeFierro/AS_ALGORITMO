package visual;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import entidades.*;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class Frame2 extends JFrame{
	JButton btnNext;
	Algoritmo Algoritmo;
	int index=2;
	JPanel contentPane;
	JLabel lblPregunta;
	String TextPregunta = "Preguntas: %d/%d";
	JCheckBox chkOp1;
	JCheckBox chkOp2;
	JCheckBox chkOp3;

	
	public Frame2() {
		paint();
	}
	
	public Frame2(Algoritmo algoritmo) {
		Algoritmo = algoritmo;
		paint();
		
	}

	public void NextPanel() {
		int result =0;
		result += chkOp1.isSelected()?1:0;
		result += chkOp2.isSelected()?1:0;
		result += chkOp3.isSelected()?1:0;
		Pregunta preg = new Pregunta();
		preg.Pergunta=index;
		preg.Resultado =  result<=1?0:result==2?1:2;
				
		Algoritmo.Preguntas[index-1]=preg;
		
		setVisible(false);
		Frame3 f = new Frame3(Algoritmo);
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
			
			JLabel lblTexto = new JLabel("Respecto a los resultados obtenidos. Puede decir que:");
			lblTexto.setBounds(26, 49, 381, 16);
			panel.add(lblTexto);
			
			chkOp1 = new JCheckBox("");
			chkOp1.setBounds(26, 77, 28, 23);
			panel.add(chkOp1);
			
			JLabel lblOp1 = new JLabel("La Información que brinda es confiable.");
			lblOp1.setBounds(60, 77, 387, 23);
			panel.add(lblOp1);
			
			chkOp2 = new JCheckBox("");
			chkOp2.setBounds(26, 125, 28, 23);
			panel.add(chkOp2);
			
			JLabel lblOp21 = new JLabel("Las consultas y los reportes son exactas y no");
			lblOp21.setBounds(60, 119, 359, 16);
			panel.add(lblOp21);
			
			JLabel lblOp22 = new JLabel("presentan inconsistencias.");
			lblOp22.setBounds(60, 136, 365, 16);
			panel.add(lblOp22);
			
			chkOp3 = new JCheckBox("");
			chkOp3.setBounds(26, 170, 28, 23);
			panel.add(chkOp3);
			
			JLabel lblOp3 = new JLabel("Validación de los datos ingresados por el usuario.");
			lblOp3.setBounds(60, 177, 365, 16);
			panel.add(lblOp3);
			setContentPane(contentPane);	
	}
}
