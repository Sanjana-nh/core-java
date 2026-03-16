class IplRunner {
    public static void main(String[] args) {
        
        Ipl team1 = new Ipl();
        team1.teamName = "Royal Challengers Bangalore"; team1.seasonYear = 2024;
        Player p1 = new Player();
        p1.jerseyNumber = 18; p1.playerName = "Virat Kohli"; p1.role = "Batter"; p1.battingStyle = "Right-hand"; p1.bowlingStyle = "Right-arm medium"; p1.auctionPriceCr = 15.0; p1.matchesPlayed = 237; p1.totalRuns = 7263; p1.totalWickets = 4; p1.isOverseas = false;
        team1.player = p1; team1.getIplDetails();

        Ipl team2 = new Ipl();
        team2.teamName = "Royal Challengers Bangalore"; team2.seasonYear = 2024;
        Player p2 = new Player();
        p2.jerseyNumber = 32; p2.playerName = "Glenn Maxwell"; p2.role = "All-rounder"; p2.battingStyle = "Right-hand"; p2.bowlingStyle = "Right-arm off-spin"; p2.auctionPriceCr = 11.0; p2.matchesPlayed = 124; p2.totalRuns = 2719; p2.totalWickets = 31; p2.isOverseas = true;
        team2.player = p2; team2.getIplDetails();

        Ipl team3 = new Ipl();
        team3.teamName = "Royal Challengers Bangalore"; team3.seasonYear = 2024;
        Player p3 = new Player();
        p3.jerseyNumber = 13; p3.playerName = "Faf du Plessis"; p3.role = "Batter"; p3.battingStyle = "Right-hand"; p3.bowlingStyle = "Leg-break"; p3.auctionPriceCr = 7.0; p3.matchesPlayed = 130; p3.totalRuns = 4133; p3.totalWickets = 0; p3.isOverseas = true;
        team3.player = p3; team3.getIplDetails();

        Ipl team4 = new Ipl();
        team4.teamName = "Royal Challengers Bangalore"; team4.seasonYear = 2024;
        Player p4 = new Player();
        p4.jerseyNumber = 73; p4.playerName = "Mohammed Siraj"; p4.role = "Bowler"; p4.battingStyle = "Right-hand"; p4.bowlingStyle = "Right-arm fast"; p4.auctionPriceCr = 7.0; p4.matchesPlayed = 79; p4.totalRuns = 93; p4.totalWickets = 78; p4.isOverseas = false;
        team4.player = p4; team4.getIplDetails();

        Ipl team5 = new Ipl();
        team5.teamName = "Chennai Super Kings"; team5.seasonYear = 2024;
        Player p5 = new Player();
        p5.jerseyNumber = 7; p5.playerName = "MS Dhoni"; p5.role = "Wicketkeeper Batter"; p5.battingStyle = "Right-hand"; p5.bowlingStyle = "Right-arm medium"; p5.auctionPriceCr = 12.0; p5.matchesPlayed = 250; p5.totalRuns = 5082; p5.totalWickets = 0; p5.isOverseas = false;
        team5.player = p5; team5.getIplDetails();

        Ipl team6 = new Ipl();
        team6.teamName = "Chennai Super Kings"; team6.seasonYear = 2024;
        Player p6 = new Player();
        p6.jerseyNumber = 8; p6.playerName = "Ravindra Jadeja"; p6.role = "All-rounder"; p6.battingStyle = "Left-hand"; p6.bowlingStyle = "Slow left-arm orthodox"; p6.auctionPriceCr = 16.0; p6.matchesPlayed = 226; p6.totalRuns = 2677; p6.totalWickets = 152; p6.isOverseas = false;
        team6.player = p6; team6.getIplDetails();

        Ipl team7 = new Ipl();
        team7.teamName = "Mumbai Indians"; team7.seasonYear = 2024;
        Player p7 = new Player();
        p7.jerseyNumber = 45; p7.playerName = "Rohit Sharma"; p7.role = "Batter"; p7.battingStyle = "Right-hand"; p7.bowlingStyle = "Right-arm off-spin"; p7.auctionPriceCr = 16.0; p7.matchesPlayed = 243; p7.totalRuns = 6211; p7.totalWickets = 15; p7.isOverseas = false;
        team7.player = p7; team7.getIplDetails();

        Ipl team8 = new Ipl();
        team8.teamName = "Mumbai Indians"; team8.seasonYear = 2024;
        Player p8 = new Player();
        p8.jerseyNumber = 93; p8.playerName = "Jasprit Bumrah"; p8.role = "Bowler"; p8.battingStyle = "Right-hand"; p8.bowlingStyle = "Right-arm fast"; p8.auctionPriceCr = 12.0; p8.matchesPlayed = 120; p8.totalRuns = 64; p8.totalWickets = 145; p8.isOverseas = false;
        team8.player = p8; team8.getIplDetails();

        Ipl team9 = new Ipl();
        team9.teamName = "Mumbai Indians"; team9.seasonYear = 2024;
        Player p9 = new Player();
        p9.jerseyNumber = 63; p9.playerName = "Suryakumar Yadav"; p9.role = "Batter"; p9.battingStyle = "Right-hand"; p9.bowlingStyle = "Right-arm medium"; p9.auctionPriceCr = 8.0; p9.matchesPlayed = 139; p9.totalRuns = 3249; p9.totalWickets = 0; p9.isOverseas = false;
        team9.player = p9; team9.getIplDetails();

        Ipl team10 = new Ipl();
        team10.teamName = "Gujarat Titans"; team10.seasonYear = 2024;
        Player p10 = new Player();
        p10.jerseyNumber = 77; p10.playerName = "Shubman Gill"; p10.role = "Batter"; p10.battingStyle = "Right-hand"; p10.bowlingStyle = "Right-arm off-spin"; p10.auctionPriceCr = 8.0; p10.matchesPlayed = 91; p10.totalRuns = 2790; p10.totalWickets = 0; p10.isOverseas = false;
        team10.player = p10; team10.getIplDetails();

        Ipl team11 = new Ipl();
        team11.teamName = "Gujarat Titans"; team11.seasonYear = 2024;
        Player p11 = new Player();
        p11.jerseyNumber = 19; p11.playerName = "Rashid Khan"; p11.role = "Bowler"; p11.battingStyle = "Right-hand"; p11.bowlingStyle = "Leg-break googly"; p11.auctionPriceCr = 15.0; p11.matchesPlayed = 109; p11.totalRuns = 443; p11.totalWickets = 139; p11.isOverseas = true;
        team11.player = p11; team11.getIplDetails();

        Ipl team12 = new Ipl();
        team12.teamName = "Rajasthan Royals"; team12.seasonYear = 2024;
        Player p12 = new Player();
        p12.jerseyNumber = 9; p12.playerName = "Sanju Samson"; p12.role = "Wicketkeeper Batter"; p12.battingStyle = "Right-hand"; p12.bowlingStyle = "None"; p12.auctionPriceCr = 14.0; p12.matchesPlayed = 152; p12.totalRuns = 3888; p12.totalWickets = 0; p12.isOverseas = false;
        team12.player = p12; team12.getIplDetails();

        Ipl team13 = new Ipl();
        team13.teamName = "Rajasthan Royals"; team13.seasonYear = 2024;
        Player p13 = new Player();
        p13.jerseyNumber = 63; p13.playerName = "Jos Buttler"; p13.role = "Wicketkeeper Batter"; p13.battingStyle = "Right-hand"; p13.bowlingStyle = "None"; p13.auctionPriceCr = 10.0; p13.matchesPlayed = 96; p13.totalRuns = 3223; p13.totalWickets = 0; p13.isOverseas = true;
        team13.player = p13; team13.getIplDetails();

        Ipl team14 = new Ipl();
        team14.teamName = "Kolkata Knight Riders"; team14.seasonYear = 2024;
        Player p14 = new Player();
        p14.jerseyNumber = 12; p14.playerName = "Andre Russell"; p14.role = "All-rounder"; p14.battingStyle = "Right-hand"; p14.bowlingStyle = "Right-arm fast"; p14.auctionPriceCr = 12.0; p14.matchesPlayed = 112; p14.totalRuns = 2262; p14.totalWickets = 96; p14.isOverseas = true;
        team14.player = p14; team14.getIplDetails();

        Ipl team15 = new Ipl();
        team15.teamName = "Kolkata Knight Riders"; team15.seasonYear = 2024;
        Player p15 = new Player();
        p15.jerseyNumber = 74; p15.playerName = "Sunil Narine"; p15.role = "All-rounder"; p15.battingStyle = "Left-hand"; p15.bowlingStyle = "Right-arm off-spin"; p15.auctionPriceCr = 6.0; p15.matchesPlayed = 162; p15.totalRuns = 1046; p15.totalWickets = 163; p15.isOverseas = true;
        team15.player = p15; team15.getIplDetails();

        Ipl team16 = new Ipl();
        team16.teamName = "Sunrisers Hyderabad"; team16.seasonYear = 2024;
        Player p16 = new Player();
        p16.jerseyNumber = 15; p16.playerName = "Bhuvneshwar Kumar"; p16.role = "Bowler"; p16.battingStyle = "Right-hand"; p16.bowlingStyle = "Right-arm medium fast"; p16.auctionPriceCr = 4.2; p16.matchesPlayed = 160; p16.totalRuns = 286; p16.totalWickets = 170; p16.isOverseas = false;
        team16.player = p16; team16.getIplDetails();

        Ipl team17 = new Ipl();
        team17.teamName = "Lucknow Super Giants"; team17.seasonYear = 2024;
        Player p17 = new Player();
        p17.jerseyNumber = 1; p17.playerName = "KL Rahul"; p17.role = "Wicketkeeper Batter"; p17.battingStyle = "Right-hand"; p17.bowlingStyle = "Right-arm medium"; p17.auctionPriceCr = 17.0; p17.matchesPlayed = 118; p17.totalRuns = 4163; p17.totalWickets = 0; p17.isOverseas = false;
        team17.player = p17; team17.getIplDetails();

        Ipl team18 = new Ipl();
        team18.teamName = "Delhi Capitals"; team18.seasonYear = 2024;
        Player p18 = new Player();
        p18.jerseyNumber = 17; p18.playerName = "Rishabh Pant"; p18.role = "Wicketkeeper Batter"; p18.battingStyle = "Left-hand"; p18.bowlingStyle = "None"; p18.auctionPriceCr = 16.0; p18.matchesPlayed = 98; p18.totalRuns = 2838; p18.totalWickets = 0; p18.isOverseas = false;
        team18.player = p18; team18.getIplDetails();

        Ipl team19 = new Ipl();
        team19.teamName = "Punjab Kings"; team19.seasonYear = 2024;
        Player p19 = new Player();
        p19.jerseyNumber = 42; p19.playerName = "Shikhar Dhawan"; p19.role = "Batter"; p19.battingStyle = "Left-hand"; p19.bowlingStyle = "Right-arm off-spin"; p19.auctionPriceCr = 8.25; p19.matchesPlayed = 217; p19.totalRuns = 6617; p19.totalWickets = 4; p19.isOverseas = false;
        team19.player = p19; team19.getIplDetails();

        Ipl team20 = new Ipl();
        team20.teamName = "Sunrisers Hyderabad"; team20.seasonYear = 2024;
        Player p20 = new Player();
        p20.jerseyNumber = 30; p20.playerName = "Pat Cummins"; p20.role = "Bowler"; p20.battingStyle = "Right-hand"; p20.bowlingStyle = "Right-arm fast"; p20.auctionPriceCr = 20.5; p20.matchesPlayed = 42; p20.totalRuns = 359; p20.totalWickets = 45; p20.isOverseas = true;
        team20.player = p20; team20.getIplDetails();
    }
}