package Parkeersimulator;

import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Controller extends JPanel implements ActionListener {
	private Simulator simulator;
	private JButton pluseen;
	private JButton plushonderd;
	private JButton start;
	private JButton stop;
	
	public Controller(Simulator model) {
		this.simulator=model;
		
		//setSize(450, 50);
		pluseen=new JButton("+1");
		pluseen.addActionListener(this);
		plushonderd=new JButton("+100");
		plushonderd.addActionListener(this);
		start=new JButton("Start");
		start.addActionListener(this);
		stop=new JButton("Stop");
		stop.addActionListener(this);
		
		this.setLayout(null);
		add(pluseen);
		add(plushonderd);
		add(start);
		add(stop);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==pluseen) {
			simulator.setAantalTicks(simulator.getAantalTicks()+1);
		}
		
		if (e.getSource()==plushonderd) {
			simulator.setAantalTicks(simulator.getAantalTicks()+100);
		}
		
		if (e.getSource()==start) {
			simulator.run();
		}
		
		if (e.getSource()==stop) {
			simulator.stop();
		}
	}
}