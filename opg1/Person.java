package opg1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Person {

	private PropertyChangeSupport changes = new PropertyChangeSupport(this);

	private String name = "Intet";
	private int age = 0;
	private String address ;

	public Person() {

	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		String oldName = this.name;
		this.name = newName;
		System.out.println("Oldvalue: " + oldName);
		changes.firePropertyChange("name", oldName, newName);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String newAddress) {
		String oldAddress = this.address;
		this.address = newAddress;
		changes.firePropertyChange("address", oldAddress, newAddress);
		System.out.println("Oldvalue: " + oldAddress);
	}

	public void addPropertyChangeListener(PropertyChangeListener p) {
		changes.addPropertyChangeListener(p);
	}

	public void removePropertyChangeListener(PropertyChangeListener p) {
		changes.removePropertyChangeListener(p);
	}

}
