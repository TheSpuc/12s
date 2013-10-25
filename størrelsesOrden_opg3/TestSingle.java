package størrelsesOrden_opg3;

public class TestSingle {

	public static void main(String[] args) {
		SingleLinkListHul<String> sl = new SingleLinkListHul<String>();
		sl.addElement("Anders");
		sl.addElement("Cartman");
		sl.addElement("Eigil");
		sl.addElement("Beo");
		sl.addElement("Ditte");
		//
		sl.udskrivElements();
		System.out.println(sl.countElements());

		sl.deleteElement("Beo");

		sl.udskrivElements();
		System.out.println(sl.countElements());

	}

}
