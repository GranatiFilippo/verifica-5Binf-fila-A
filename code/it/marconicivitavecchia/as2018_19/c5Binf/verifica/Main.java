
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(800,500);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder();
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<html>");
		sb.append("<body>");
		sb.append("<table>");
		sb.append("<tr>");
		sb.append("<th>");
		sb.append("<Name>");
		sb.append("</th>");
		sb.append("<th>");
		sb.append("<Hex>");
		sb.append("</th>");
		sb.append("<th>");
		sb.append("<RGB>");
		sb.append("</th>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<th>");
		sb.append("<Persian Green>");
		sb.append("</th>");
		sb.append("<th>");
		sb.append("<#00A693>");
		sb.append("</th>");
		sb.append("<th>");
		sb.append("<0,166,147>");
		sb.append("</th>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<th>");
		sb.append("<venice Blue>");
		sb.append("</th>");
		sb.append("<th>");	
		sb.append("<#055989>");
		sb.append("</th>");
		sb.append("<th>");
		sb.append("<5,89,137>");
		sb.append("</th>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<th>");
		sb.append("<Pale Blue>");
		sb.append("</th>");
		sb.append("<th>");
		sb.append("<#73D1E4>");
		sb.append("</th>");
		sb.append("<th>");
		sb.append("<155,209,228>");
		sb.append("</th>");
		sb.append("</tr>");
		sb.append("</table>");
		sb.append("</body>");
		sb.append("</html>");
		// TODO Convertire lo StringBuilder in String
		String text = sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(text));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

