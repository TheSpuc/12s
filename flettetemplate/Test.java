package flettetemplate;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		Sekvens sekv = new ListSekvens();
		sekv.add(new Hold(Hold.Ugedag.TIRSDAG, "Basketball"));
		sekv.add(new Hold(Hold.Ugedag.TIRSDAG, "Volleyball"));
		sekv.add(new Hold(Hold.Ugedag.TORSDAG, "Fodbold"));
		sekv.add(new Hold(Hold.Ugedag.TORSDAG, "Håndbold"));
		
		
		Iterator it1 = sekv.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}

		Sekvens sekv2 = new ListSekvens();
		sekv2.add(new Hold(Hold.Ugedag.TIRSDAG, "Basketball"));
		sekv2.add(new Hold(Hold.Ugedag.ONSDAG, "Floorball"));
		sekv2.add(new Hold(Hold.Ugedag.TORSDAG, "Fodbold"));

		Iterator it2 = sekv2.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}

	}

}
