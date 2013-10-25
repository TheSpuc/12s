package okt03_opg2_decorator;

public class Bakkesensor extends BilDecorator {

	public Bakkesensor(Bil bil) {
		super(20000, "Bakkesensor", bil);
	}

}
