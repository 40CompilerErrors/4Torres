package aima.core.environment.towers;

import java.util.LinkedHashSet;
import java.util.Set;
import aima.core.search.framework.GoalTest;
import aima.core.util.datastructure.XYLocation;

public class TowersGoalTest implements GoalTest {

	public boolean isGoalState(Object state) {
		TowersBoard board = (TowersBoard) state;
		return isGoal(board);
	}
	
	private boolean isGoal(TowersBoard board) {
	
	//Como cada torre tiene un valor del 1 al 4, si los valores del centro suman 10, todas estan en el centro.
	return  (board.getValueAt(new XYLocation(3,4))+
			board.getValueAt(new XYLocation(4,3))+
			board.getValueAt(new XYLocation(3,3))+
			board.getValueAt(new XYLocation(4,4))== 10) ;
	}
}