/**
 * 
 */
package game;

import java.util.ArrayList;
import java.util.List;

/**
 * @author siddh
 *
 */
public class ListGrid<T> extends Grid<T> {
	
	private List<List<T>> grid = new ArrayList<List<T>>(); // List representation of a Grid
	private int numRows;
	private int numColumns;
	
	public ListGrid(int numRows, int numColumns){
		this.numRows = numRows;
		this.numColumns = numColumns;
		
		for (int i=0; i <numRows; i++){
			grid.add(new ArrayList<T>());
			for (int j=0; j<numColumns; j++){
				grid.get(i).add(j, null);
			}
		}
	}
	
	@Override
	public T getCell(int row, int column) {
		// TODO Auto-generated method stub
		return grid.get(row).get(column);
	}

	@Override
	public void setCell(int row, int column, T item) {
		// TODO Auto-generated method stub
		grid.get(row).set(column, item);
		
	}

	@Override
	public int getNumRows() {
		// TODO Auto-generated method stub
		return numRows;
	}

	@Override
	public int getNumColumns() {
		// TODO Auto-generated method stub
		return numColumns;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((grid == null) ? 0 : grid.hashCode());
		result = prime * result + numColumns;
		result = prime * result + numRows;
		return result;
	}

}
