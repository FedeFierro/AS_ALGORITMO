package visual;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import entidades.*;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class Frame4 extends JFrame{
	JButton btnNext;
	Algoritmo Algoritmo;
	int index=4;
	JPanel contentPane;
	JLabel lblPregunta;
	String TextPregunta = "Preguntas: %d/%d";
	JRadioButton rbtOp1;
	JRadioButton rbtOp2;
	JRadioButton rbtOp3;
	ButtonGroup btnGrp;
	
	public Frame4() {
		paint();
	}
	
	public Frame4(Algoritmo algoritmo) {
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
			result=2;
		}else if(rbtOp2.getActionCommand() == res.getActionCommand()) {
			result=1;
		}else if(rbtOp3.getActionCommand() == res.getActionCommand()) {
			result=0;
		}
		
		
		Pregunta preg = new Pregunta();
		preg.Pergunta=index;
		preg.Resultado =  result;
				
		Algoritmo.Preguntas[index-1]=preg;
		
		setVisible(false);
		Frame5 f = new Frame5(Algoritmo);
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
			
			JLabel lblTexto = new JLabel("Utilización de la memoria RAM del equipo.");
			lblTexto.setBounds(26, 49, 381, 16);
			panel.add(lblTexto);
			
			JLabel lblOp1 = new JLabel("Menos del 5MB de uso de la memoria RAM.");
			lblOp1.setBounds(60, 77, 387, 23);
			panel.add(lblOp1);
			
			JLabel lblOp21 = new JLabel("Entre 5 MB y 20MB de uso de la memoria RAM.");
			lblOp21.setBounds(60, 119, 359, 16);
			panel.add(lblOp21);
			
			JLabel lblOp3 = new JLabel("Mas de 20 MB de uso de la memoria RAM.");
			lblOp3.setBounds(60, 158, 365, 16);
			panel.add(lblOp3);
			
			rbtOp1 = new JRadioButton("");
			rbtOp1.setActionCommand("op1");
			rbtOp1.setBounds(26, 76, 28, 23);
			panel.add(rbtOp1);
			
			rbtOp2 = new JRadioButton("");
			rbtOp2.setActionCommand("op2");
			rbtOp2.setBounds(26, 115, 28, 23);
			panel.add(rbtOp2);
			
			rbtOp3 = new JRadioButton("");
			rbtOp3.setActionCommand("op3");
			rbtOp3.setBounds(26, 153, 28, 23);
			panel.add(rbtOp3);
			btnGrp = new ButtonGroup();
			btnGrp.add(rbtOp1);
			btnGrp.add(rbtOp2);
			btnGrp.add(rbtOp3);
					
			setContentPane(contentPane);	
	}
}
