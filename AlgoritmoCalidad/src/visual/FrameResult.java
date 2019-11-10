package visual;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.*;
import entidades.*;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class FrameResult extends JFrame{
	JButton btnNext;
	Algoritmo Algoritmo;
	JPanel contentPane;
	JLabel lblPregunta;
	String TextPregunta = "Preguntas: %d/%d";
	ButtonGroup btnGrp;
	private JLabel lblFunc;
	private JLabel lblSegAcc;
	private JLabel lblExacRes;
	private JLabel lblEfi;
	private JLabel lblCompTiempo;
	private JLabel lblUtiRec;
	private JLabel lblCapaRec;
	private JLabel lblTolerancia;
	private JLabel lblFiabi;
	private JLabel lblCapOp;
	private JLabel lblCapEnt;
	private JLabel lblUsabilidad;
	private JLabel lblInsta;
	private JLabel lblAdap;
	private JLabel lblPorta;
	private JLabel lblResultado;
	
	public FrameResult() {
		paint();
	}
	
	public FrameResult(Algoritmo algoritmo) {
		Algoritmo = algoritmo;
		paint();
		
	}

	public void NextPanel() {
		dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
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
			
		btnNext = new JButton("Cerrar");
		panel.add(btnNext);
		 btnNext.addActionListener(new ActionListener() {

		     @Override
		     public void actionPerformed(ActionEvent e) {
		        NextPanel();
		     }

		 });
			btnNext.setBounds(279,343,215,29);
			
			lblFunc = new JLabel("Funcionabilidad");
			lblFunc.setBounds(20, 20, 127, 16);
			panel.add(lblFunc);

			JLabel lblResFunc= new JLabel();
			lblResFunc.setBounds(200,20,100,16);
			setResultadoCaracteristica(0, 1, lblResFunc);
			panel.add(lblResFunc);
			
			lblSegAcc = new JLabel("Seguridad de acceso");
			lblSegAcc.setBounds(60, 35, 170, 16);
			panel.add(lblSegAcc);
			
			JLabel lblResSegAcc = new JLabel();
			lblResSegAcc.setBounds(300, 35, 100, 16);
			setResultadoSubCaracteristica(0,lblResSegAcc);
			panel.add(lblResSegAcc);
			
			lblExacRes = new JLabel("Exactitud de resultados");
			lblExacRes.setBounds(60, 50, 170, 16);
			panel.add(lblExacRes);
			
			JLabel lblResExaRes = new JLabel();
			lblResExaRes.setBounds(300, 50, 100, 16);
			setResultadoSubCaracteristica(1,lblResExaRes);
			panel.add(lblResExaRes);
			
			
			lblEfi = new JLabel("Eficiencia");
			lblEfi.setBounds(20, 75, 116, 16);
			panel.add(lblEfi);
			
			JLabel lblResEfi= new JLabel();
			lblResEfi.setBounds(200,75,100,16);
			setResultadoCaracteristica(2, 3,4, lblResEfi);
			panel.add(lblResEfi);
			
			lblUtiRec = new JLabel("Utilización de recursos");
			lblUtiRec.setBounds(60, 90, 166, 16);
			panel.add(lblUtiRec);
			
			JLabel lblResUtiRec = new JLabel();
			lblResUtiRec.setBounds(300, 90, 100, 16);
			setResultadoSubCaracteristica(2,3,lblResUtiRec);
			panel.add(lblResUtiRec);
			
			
			lblCompTiempo = new JLabel("Comportamiento en el tiempo");
			lblCompTiempo.setBounds(60, 105, 215, 16);
			panel.add(lblCompTiempo);
			
			JLabel lblResCompTiemp = new JLabel();
			lblResCompTiemp.setBounds(300, 105, 100, 16);
			setResultadoSubCaracteristica(4,lblResCompTiemp);
			panel.add(lblResCompTiemp);
			
			
			lblFiabi = new JLabel("Fiabilidad");
			lblFiabi.setBounds(20, 130, 99, 16);
			panel.add(lblFiabi);
			
			JLabel lblResFia= new JLabel();
			lblResFia.setBounds(200,130,100,16);
			setResultadoCaracteristica(5, 6, lblResFia);
			panel.add(lblResFia);
			
			lblTolerancia = new JLabel("Tolerancia a fallos");
			lblTolerancia.setBounds(60, 145, 170, 16);
			panel.add(lblTolerancia);
			
			JLabel lblResTolFall = new JLabel();
			lblResTolFall.setBounds(300, 145, 100, 16);
			setResultadoSubCaracteristica(5,lblResTolFall);
			panel.add(lblResTolFall);
			
			lblCapaRec = new JLabel("Capacidad de recuperación de errores");
			lblCapaRec.setBounds(60, 160, 243, 16);
			panel.add(lblCapaRec);
			
			JLabel lblResCapRec = new JLabel();
			lblResCapRec.setBounds(300, 160, 100, 16);
			setResultadoSubCaracteristica(6,lblResCapRec);
			panel.add(lblResCapRec);
			
			lblUsabilidad = new JLabel("Usabilidad");
			lblUsabilidad.setBounds(20, 185, 116, 16);
			panel.add(lblUsabilidad);
			
			JLabel lblResUsa= new JLabel();
			lblResUsa.setBounds(200,185,100,16);
			setResultadoCaracteristica(7, 8, lblResUsa);
			panel.add(lblResUsa);
			
			lblCapEnt = new JLabel("Capacidad de ser entendido");
			lblCapEnt.setBounds(60, 200, 192, 16);
			panel.add(lblCapEnt);
			
			JLabel lblResCapEnt = new JLabel();
			lblResCapEnt.setBounds(300, 200, 100, 16);
			setResultadoSubCaracteristica(7,lblResCapEnt);
			panel.add(lblResCapEnt);
			
			
			lblCapOp = new JLabel("Capacidad para ser operado");
			lblCapOp.setBounds(60, 215, 215, 16);
			panel.add(lblCapOp);
			
			JLabel lblResCapOp = new JLabel();
			lblResCapOp.setBounds(300, 215, 100, 16);
			setResultadoSubCaracteristica(8,lblResCapOp);
			panel.add(lblResCapOp);
			
			
			lblPorta = new JLabel("Portabilidad");
			lblPorta.setBounds(20, 240, 88, 16);
			panel.add(lblPorta);

			JLabel lblResPorta= new JLabel();
			lblResPorta.setBounds(200,240,100,16);
			setResultadoCaracteristica(9, 10, lblResPorta);
			panel.add(lblResPorta);
			
			lblAdap = new JLabel("Adaptabilidad");
			lblAdap.setBounds(60, 255, 170, 16);
			panel.add(lblAdap);
			
			JLabel lblResAdap = new JLabel();
			lblResAdap.setBounds(300, 255, 100, 16);
			setResultadoSubCaracteristica(9,lblResAdap);
			panel.add(lblResAdap);
			
			lblInsta = new JLabel("Instalabilidad");
			lblInsta.setBounds(60, 270, 215, 16);
			panel.add(lblInsta);
			
			JLabel lblResInst = new JLabel();
			lblResInst.setBounds(300, 270, 100, 16);
			setResultadoSubCaracteristica(10,lblResInst);
			panel.add(lblResInst);
			
			
			
			
			lblResultado = new JLabel();
			lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
			lblResultado.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
			setResultadoFinal(Algoritmo.Preguntas, lblResultado);
			lblResultado.setBounds(50, 298, 415, 26);
			panel.add(lblResultado);
			btnGrp = new ButtonGroup();
					
			setContentPane(contentPane);	
	}
	private void setResultadoSubCaracteristica(int idPreg, JLabel lbl) {
		Pregunta preg = Algoritmo.Preguntas[idPreg];
		switch (preg.Resultado) {
		case 0:
				lbl.setText("MALA");
				lbl.setForeground(Color.RED);
			break;
		case 1:
			lbl.setText("REGULAR");
			lbl.setForeground(new Color(244, 238, 33));
			break;
		case 2:
			lbl.setText("BUENA");
			lbl.setForeground(new Color(32, 139, 63));
			break;	
		}
	}
	private void setResultadoSubCaracteristica(int idPreg1, int idPreg2, JLabel lbl) {
		Pregunta Preg1 = Algoritmo.Preguntas[idPreg1];
		Pregunta Preg2 = Algoritmo.Preguntas[idPreg2];
		int res = Preg1.Resultado*10 + Preg2.Resultado;
		switch(res) {
		case 0:
		case 1:
		case 10:
			lbl.setText("MALA");
			lbl.setForeground(Color.RED);
			break;
		case 11:
		case 12:
		case 21:
			lbl.setText("REGULAR");
			lbl.setForeground(new Color(244, 238, 33));
			break;
		case 22: 
			lbl.setText("BUENA");
			lbl.setForeground(new Color(32, 139, 63));
			break;
		}
	}
	private void setResultadoCaracteristica(int idPreg1, int idPreg2, JLabel lbl) {
		Pregunta Preg1 = Algoritmo.Preguntas[idPreg1];
		Pregunta Preg2 = Algoritmo.Preguntas[idPreg2];
		int res = Preg1.Resultado*10 + Preg2.Resultado;
		switch(res) {
		case 0:
		case 1:
		case 10:
			lbl.setText("FALLÓ");
			lbl.setForeground(Color.RED);
			break;
		case 11:
		case 12:
		case 21:
		case 22: 
			lbl.setText("OK");
			lbl.setForeground(new Color(32, 139, 63));
			break;
		}
	}
	private void setResultadoCaracteristica(int idPreg1, int idPreg2,int idPreg3, JLabel lbl) {
		Pregunta Preg1 = Algoritmo.Preguntas[idPreg1];
		Pregunta Preg2 = Algoritmo.Preguntas[idPreg2];
		Pregunta Preg3 = Algoritmo.Preguntas[idPreg3];
		int res = (Preg1.Resultado*100) + (Preg2.Resultado*10)+ Preg3.Resultado;
		switch(res) {
		case 0:
		case 1:
		case 10:
		case 100:
			lbl.setText("FALLÓ");
			lbl.setForeground(Color.RED);
			break;
		case 111:
		case 112:
		case 121:
		case 122:
		case 211:
		case 212:
		case 221:
		case 222: 
			lbl.setText("OK");
			lbl.setForeground(new Color(32, 139, 63));
			break;
		}
	}
	public void setResultadoFinal(Pregunta[] preguntas, JLabel lblResult) {
		for (int i=0; i< preguntas.length; i++) {
			if(preguntas[i].Resultado==0) {
				lblResult.setText("NO SATISFACTORIO.");
				lblResult.setForeground(Color.RED);
				return;
			}
		}
		lblResult.setText("SATISFACTORIO.");
		lblResult.setForeground(new Color(32, 139, 63));
	} 
}
