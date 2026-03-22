class Formula1Runner {
    public static void main(String[] args) {
        Franchise fr1 = new Franchise("Red Bull", "Christian Horner", "UK", 6, "Honda", "Max Verstappen", 2005, 135.0, true, "Oracle");
        Formula1 f1 = new Formula1("Grand Prix", 2024, fr1); f1.displayDetails();

        Franchise fr2 = new Franchise("Mercedes", "Toto Wolff", "UK", 8, "Mercedes", "Lewis Hamilton", 2010, 135.0, true, "Petronas");
        Formula1 f2 = new Formula1("Grand Prix", 2024, fr2); f2.displayDetails();

        Franchise fr3 = new Franchise("Ferrari", "Fred Vasseur", "Italy", 16, "Ferrari", "Charles Leclerc", 1950, 135.0, true, "Shell");
        Formula1 f3 = new Formula1("Grand Prix", 2024, fr3); f3.displayDetails();

        Franchise fr4 = new Franchise("McLaren", "Andrea Stella", "UK", 8, "Mercedes", "Lando Norris", 1966, 135.0, true, "OKX");
        Formula1 f4 = new Formula1("Grand Prix", 2024, fr4); f4.displayDetails();

        Franchise fr5 = new Franchise("Aston Martin", "Mike Krack", "UK", 0, "Mercedes", "Fernando Alonso", 2021, 135.0, true, "Aramco");
        Formula1 f5 = new Formula1("Grand Prix", 2024, fr5); f5.displayDetails();

        Franchise fr6 = new Franchise("Alpine", "Bruno Famin", "UK", 2, "Renault", "Pierre Gasly", 2021, 135.0, true, "BWT");
        Formula1 f6 = new Formula1("Grand Prix", 2024, fr6); f6.displayDetails();

        Franchise fr7 = new Franchise("Williams", "James Vowles", "UK", 9, "Mercedes", "Alex Albon", 1977, 135.0, true, "Komatsu");
        Formula1 f7 = new Formula1("Grand Prix", 2024, fr7); f7.displayDetails();

        Franchise fr8 = new Franchise("RB", "Laurent Mekies", "Italy", 0, "Honda", "Yuki Tsunoda", 2006, 135.0, true, "Visa");
        Formula1 f8 = new Formula1("Grand Prix", 2024, fr8); f8.displayDetails();

        Franchise fr9 = new Franchise("Sauber", "Alessandro Bravi", "Swiss", 0, "Ferrari", "Valtteri Bottas", 1993, 135.0, true, "Stake");
        Formula1 f9 = new Formula1("Grand Prix", 2024, fr9); f9.displayDetails();

        Franchise fr10 = new Franchise("Haas", "Ayao Komatsu", "USA", 0, "Ferrari", "Nico Hulkenberg", 2016, 135.0, true, "MoneyGram");
        Formula1 f10 = new Formula1("Grand Prix", 2024, fr10); f10.displayDetails();

        Franchise fr11 = new Franchise("Brawn GP", "Ross Brawn", "UK", 1, "Mercedes", "Jenson Button", 2009, 120.0, false, "Virgin");
        Formula1 f11 = new Formula1("Classic GP", 2009, fr11); f11.displayDetails();

        Franchise fr12 = new Franchise("Renault", "Flavio Briatore", "UK", 2, "Renault", "Fernando Alonso", 1977, 150.0, false, "Mild Seven");
        Formula1 f12 = new Formula1("Classic GP", 2005, fr12); f12.displayDetails();

        Franchise fr13 = new Franchise("Team Lotus", "Colin Chapman", "UK", 7, "Ford", "Mario Andretti", 1954, 20.0, false, "JPS");
        Formula1 f13 = new Formula1("Classic GP", 1978, fr13); f13.displayDetails();

        Franchise fr14 = new Franchise("Force India", "Vijay Mallya", "UK", 0, "Mercedes", "Sergio Perez", 2008, 110.0, false, "Sahara");
        Formula1 f14 = new Formula1("Classic GP", 2017, fr14); f14.displayDetails();

        Franchise fr15 = new Franchise("Benetton", "Flavio Briatore", "UK", 1, "Renault", "M. Schumacher", 1986, 80.0, false, "Mild Seven");
        Formula1 f15 = new Formula1("Classic GP", 1995, fr15); f15.displayDetails();

        Franchise fr16 = new Franchise("Jordan", "Eddie Jordan", "UK", 0, "Honda", "H. Frentzen", 1991, 65.0, false, "B&H");
        Formula1 f16 = new Formula1("Classic GP", 1999, fr16); f16.displayDetails();

        Franchise fr17 = new Franchise("Tyrrell", "Ken Tyrrell", "UK", 1, "Ford", "Jackie Stewart", 1958, 5.0, false, "Elf");
        Formula1 f17 = new Formula1("Classic GP", 1971, fr17); f17.displayDetails();

        Franchise fr18 = new Franchise("Minardi", "Paul Stoddart", "Italy", 0, "Cosworth", "C. Albers", 1979, 40.0, false, "Ozjet");
        Formula1 f18 = new Formula1("Classic GP", 2005, fr18); f18.displayDetails();

        Franchise fr19 = new Franchise("Brabham", "Bernie Ecclestone", "UK", 2, "BMW", "Nelson Piquet", 1960, 15.0, false, "Parmalat");
        Formula1 f19 = new Formula1("Classic GP", 1983, fr19); f19.displayDetails();

        Franchise fr20 = new Franchise("Racing Point", "Otmar Szafnauer", "UK", 0, "Mercedes", "Sergio Perez", 2018, 125.0, false, "BWT");
        Formula1 f20 = new Formula1("Classic GP", 2020, fr20); f20.displayDetails();
    }
}