package edu.nd.se2018.homework.hwk2.src.racetest;

import edu.nd.se2018.homework.hwk2.src.homework2.EarlySprintStrategy;
import edu.nd.se2018.homework.hwk2.src.homework2.Horse;
import edu.nd.se2018.homework.hwk2.src.homework2.SlowStartStrategy;
import edu.nd.se2018.homework.hwk2.src.homework2.SteadyRunStrategy;

public class Race {
	public Horse[] arr = new Horse[5];
	public int horseNum = 0;
	
	public void enrollHorse(String n, double s, String t) {
		if(t == "steady") {
			arr[horseNum] = new SteadyRunStrategy(n, s);
		}else if (t == "slow") {
			arr[horseNum] = new SlowStartStrategy(n, s);
		}else {
			arr[horseNum] = new EarlySprintStrategy(n, s);
		}
		
		horseNum++;
	}
	
	public Race(){
	}
	
	public void startRace() throws InterruptedException{
		while (!arr[0].finished && !arr[1].finished && !arr[2].finished && !arr[3].finished && !arr[4].finished) {
			for (int i = 0; i < 5; i++) {
				arr[i].run();
			}
			for (int i = 0; i < 5; i++) {
				arr[i].display();
			}
			if (arr[0].finished) {
				System.out.println(arr[0].name + " HAS WON!");
			}else if(arr[1].finished) {
				System.out.println(arr[1].name + " HAS WON!");
			}else if(arr[2].finished) {
				System.out.println(arr[2].name + " HAS WON!");
			}else if(arr[3].finished) {
				System.out.println(arr[3].name + " HAS WON!");
			}else if(arr[4].finished) {
				System.out.println(arr[4].name + " HAS WON!");
			}
			Thread.sleep(500);
		}
	}

}
