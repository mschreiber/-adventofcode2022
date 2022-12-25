package at.mschreiber.adventofcode;

import java.util.List;

public class Elve {

	public int x, y;
	public int proposedX, proposedY;

	public Elve(int x, int y) {
		this.x = x;
		this.y = y;
		this.proposedX = x;
		this.proposedY = y;
	}

	public void considerNextStep(int direction, List<Elve> elves) {
		if (direction == 1) {
			if (!isElveNorthSide(elves)) {
				proposedX = x;
				proposedY = y - 1;
				return;
			}
			if (!isElveSouthSide(elves)) {
				proposedX = x;
				proposedY = y + 1;
				return;
			} ;
			if (!isElveWestSide(elves)) {
				proposedX = x - 1;
				proposedY = y;
				return;
			}
			if (!isElveEastSide(elves)) {
				proposedX = x + 1;
				proposedY = y;
				return;
			}
		}
		if (direction == 2) {
			if (!isElveSouthSide(elves)) {
				proposedX = x;
				proposedY = y + 1;
				return;
			} ;
			if (!isElveWestSide(elves)) {
				proposedX = x - 1;
				proposedY = y;
				return;
			}
			if (!isElveEastSide(elves)) {
				proposedX = x + 1;
				proposedY = y;
				return;
			}
			if (!isElveNorthSide(elves)) {
				proposedX = x;
				proposedY = y - 1;
				return;
			}

		}
		if (direction == 3) {
			if (!isElveWestSide(elves)) {
				proposedX = x - 1;
				proposedY = y;
				return;
			}
			if (!isElveEastSide(elves)) {
				proposedX = x + 1;
				proposedY = y;
				return;
			}
			if (!isElveNorthSide(elves)) {
				proposedX = x;
				proposedY = y - 1;
				return;
			}
			if (!isElveSouthSide(elves)) {
				proposedX = x;
				proposedY = y + 1;
				return;
			}
		}
		if (direction == 4) {
			if (!isElveEastSide(elves)) {
				proposedX = x + 1;
				proposedY = y;
				return;
			}
			if (!isElveNorthSide(elves)) {
				proposedX = x;
				proposedY = y - 1;
				return;
			}
			if (!isElveSouthSide(elves)) {
				proposedX = x;
				proposedY = y + 1;
				return;
			}
			if (!isElveWestSide(elves)) {
				proposedX = x - 1;
				proposedY = y;
				return;
			}
		}
	}

	public boolean isElveNorthSide(List<Elve> elves) {
		for (Elve elve : elves) {
			if (elve == this) {
				continue;
			}
			if (y - 1 == elve.y && x == elve.x) {
				return true;
			}
			if (y - 1 == elve.y && x - 1 == elve.x) {
				return true;
			}
			if (y - 1 == elve.y && x + 1 == elve.x) {
				return true;
			}
		}
		return false;
	}

	public boolean isElveSouthSide(List<Elve> elves) {
		for (Elve elve : elves) {
			if (elve == this) {
				continue;
			}
			if (y + 1 == elve.y && x == elve.x) {
				return true;
			}
			if (y + 1 == elve.y && x - 1 == elve.x) {
				return true;
			}
			if (y + 1 == elve.y && x + 1 == elve.x) {
				return true;
			}
		}
		return false;
	}

	public boolean isElveWestSide(List<Elve> elves) {
		for (Elve elve : elves) {
			if (elve == this) {
				continue;
			}
			if (y == elve.y && x - 1 == elve.x) {
				return true;
			}
			if (y - 1 == elve.y && x - 1 == elve.x) {
				return true;
			}
			if (y + 1 == elve.y && x - 1 == elve.x) {
				return true;
			}
		}
		return false;
	}

	public boolean isElveEastSide(List<Elve> elves) {
		for (Elve elve : elves) {
			if (elve == this) {
				continue;
			}
			if (y == elve.y && x + 1 == elve.x) {
				return true;
			}
			if (y - 1 == elve.y && x + 1 == elve.x) {
				return true;
			}
			if (y + 1 == elve.y && x + 1 == elve.x) {
				return true;
			}
		}
		return false;
	}

	public void doMove() {
		x = proposedX;
		y = proposedY;
	}

	public void doNotMove() {
		proposedX = x;
		proposedY = y;
	}

}
