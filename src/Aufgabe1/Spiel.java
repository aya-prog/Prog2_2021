package Aufgabe1;

import javax.swing.JOptionPane;

public class Spiel {
	
	
	public static int siegPunkte;
	private Spieler[] spieler;
	
	Spiel()
	{
		anzahlSpielerFestlegen();
		anzahlSiegPunkteFestlegen();
		spielerName();
	}
	
	public void anzahlSpielerFestlegen() {
		int anzSpieler = 0;
		boolean inputOk = false;
		while(!inputOk)
		{
			try
			{
				String input = JOptionPane.showInputDialog(null, "Wie viele Spieler?", "Spieleranzahl", JOptionPane.PLAIN_MESSAGE );
				inputOk = true;
				anzSpieler = Integer.parseInt(input);
			}
			catch(NumberFormatException e)
			{

				JOptionPane.showMessageDialog(null, "Sie müssen eine Zahl eingeben!", "Fehler", JOptionPane.PLAIN_MESSAGE  );
				inputOk = false;
			}
		}
		spieler = new Spieler[anzSpieler];
	}
	
	public void anzahlSiegPunkteFestlegen() {
		boolean inputOk = false;
		while(!inputOk)
		{
			try
			{
				String input = JOptionPane.showInputDialog(null, "Wie viele Siegpunkte? ", "Siegpunkte", JOptionPane.PLAIN_MESSAGE);
				inputOk = true;
				siegPunkte = Integer.parseInt(input);
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Sie müssen eine Zahl eingeben! ", "Fehler", JOptionPane.PLAIN_MESSAGE);
				inputOk = false;
			}
		}
		
	}
	
	public void spielerName() {
		String name = "";
		for(int i=0; i < spieler.length; i++)
		{
			name = JOptionPane.showInputDialog("Name des Spielers " + (i+1)+" :");
			spieler[i] = new Spieler(name);
		}
	}
	
	
	public void spielen()
	{
		int index = 0;
		boolean gewonnen = false;
		while(!gewonnen)
		{
			gewonnen = spieler[index].wuerfeln();
			index = (index<spieler.length-1) ? index+1 : 0;
		}
	}
	
	public static void main(String[] args)
	{
		Spiel spiel = new Spiel();
		spiel.spielen();
	}
	
}
