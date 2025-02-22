/**
 * 
 */
package sprites;

import game.Constants;

/**
 * @author siddh
 *
 */
public class DustBall extends Dirt{

	public DustBall(int row, int column, int value) {
		super(Constants.DUST_BALL, row, column, Constants.DUST_BALL_SCORE);
	}
	
	public void moveTo(int row, int column){
		this.updateCoordinates(getRow(), getColumn());
	}
}
