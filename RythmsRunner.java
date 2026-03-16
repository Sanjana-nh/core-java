class RythmsRunner {
    public static void main(String[] args) {
        
        Rythms r1 = new Rythms();
        r1.branchLocation = "Kumara Park West"; r1.establishedYear = 1999;
        MusicInstrument m1 = new MusicInstrument();
        m1.instrumentId = "INS-01"; m1.instrumentName = "Grand Piano"; m1.familyType = "Keyboard"; m1.brand = "Yamaha"; m1.price = 450000.0; m1.weightKg = 250.0; m1.isAcoustic = true; m1.material = "Wood and Brass"; m1.numberOfStringsOrKeys = 88; m1.warrantyYears = 10;
        r1.musicInstrument = m1; r1.getRythmsDetails();

        Rythms r2 = new Rythms();
        r2.branchLocation = "Koramangala"; r2.establishedYear = 2005;
        MusicInstrument m2 = new MusicInstrument();
        m2.instrumentId = "INS-02"; m2.instrumentName = "Acoustic Guitar"; m2.familyType = "String"; m2.brand = "Fender"; m2.price = 15000.0; m2.weightKg = 2.5; m2.isAcoustic = true; m2.material = "Rosewood"; m2.numberOfStringsOrKeys = 6; m2.warrantyYears = 2;
        r2.musicInstrument = m2; r2.getRythmsDetails();

        Rythms r3 = new Rythms();
        r3.branchLocation = "Indiranagar"; r3.establishedYear = 2008;
        MusicInstrument m3 = new MusicInstrument();
        m3.instrumentId = "INS-03"; m3.instrumentName = "Electric Guitar"; m3.familyType = "String"; m3.brand = "Ibanez"; m3.price = 25000.0; m3.weightKg = 3.5; m3.isAcoustic = false; m3.material = "Mahogany"; m3.numberOfStringsOrKeys = 6; m3.warrantyYears = 3;
        r3.musicInstrument = m3; r3.getRythmsDetails();

        Rythms r4 = new Rythms();
        r4.branchLocation = "Jayanagar"; r4.establishedYear = 2002;
        MusicInstrument m4 = new MusicInstrument();
        m4.instrumentId = "INS-04"; m4.instrumentName = "Violin"; m4.familyType = "String"; m4.brand = "Stradivarius Replica"; m4.price = 12000.0; m4.weightKg = 0.5; m4.isAcoustic = true; m4.material = "Spruce Wood"; m4.numberOfStringsOrKeys = 4; m4.warrantyYears = 1;
        r4.musicInstrument = m4; r4.getRythmsDetails();

        Rythms r5 = new Rythms();
        r5.branchLocation = "Malleswaram"; r5.establishedYear = 2000;
        MusicInstrument m5 = new MusicInstrument();
        m5.instrumentId = "INS-05"; m5.instrumentName = "Drum Kit"; m5.familyType = "Percussion"; m5.brand = "Pearl"; m5.price = 55000.0; m5.weightKg = 30.0; m5.isAcoustic = true; m5.material = "Maple Wood and Metal"; m5.numberOfStringsOrKeys = 0; m5.warrantyYears = 5;
        r5.musicInstrument = m5; r5.getRythmsDetails();

        Rythms r6 = new Rythms();
        r6.branchLocation = "BTM Layout"; r6.establishedYear = 2010;
        MusicInstrument m6 = new MusicInstrument();
        m6.instrumentId = "INS-06"; m6.instrumentName = "Sitar"; m6.familyType = "String"; m6.brand = "Rikhi Ram"; m6.price = 35000.0; m6.weightKg = 4.0; m6.isAcoustic = true; m6.material = "Teak Wood and Gourd"; m6.numberOfStringsOrKeys = 20; m6.warrantyYears = 2;
        r6.musicInstrument = m6; r6.getRythmsDetails();

        Rythms r7 = new Rythms();
        r7.branchLocation = "Whitefield"; r7.establishedYear = 2015;
        MusicInstrument m7 = new MusicInstrument();
        m7.instrumentId = "INS-07"; m7.instrumentName = "Flute"; m7.familyType = "Woodwind"; m7.brand = "Yamaha"; m7.price = 5000.0; m7.weightKg = 0.3; m7.isAcoustic = true; m7.material = "Silver Plated"; m7.numberOfStringsOrKeys = 16; m7.warrantyYears = 1;
        r7.musicInstrument = m7; r7.getRythmsDetails();

        Rythms r8 = new Rythms();
        r8.branchLocation = "Rajajinagar"; r8.establishedYear = 2006;
        MusicInstrument m8 = new MusicInstrument();
        m8.instrumentId = "INS-08"; m8.instrumentName = "Tabla"; m8.familyType = "Percussion"; m8.brand = "Mukta Das"; m8.price = 8000.0; m8.weightKg = 8.0; m8.isAcoustic = true; m8.material = "Rosewood and Leather"; m8.numberOfStringsOrKeys = 0; m8.warrantyYears = 1;
        r8.musicInstrument = m8; r8.getRythmsDetails();

        Rythms r9 = new Rythms();
        r9.branchLocation = "HSR Layout"; r9.establishedYear = 2012;
        MusicInstrument m9 = new MusicInstrument();
        m9.instrumentId = "INS-09"; m9.instrumentName = "Saxophone"; m9.familyType = "Woodwind"; m9.brand = "Selmer"; m9.price = 85000.0; m9.weightKg = 2.8; m9.isAcoustic = true; m9.material = "Brass"; m9.numberOfStringsOrKeys = 23; m9.warrantyYears = 3;
        r9.musicInstrument = m9; r9.getRythmsDetails();

        Rythms r10 = new Rythms();
        r10.branchLocation = "Sahakar Nagar"; r10.establishedYear = 2018;
        MusicInstrument m10 = new MusicInstrument();
        m10.instrumentId = "INS-10"; m10.instrumentName = "Synthesizer"; m10.familyType = "Keyboard"; m10.brand = "Roland"; m10.price = 45000.0; m10.weightKg = 6.0; m10.isAcoustic = false; m10.material = "Plastic and Electronics"; m10.numberOfStringsOrKeys = 61; m10.warrantyYears = 2;
        r10.musicInstrument = m10; r10.getRythmsDetails();

        Rythms r11 = new Rythms();
        r11.branchLocation = "Banashankari"; r11.establishedYear = 2004;
        MusicInstrument m11 = new MusicInstrument();
        m11.instrumentId = "INS-11"; m11.instrumentName = "Cello"; m11.familyType = "String"; m11.brand = "Cremona"; m11.price = 60000.0; m11.weightKg = 5.5; m11.isAcoustic = true; m11.material = "Maple Wood"; m11.numberOfStringsOrKeys = 4; m11.warrantyYears = 5;
        r11.musicInstrument = m11; r11.getRythmsDetails();

        Rythms r12 = new Rythms();
        r12.branchLocation = "Basavanagudi"; r12.establishedYear = 2001;
        MusicInstrument m12 = new MusicInstrument();
        m12.instrumentId = "INS-12"; m12.instrumentName = "Trumpet"; m12.familyType = "Brass"; m12.brand = "Bach"; m12.price = 25000.0; m12.weightKg = 1.1; m12.isAcoustic = true; m12.material = "Yellow Brass"; m12.numberOfStringsOrKeys = 3; m12.warrantyYears = 2;
        r12.musicInstrument = m12; r12.getRythmsDetails();

        Rythms r13 = new Rythms();
        r13.branchLocation = "JP Nagar"; r13.establishedYear = 2007;
        MusicInstrument m13 = new MusicInstrument();
        m13.instrumentId = "INS-13"; m13.instrumentName = "Clarinet"; m13.familyType = "Woodwind"; m13.brand = "Buffet Crampon"; m13.price = 30000.0; m13.weightKg = 0.8; m13.isAcoustic = true; m13.material = "Grenadilla Wood"; m13.numberOfStringsOrKeys = 17; m13.warrantyYears = 2;
        r13.musicInstrument = m13; r13.getRythmsDetails();

        Rythms r14 = new Rythms();
        r14.branchLocation = "Electronic City"; r14.establishedYear = 2016;
        MusicInstrument m14 = new MusicInstrument();
        m14.instrumentId = "INS-14"; m14.instrumentName = "Harmonium"; m14.familyType = "Keyboard"; m14.brand = "Palatino"; m14.price = 15000.0; m14.weightKg = 12.0; m14.isAcoustic = true; m14.material = "Teak Wood"; m14.numberOfStringsOrKeys = 42; m14.warrantyYears = 3;
        r14.musicInstrument = m14; r14.getRythmsDetails();

        Rythms r15 = new Rythms();
        r15.branchLocation = "Bellandur"; r15.establishedYear = 2014;
        MusicInstrument m15 = new MusicInstrument();
        m15.instrumentId = "INS-15"; m15.instrumentName = "Veena"; m15.familyType = "String"; m15.brand = "Thanjavur Makers"; m15.price = 28000.0; m15.weightKg = 6.0; m15.isAcoustic = true; m15.material = "Jackfruit Wood"; m15.numberOfStringsOrKeys = 7; m15.warrantyYears = 5;
        r15.musicInstrument = m15; r15.getRythmsDetails();

        Rythms r16 = new Rythms();
        r16.branchLocation = "RR Nagar"; r16.establishedYear = 2011;
        MusicInstrument m16 = new MusicInstrument();
        m16.instrumentId = "INS-16"; m16.instrumentName = "Ukulele"; m16.familyType = "String"; m16.brand = "Kala"; m16.price = 4500.0; m16.weightKg = 0.6; m16.isAcoustic = true; m16.material = "Mahogany"; m16.numberOfStringsOrKeys = 4; m16.warrantyYears = 1;
        r16.musicInstrument = m16; r16.getRythmsDetails();

        Rythms r17 = new Rythms();
        r17.branchLocation = "Yelahanka"; r17.establishedYear = 2013;
        MusicInstrument m17 = new MusicInstrument();
        m17.instrumentId = "INS-17"; m17.instrumentName = "Banjo"; m17.familyType = "String"; m17.brand = "Deering"; m17.price = 35000.0; m17.weightKg = 4.5; m17.isAcoustic = true; m17.material = "Maple and Steel"; m17.numberOfStringsOrKeys = 5; m17.warrantyYears = 2;
        r17.musicInstrument = m17; r17.getRythmsDetails();

        Rythms r18 = new Rythms();
        r18.branchLocation = "Hebbal"; r18.establishedYear = 2017;
        MusicInstrument m18 = new MusicInstrument();
        m18.instrumentId = "INS-18"; m18.instrumentName = "Xylophone"; m18.familyType = "Percussion"; m18.brand = "Majestic"; m18.price = 18000.0; m18.weightKg = 15.0; m18.isAcoustic = true; m18.material = "Rosewood Bars"; m18.numberOfStringsOrKeys = 37; m18.warrantyYears = 1;
        r18.musicInstrument = m18; r18.getRythmsDetails();

        Rythms r19 = new Rythms();
        r19.branchLocation = "Marathahalli"; r19.establishedYear = 2009;
        MusicInstrument m19 = new MusicInstrument();
        m19.instrumentId = "INS-19"; m19.instrumentName = "Accordion"; m19.familyType = "Keyboard/Wind"; m19.brand = "Hohner"; m19.price = 75000.0; m19.weightKg = 9.0; m19.isAcoustic = true; m19.material = "Wood and Celluloid"; m19.numberOfStringsOrKeys = 34; m19.warrantyYears = 3;
        r19.musicInstrument = m19; r19.getRythmsDetails();

        Rythms r20 = new Rythms();
        r20.branchLocation = "Kalyan Nagar"; r20.establishedYear = 2019;
        MusicInstrument m20 = new MusicInstrument();
        m20.instrumentId = "INS-20"; m20.instrumentName = "Electric Bass"; m20.familyType = "String"; m20.brand = "Squier"; m20.price = 22000.0; m20.weightKg = 4.0; m20.isAcoustic = false; m20.material = "Alder Wood"; m20.numberOfStringsOrKeys = 4; m20.warrantyYears = 2;
        r20.musicInstrument = m20; r20.getRythmsDetails();
    }
}