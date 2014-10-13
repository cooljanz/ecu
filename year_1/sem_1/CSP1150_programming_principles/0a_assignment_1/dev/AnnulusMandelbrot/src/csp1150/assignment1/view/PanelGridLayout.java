package csp1150.assignment1.view;

// the layout manager
import java.awt.GridLayout;

// inherit from JPanel
import javax.swing.JPanel;

/**
 * This class inherits from JPanel. The constructor is overloaded to accept
 * GridLayout constraints parameters which are stored in theGridLayout.
 * 
 * @author Martin Ponce ID# 10371381
 * @version 5.1.0
 * @since 20141011
 */
@SuppressWarnings("serial")
public class PanelGridLayout extends JPanel {
	
	// declare GridLayout
	protected GridLayout theGridLayout;
	
	/**
	 * Default constructor for inheritance.
	 */
	public PanelGridLayout() {
		
	}
	
	/**
	 * The panel constructor. 
	 * Used for panels that are direct children of CalculatorFrame.
	 * 
	 * @param JFrame theFrame - The parent frame.
	 * @param int rows - GridLayoutConstraints: How many rows in grid.
	 * @param int cols - GridLayoutConstraints: How many columns in grid.
	 * @param int hgap - GridLayoutConstraints: Horizontal padding, pixels.
	 * @param int vgap - GridLayoutConstraints: Vertical padding, pixels.
	 */
	public PanelGridLayout(int rows, int cols, int hgap, int vgap) {
		
		// use gridlayout, set the rows, columns and padding
		this.setLayout(this.theGridLayout = new GridLayout(rows, cols, hgap, vgap));
	}
}