/**
 * 
 */
package sprites;

/**
 * Representation of a sprite
 * 
 * @author siddh
 *
 */
public abstract class Sprite {

	private char symbol; // Symbol of the sprite
	private int row; // Row number
	private int column; // Column Number

	/**
	 * Creates a new <code>Sprite</code> with the given row number, column
	 * number, and symbol.
	 * 
	 * @param symbol is the symbol of a new <code>Sprite</code>
	 * @param row is the row number of a new <code>Sprite</code>
	 * @param column is the column number of a new <code>Sprite</code>
	 */
	public Sprite(char symbol, int row, int column) {
		this.symbol = symbol;
		this.row = row;
		this.column = column;
	}

	/**
	 * Return the symbol
	 * @return the symbol
	 */
	public char getSymbol() {
		return symbol;
	}

	/**
	 * Return the row
	 * @return the row
	 */
	public int getRow() {
		return row;
	}

	/**
	 * Return the column
	 * @return the column
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * Updates the coordinates for the given row and columns number of the
	 * various sprite's of this <code>Sprite</code>.
	 * 
	 * @param row the row number
	 * @param column the column number
	 */
	protected void updateCoordinates(int row, int column) {
		this.row = row;
		this.column = column;		

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + column;
		result = prime * result + row;
		result = prime * result + symbol;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sprite other = (Sprite) obj;
		if (column != other.column)
			return false;
		if (row != other.row)
			return false;
		if (symbol != other.symbol)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "" + this.getSymbol();
	}
	
	
}
