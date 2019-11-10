package visual;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import entidades.*;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class Frame9 extends JFrame{
	JButton btnNext;
	Algoritmo Algoritmo;
	int index=9;
	JPanel contentPane;
	JLabel lblPregunta;
	String TextPregunta = "Preguntas: %d/%d";
	JRadioButton rbtOp1;
	JRadioButton rbtOp2;
	JRadioButton rbtOp3;
	ButtonGroup btnGrp;
	
	public Frame9() {
		paint();
	}
	
	public Frame9(Algoritmo algoritmo) {
		Algoritmo = algoritmo;
		paint();
		
	}

	public void NextPanel() {
		
		int result =0;
		ButtonModel res = btnGrp.getSelection();
		if(res==null) {
			JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion", "Error",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		if(rbtOp1.getActionCommand() == res.getActionCommand()) {
			result=0;
		}else if(rbtOp2.getActionCommand() == res.getActionCommand()) {
			result=1;
		}else if(rbtOp3.getActionCommand() == res.getActionCommand()) {
			result=2;
		}
		
		
		Pregunta preg = new Pregunta();
		preg.Pergunta=index;
		preg.Resultado =  result;
				
		Algoritmo.Preguntas[index-1]=preg;
		
		setVisible(false);
		Frame10 f = new Frame10(Algoritmo);
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
			
			JLabel lblTexto = new JLabel("Nivel de ayuda necesario para operar el sistema.");
			lblTexto.setBounds(26, 49, 381, 16);
			panel.add(lblTexto);
			
			JLabel lblOp1 = new JLabel("El usuario requiere consultar a personal especializado para ");
			lblOp1.setBounds(60, 77, 387, 23);
			panel.add(lblOp1);
			
			JLabel lblOp21 = new JLabel("El usuario requiere ayuda contextual y manual de uso para operar el producto software.");
			lblOp21.setBounds(60, 123, 359, 16);
			panel.add(lblOp21);
			
			JLabel lblOp3 = new JLabel("El usuario opera el producto software sin asistencia.");
			lblOp3.setBounds(60, 179, 365, 16);
			panel.add(lblOp3);
			
			rbtOp1 = new JRadioButton("");
			rbtOp1.setActionCommand("op1");
			rbtOp1.setBounds(26, 88, 28, 23);
			panel.add(rbtOp1);
			
			rbtOp2 = new JRadioButton("");
			rbtOp2.setActionCommand("op2");
			rbtOp2.setBounds(26, 123, 28, 23);
			panel.add(rbtOp2);
			
			rbtOp3 = new JRadioButton("");
			rbtOp3.setActionCommand("op3");
			rbtOp3.setBounds(26, 174, 28, 23);
			panel.add(rbtOp3);
			btnGrp = new ButtonGroup();
			btnGrp.add(rbtOp1);
			btnGrp.add(rbtOp2);
			btnGrp.add(rbtOp3);
			
			JLabel lbl11= new JLabel("operar el producto software.");
			lbl11.setBounds(60, 97, 365, 16);
			panel.add(lbl11);
			
			JLabel lbl21 = new JLabel("operar el producto software.");
			lbl21.setBounds(60, 140, 347, 16);
			panel.add(lbl21);
					
			setContentPane(contentPane);	
	}
}
