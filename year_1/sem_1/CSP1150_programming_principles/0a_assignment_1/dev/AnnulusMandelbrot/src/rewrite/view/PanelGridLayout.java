package rewrite.view;

// for debugging
import java.awt.Color;

// the layout manager
import java.awt.GridLayout;

// inherit from JPanel
import javax.swing.JPanel;

/**
 * This class creates a JPanel. The constructor is overloaded to accept
 * gridlayout constraints parameters which are stored in theGridLayout.
 * 
 * @author Martin Ponce ID# 10371381
 * @version 5.0.0
 * @since 20141004
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
	 * The panel constructor, to be used for panels
	 * that are direct children of JFrame.
	 * 
	 * @param JFrame theFrame - The parent frame.
	 * @param int rows - How many rows in grid.
	 * @param int cols - How many columns in grid.
	 * @param int hgap - Horizontal padding, pixels.
	 * @param int vgap - Vertical padding, pixels.
	 */
	public PanelGridLayout(int rows, int cols, int hgap, int vgap) {
		
		// use gridlayout, set the rows, columns and padding
		this.setLayout(this.theGridLayout = new GridLayout(rows, cols, hgap, vgap));
	}
	
	/**
	 * Overloading the panel constructor, to be used for panels
	 * that are children of other JPanels.
	 * 
	 * @param thePanel
	 * @param rows
	 * @param cols
	 * @param hgap
	 * @param vgap
	 */
	public PanelGridLayout(JPanel thePanel, int rows, int cols, int hgap, int vgap) {
		
		// **DEBUGGING** give the panel a colour
		this.setBackground(Color.BLUE);
		
		// use gridlayout, set the rows, columns and padding
		this.setLayout(this.theGridLayout = new GridLayout(rows, cols, hgap, vgap));
		
	}
}