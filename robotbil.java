
public class robotbil {
    
	public static int MIN_DISTANCE = 20; // cm
	
	public static int readObstacleDistance() {
        return 0;
    }
	
	public static int readDistanceToLine() {
			return 0;
    }
	
	public static void steer(int distanceToLine) {
	}
	
	public static void stop() {
		
	}
	
	public static void _drive() {
		
	}
	
	public static void main(String[] args) {
		// Starta bilen
		// M�t avst�nd hinder
		int distance = readObstacleDistance();
		// Gasa om ok
		if (distance > MIN_DISTANCE) {
			_drive();
		}
		
					
		// Hela tiden: 
		while (true) {
		//     M�t avst�nd till linje
			int distanceToLine = readDistanceToLine();
		//     Styr mot linje
			steer(distanceToLine);
		//     M�t avst�nd till hinder
			distance = readObstacleDistance();
	    //     Stanna om hinder f�r n�ra
		//     Stanna om avst�ndet �r f�r litet annars k�r
			if (distance > MIN_DISTANCE) {
				_drive();
			}
			else {
				stop();
			}
		

	}

}
}