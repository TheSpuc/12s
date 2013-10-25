package TestJelly;

import java.awt.*;
import java.beans.*;

/**
 * A simple bean with bound properties and one constrained property. The
 * constrained property is "priceInCents". VetoablePropertyChange listeners can
 * reject a proposed value for this property by throwing a
 * PropertyVetoException.
 * 
 * @see sunw.demo.misc.Voter
 */
public class JellyBean extends java.awt.Component {
	
	// ----------------------------------------------------------------------
	// Private data fields:

	private PropertyChangeSupport changes = new PropertyChangeSupport(this);

	private Color ourColor = Color.orange;
	private int ourPriceInCents = 2;

	/**
	 * Construct a smallish JellyBean.
	 */
	public JellyBean() {
	}

	public void paint(Graphics g) {
		g.setColor(ourColor);
		g.fillArc(5, 5, 30, 30, 0, 360);
		g.fillArc(25, 5, 30, 30, 0, 360);
		g.fillRect(20, 5, 20, 30);
	}

	public Dimension getPreferredSize() {
		return new Dimension(60, 40);
	}

	/**
	 * Returns the color that the jelly bean is rendered with.
	 * 
	 * @see #setColor
	 */
	public synchronized Color getColor() {
		return ourColor;
	}

	/**
	 * Sets the color that the jelly bean is rendered with. This is a bound
	 * property.
	 * 
	 * @see #getColor
	 */
	public void setColor(Color newColor) {
		Color oldColor = ourColor;
		ourColor = newColor;
		changes.firePropertyChange("color", oldColor, newColor);
		repaint();
	}

	/**
	 * Returns the current price.
	 * 
	 * @see #setPriceInCents
	 */
	public synchronized int getPriceInCents() {
		return ourPriceInCents;
	}

	/**
	 * Set the price in cents unless one of the VetoableChangeListeners throws a
	 * PropertyVetoException. This is a constrained property.
	 * 
	 * @exception PropertyVetoException
	 *                if the proposed price was vetoed
	 */
	public void setPriceInCents(int newPriceInCents)
			throws PropertyVetoException {
		int oldPriceInCents = ourPriceInCents;
		ourPriceInCents = newPriceInCents;
		changes.firePropertyChange("priceInCents",
				new Integer(oldPriceInCents), new Integer(newPriceInCents));
	}

	// ----------------------------------------------------------------------
	// Methods for registering listeners:

	/**
	 * The specified PropertyChangeListeners <b>propertyChange</b> method will
	 * be called each time the value of any bound property is changed. The
	 * PropertyListener object is added to a list of PropertyChangeListeners
	 * managed by the JellyBean, it can be removed with
	 * removePropertyChangeListener. Note: the JavaBeans specification does not
	 * require PropertyChangeListeners to run in any particular order.
	 * 
	 * @see #removePropertyChangeListener
	 * @param l
	 *            the PropertyChangeListener
	 */
	public void addPropertyChangeListener(PropertyChangeListener l) {
		changes.addPropertyChangeListener(l);
	}

	/**
	 * Remove this PropertyChangeListener from the JellyBeans internal list. If
	 * the PropertyChangeListener isn't on the list, silently do nothing.
	 * 
	 * @see #addPropertyChangeListener
	 * @param l
	 *            the PropertyChangeListener
	 */
	public void removePropertyChangeListener(PropertyChangeListener l) {
		changes.removePropertyChangeListener(l);
	}

	public void addColorChangeListener(PropertyChangeListener l) {
		changes.addPropertyChangeListener(l);
	}
	public void removeColorChangeListener(PropertyChangeListener l) {
		changes.removePropertyChangeListener(l);
	}

	
	
}
