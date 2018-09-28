package aima.core.environment.towers;

import java.util.LinkedHashSet;
import java.util.Set;

import aima.core.search.framework.GoalTest;

public class TowersGoalTest implements GoalTest {

	public boolean isGoalState(Object state) {
		TowersBoard board = (TowersBoard) state;
		return isGoal(board);
	}
	
	private boolean isGoal(TowersBoard board) {
	/// IMPLEMENTAR: FUNCIÓN QUE DEVULEVE VERDADERO SI ESTAMOS EN UN ESTADO META (SOLUCIÓN)

	}
}