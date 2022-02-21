package com.org.gen.day5HandsOn;

public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cricketer[] = {
                "DHONI WICKET_KEEPER",
                "MALINGA BOWLER",
                "KOHLI BATSMEN",
                "SACHIN BATSMEN",
                "SHAMI BOWLER",
                "ROHIT FIELDER",
                "ASHWIN FIELDER",
                "HARDIK FIELDER",
                "BUMRAH BOWLER",
                "RAHUL WICKET_KEEPER",
                "PANT BATSMEN"
        };
        int batsmen = 0, bowlers = 0, fielders = 0, wicketkeeper = 0;
        for (String player : cricketer) {
            if (player.contains("BATSMEN")) batsmen++;
            if (player.contains("WICKET_KEEPER")) wicketkeeper++;
            if (player.contains("BOWLER")) bowlers++;
            if (player.contains("FIELDER")) fielders++;
        }
        System.out.println("Total BATSMEN: " + batsmen);
        System.out.println("Total WICKET_KEEPER: " + wicketkeeper);
        System.out.println("Total BOWLER: " + bowlers);
        System.out.println("Total FIELDER: " + fielders);
	}

}
