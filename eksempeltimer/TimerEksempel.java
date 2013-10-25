package eksempeltimer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class TimerEksempel {
	private Timer hejTimer,goddagTimer;
	
	public TimerEksempel(){
		hejTimer = new Timer(2000,new HejTimerListner());
		goddagTimer = new Timer(8000, new GoddagTimerListner());
	}
	
	
	public class HejTimerListner implements ActionListener {

	
		public void actionPerformed(ActionEvent e) {
			System.out.println("Hej");

		}

	}
	public class GoddagTimerListner implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
			System.out.println("Goddag");

		}

	}
	
	public static void main(String[] args){
	
		TimerEksempel eks = new TimerEksempel();
		eks.hejTimer.restart();
		eks.goddagTimer.restart();
		while(true){}
	}
}
