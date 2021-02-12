package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MainPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField 				firstBox;
	private JTextField 				secondBox;
	private JTextField 				inPut;
	private JTextField 				outPut;
	private JComboBox<String>		jComboBox1;
	private JComboBox<String>		jComboBox2;
	private ArrayList<String> lista = new ArrayList();
	
	MainPanel() {
		super();
		setupFirstBox();
		setupInPut();
		CriaLista();
		setupComboBox1();
		setupSecondtBox();
		setupOutPut();
		setupComboBox2();
		setupLayOut();

	}
	
	private void CriaLista() {
		lista.add ("mm (millimeter) [length]");
		lista.add ("cm (centimeters) [length]");
		lista.add ("dm (decimeters) [length]");
		lista.add ("m (meters) [length]");
		lista.add ("dam (dekameters) [length]");
		lista.add ("hm (hectometers) [length]");
        lista.add ("km (kilometers) [length]");
        lista.add ("mm² (millimeter) [area]");
        lista.add ("cm² (centimentros) [area]");
        lista.add ("dm² (decimeters) [area]");
        lista.add ("m² (meters) [area]");
        lista.add ("dam² (dekameters) [area]");
        lista.add ("hm² (hectometers) [area]");
        lista.add ("km² (kilometers) [area]");
        lista.add ("soccer field (m²) [area]");
        lista.add ("mm³ (millimeter) [area]");
        lista.add ("cm³ (centimentros) [area]");
        lista.add ("dm³ (decimeters) [area]");
        lista.add ("m³ (meters) [area]");
        lista.add ("dam³ (dekameters) [area]");
        lista.add ("hm³ (hectometers) [area]");
        lista.add ("km³ (kilometers) [area]");
        lista.add ("s (seconds) [time]");
        lista.add ("min (minutes) [time]");
        lista.add ("h (hours) [time]");
        lista.add ("days [time]");
        lista.add ("year [time]");
        lista.add ("m / s (meters per second) [speed]");
        lista.add ("k / h (kilometers per hour) [speed]");
	}
	
	
	
	private void setupFirstBox() {
		firstBox = new JTextField(20);
		firstBox.setBackground(Color.gray);
		firstBox.setBorder(BorderFactory.createEtchedBorder());
		firstBox.setHorizontalAlignment(JTextField.CENTER);
		firstBox.setText("Convert from");
		firstBox.setName("Box1");
		firstBox.setFont(new Font("Serif", Font.BOLD, 22));
		firstBox.setEditable(false);
		firstBox.setBorder(BorderFactory.createEtchedBorder());
		this.add(firstBox);
	}

	private void setupSecondtBox() {
		secondBox = new JTextField(20);
		secondBox.setBackground(Color.gray);
		secondBox.setBorder(BorderFactory.createEtchedBorder());
		secondBox.setHorizontalAlignment(JTextField.CENTER);
		secondBox.setText("to");
		secondBox.setName("Box2");
		secondBox.setFont(new Font("Serif", Font.BOLD, 22));
		secondBox.setEditable(false);
		secondBox.setBorder(BorderFactory.createEtchedBorder());
		this.add(secondBox);
	}
	
	private void setupInPut() {
		inPut = new JTextField(20);
		inPut.setText("Digite um valor:");
		inPut.setBorder(BorderFactory.createEtchedBorder());
		inPut.setHorizontalAlignment(JTextField.RIGHT);
		inPut.setName("Input");
		inPut.setFont(new Font("Serif", Font.BOLD, 22));
		inPut.setBorder(BorderFactory.createEtchedBorder());
		this.add(inPut);
	}
	
	private void setupOutPut() {
		outPut = new JTextField(20);
		outPut.setBorder(BorderFactory.createEtchedBorder());
		outPut.setHorizontalAlignment(JTextField.RIGHT);
		outPut.setEditable(false);
		outPut.setName("output");
		outPut.setFont(new Font("Serif", Font.BOLD, 22));
		outPut.setBorder(BorderFactory.createEtchedBorder());
		this.add(outPut);
	}
	private void setupComboBox1() {
		
		jComboBox1 =  new JComboBox(lista.toArray());
		jComboBox1.setName("Combo1");
		jComboBox1.setFont(new Font("Serif", Font.BOLD, 19));	
		this.add(jComboBox1);
		
	}
	private void setupComboBox2() {		
		jComboBox2 = new JComboBox(lista.toArray());				
		jComboBox2.setName("Combo2");
		jComboBox2.setFont(new Font("Serif", Font.BOLD, 19));			
		this.add(jComboBox2);
	}
	/*.addComponent(firstBox)
    .addComponent(inPut)
    .addComponent(jComboBox1)
     .addComponent(secondBox)
     .addComponent(outPut)
     .addComponent(jComboBox2);*/
	
	private void setupLayOut() {
		/*Container contentPane = new Container();
		contentPane.add(this,BorderLayout.PAGE_START);*/

		//layout.setAutoCreateContainerGaps(true);
		//First row
		firstBox.setBounds(10, 25, 250,80);
		inPut.setBounds(265, 25, 250,80);
		jComboBox1.setBounds(520, 25, 400,80);
		
		//Second row
		secondBox.setBounds(10, 110, 250,80);
		outPut.setBounds(265, 110, 250,80);
		jComboBox2.setBounds(520, 110, 400,80);
		//jComboBox2.addActionListener(this);
		//this.setLayout(new GridLayout(2,3,50,80));
		//this.setMaximumSize(getSize());
		this.setLayout(null);
		
	}
	public JTextField getInPut() {
		return inPut;
	}
	public JComboBox<String> getjComboBox1() {
		return jComboBox1;
	}
	public JTextField getOutPut() {
		return outPut;
	}
	public JComboBox<String> getjComboBox2() {
		return jComboBox2;
	}
}