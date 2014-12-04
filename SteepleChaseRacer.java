/**
 * A SteepleChaseRacer is a Racer that can jump over hurdles of any height.
 * 
 * @author <Riley>
 * @version <Dec. 2>
 *
 */
public class SteepleChaseRacer extends Racer {
	
   public SteepleChaseRacer(int y) {
      super(y);
   }   

	@Override
	public void jumpRight() {
		turnLeft();
      while(!rightIsClear()) {
         move();
      }
      turnRight();
      move();
      turnRight();
      move();
      while(frontIsClear()) {
         move();
      }
      turnLeft();
	}

}
