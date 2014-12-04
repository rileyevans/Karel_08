/**
 * A BoxTopRacer is a Racer that can jump over hurdles of any width.
 * 
 * @author <Riley>
 * @version <dec. 2>
 *
 */
public class BoxTopRacer extends Racer {
      public BoxTopRacer(int y) {
         super (y);
      }

	public void jumpRight() {
      int j = 0;
		if(!rightIsClear()){
            move();
            j++;
     }
	
   turnRight();
   move();
   while(!rightIsClear()){
   move();
   }
   
   turnRight();
   for(int k=0; k < j; k++)
      move();
   turnLeft();
   
   }
   
}