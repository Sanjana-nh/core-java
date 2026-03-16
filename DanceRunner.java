class DanceRunner {
    public static void main(String[] args) {
        
        Dance dance1 = new Dance();
        dance1.eventName = "Annual Cultural Fest";
        dance1.venue = "Town Hall";
        
        Form form1 = new Form();
        form1.formName = "Bharatanatyam";
        form1.originState = "Tamil Nadu";
        form1.approximateOriginYear = 200;
        form1.traditionalProp = "Ankle Bells (Ghungroo)";
        form1.typicalNumberOfPerformers = 1;
        form1.performanceDurationMins = 45.0;
        form1.isClassical = true;
        form1.primaryCostumeColor = "Red and Gold";
        form1.accompanyingMusicInstrument = "Mridangam";
        form1.difficultyLevel = "High";
        
        dance1.form = form1;
        dance1.getDanceDetails();

        Dance dance2 = new Dance();
        dance2.eventName = "Spring Festival";
        dance2.venue = "Open Air Theatre";
        
        Form form2 = new Form();
        form2.formName = "Kathak";
        form2.originState = "Uttar Pradesh";
        form2.approximateOriginYear = 400;
        form2.traditionalProp = "Ghungroo";
        form2.typicalNumberOfPerformers = 2;
        form2.performanceDurationMins = 30.0;
        form2.isClassical = true;
        form2.primaryCostumeColor = "Yellow";
        form2.accompanyingMusicInstrument = "Tabla";
        form2.difficultyLevel = "High";
        
        dance2.form = form2;
        dance2.getDanceDetails();

        Dance dance3 = new Dance();
        dance3.eventName = "State Formation Day";
        dance3.venue = "Palace Grounds";
        
        Form form3 = new Form();
        form3.formName = "Kuchipudi";
        form3.originState = "Andhra Pradesh";
        form3.approximateOriginYear = 1500;
        form3.traditionalProp = "Brass Plate";
        form3.typicalNumberOfPerformers = 1;
        form3.performanceDurationMins = 40.0;
        form3.isClassical = true;
        form3.primaryCostumeColor = "Green and Pink";
        form3.accompanyingMusicInstrument = "Violin";
        form3.difficultyLevel = "Very High";
        
        dance3.form = form3;
        dance3.getDanceDetails();

        Dance dance4 = new Dance();
        dance4.eventName = "Heritage Night";
        dance4.venue = "Kala Mandir";
        
        Form form4 = new Form();
        form4.formName = "Odissi";
        form4.originState = "Odisha";
        form4.approximateOriginYear = 200;
        form4.traditionalProp = "Silver Jewelry";
        form4.typicalNumberOfPerformers = 3;
        form4.performanceDurationMins = 35.0;
        form4.isClassical = true;
        form4.primaryCostumeColor = "White and Red";
        form4.accompanyingMusicInstrument = "Pakhawaj";
        form4.difficultyLevel = "Medium";
        
        dance4.form = form4;
        dance4.getDanceDetails();

        Dance dance5 = new Dance();
        dance5.eventName = "Temple Utsav";
        dance5.venue = "Temple Courtyard";
        
        Form form5 = new Form();
        form5.formName = "Kathakali";
        form5.originState = "Kerala";
        form5.approximateOriginYear = 1600;
        form5.traditionalProp = "Heavy Facial Masks";
        form5.typicalNumberOfPerformers = 5;
        form5.performanceDurationMins = 60.0;
        form5.isClassical = true;
        form5.primaryCostumeColor = "Green and Red";
        form5.accompanyingMusicInstrument = "Chenda";
        form5.difficultyLevel = "High";
        
        dance5.form = form5;
        dance5.getDanceDetails();

        Dance dance6 = new Dance();
        dance6.eventName = "Harvest Celebration";
        dance6.venue = "Village Square";
        
        Form form6 = new Form();
        form6.formName = "Bhangra";
        form6.originState = "Punjab";
        form6.approximateOriginYear = 1400;
        form6.traditionalProp = "Kato (Wooden Stick)";
        form6.typicalNumberOfPerformers = 8;
        form6.performanceDurationMins = 15.0;
        form6.isClassical = false;
        form6.primaryCostumeColor = "Bright Orange";
        form6.accompanyingMusicInstrument = "Dhol";
        form6.difficultyLevel = "Medium";
        
        dance6.form = form6;
        dance6.getDanceDetails();

        Dance dance7 = new Dance();
        dance7.eventName = "Navratri Utsav";
        dance7.venue = "Community Hall";
        
        Form form7 = new Form();
        form7.formName = "Garba";
        form7.originState = "Gujarat";
        form7.approximateOriginYear = 1000;
        form7.traditionalProp = "Clay Lantern";
        form7.typicalNumberOfPerformers = 20;
        form7.performanceDurationMins = 120.0;
        form7.isClassical = false;
        form7.primaryCostumeColor = "Multi-color Chaniya Choli";
        form7.accompanyingMusicInstrument = "Dholak";
        form7.difficultyLevel = "Low";
        
        dance7.form = form7;
        dance7.getDanceDetails();

        Dance dance8 = new Dance();
        dance8.eventName = "Royal Rajputana Night";
        dance8.venue = "City Palace";
        
        Form form8 = new Form();
        form8.formName = "Ghoomar";
        form8.originState = "Rajasthan";
        form8.approximateOriginYear = 1300;
        form8.traditionalProp = "Veil";
        form8.typicalNumberOfPerformers = 10;
        form8.performanceDurationMins = 20.0;
        form8.isClassical = false;
        form8.primaryCostumeColor = "Maroon";
        form8.accompanyingMusicInstrument = "Shenai";
        form8.difficultyLevel = "Medium";
        
        dance8.form = form8;
        dance8.getDanceDetails();

        Dance dance9 = new Dance();
        dance9.eventName = "Bihu Festival";
        dance9.venue = "River Bank Stage";
        
        Form form9 = new Form();
        form9.formName = "Bihu";
        form9.originState = "Assam";
        form9.approximateOriginYear = 1100;
        form9.traditionalProp = "Japi (Bamboo Hat)";
        form9.typicalNumberOfPerformers = 12;
        form9.performanceDurationMins = 25.0;
        form9.isClassical = false;
        form9.primaryCostumeColor = "Muga Silk Brown";
        form9.accompanyingMusicInstrument = "Pepa";
        form9.difficultyLevel = "Low";
        
        dance9.form = form9;
        dance9.getDanceDetails();

        Dance dance10 = new Dance();
        dance10.eventName = "Folk Arts Meet";
        dance10.venue = "Ravindra Kalakshetra";
        
        Form form10 = new Form();
        form10.formName = "Yakshagana";
        form10.originState = "Karnataka";
        form10.approximateOriginYear = 1500;
        form10.traditionalProp = "Elaborate Headgear";
        form10.typicalNumberOfPerformers = 6;
        form10.performanceDurationMins = 180.0;
        form10.isClassical = false;
        form10.primaryCostumeColor = "Red and Yellow";
        form10.accompanyingMusicInstrument = "Chande";
        form10.difficultyLevel = "Very High";
        
        dance10.form = form10;
        dance10.getDanceDetails();

        Dance dance11 = new Dance();
        dance11.eventName = "Monsoon Mela";
        dance11.venue = "Shilparamam";
        
        Form form11 = new Form();
        form11.formName = "Lavani";
        form11.originState = "Maharashtra";
        form11.approximateOriginYear = 1700;
        form11.traditionalProp = "Nine-yard Saree";
        form11.typicalNumberOfPerformers = 4;
        form11.performanceDurationMins = 20.0;
        form11.isClassical = false;
        form11.primaryCostumeColor = "Purple";
        form11.accompanyingMusicInstrument = "Dholki";
        form11.difficultyLevel = "Medium";
        
        dance11.form = form11;
        dance11.getDanceDetails();

        Dance dance12 = new Dance();
        dance12.eventName = "Winter Solstice";
        dance12.venue = "Dal Lake Pavilion";
        
        Form form12 = new Form();
        form12.formName = "Rouf";
        form12.originState = "Jammu and Kashmir";
        form12.approximateOriginYear = 1200;
        form12.traditionalProp = "Silver Anklets";
        form12.typicalNumberOfPerformers = 15;
        form12.performanceDurationMins = 15.0;
        form12.isClassical = false;
        form12.primaryCostumeColor = "Blue and Silver";
        form12.accompanyingMusicInstrument = "No Instrument (Vocal)";
        form12.difficultyLevel = "Low";
        
        dance12.form = form12;
        dance12.getDanceDetails();

        Dance dance13 = new Dance();
        dance13.eventName = "Tribal Art Fest";
        dance13.venue = "Maidan";
        
        Form form13 = new Form();
        form13.formName = "Chhau";
        form13.originState = "West Bengal";
        form13.approximateOriginYear = 1800;
        form13.traditionalProp = "Sword and Shield";
        form13.typicalNumberOfPerformers = 10;
        form13.performanceDurationMins = 40.0;
        form13.isClassical = false;
        form13.primaryCostumeColor = "Bright Blue";
        form13.accompanyingMusicInstrument = "Dhumsa";
        form13.difficultyLevel = "High";
        
        dance13.form = form13;
        dance13.getDanceDetails();

        Dance dance14 = new Dance();
        dance14.eventName = "Desert Festival";
        dance14.venue = "Sand Dunes";
        
        Form form14 = new Form();
        form14.formName = "Kalbelia";
        form14.originState = "Rajasthan";
        form14.approximateOriginYear = 1900;
        form14.traditionalProp = "Beaded Jewelry";
        form14.typicalNumberOfPerformers = 3;
        form14.performanceDurationMins = 25.0;
        form14.isClassical = false;
        form14.primaryCostumeColor = "Black";
        form14.accompanyingMusicInstrument = "Poongi";
        form14.difficultyLevel = "Medium";
        
        dance14.form = form14;
        dance14.getDanceDetails();

        Dance dance15 = new Dance();
        dance15.eventName = "University Cultural Fest";
        dance15.venue = "Main Auditorium";
        
        Form form15 = new Form();
        form15.formName = "Manipuri";
        form15.originState = "Manipur";
        form15.approximateOriginYear = 1400;
        form15.traditionalProp = "Cylindrical Skirt (Potloi)";
        form15.typicalNumberOfPerformers = 4;
        form15.performanceDurationMins = 30.0;
        form15.isClassical = true;
        form15.primaryCostumeColor = "Green and Gold";
        form15.accompanyingMusicInstrument = "Pung";
        form15.difficultyLevel = "Medium";
        
        dance15.form = form15;
        dance15.getDanceDetails();

        Dance dance16 = new Dance();
        dance16.eventName = "Women's Day Event";
        dance16.venue = "Kerala Samajam";
        
        Form form16 = new Form();
        form16.formName = "Mohiniyattam";
        form16.originState = "Kerala";
        form16.approximateOriginYear = 1600;
        form16.traditionalProp = "Jasmine Flowers";
        form16.typicalNumberOfPerformers = 1;
        form16.performanceDurationMins = 35.0;
        form16.isClassical = true;
        form16.primaryCostumeColor = "White and Gold";
        form16.accompanyingMusicInstrument = "Edakka";
        form16.difficultyLevel = "High";
        
        dance16.form = form16;
        dance16.getDanceDetails();

        Dance dance17 = new Dance();
        dance17.eventName = "Monastery Prayer";
        dance17.venue = "Sattriya Math";
        
        Form form17 = new Form();
        form17.formName = "Sattriya";
        form17.originState = "Assam";
        form17.approximateOriginYear = 1500;
        form17.traditionalProp = "Cymbals";
        form17.typicalNumberOfPerformers = 6;
        form17.performanceDurationMins = 50.0;
        form17.isClassical = true;
        form17.primaryCostumeColor = "White";
        form17.accompanyingMusicInstrument = "Khol";
        form17.difficultyLevel = "Medium";
        
        dance17.form = form17;
        dance17.getDanceDetails();

        Dance dance18 = new Dance();
        dance18.eventName = "Dussehra Parade";
        dance18.venue = "Exhibition Grounds";
        
        Form form18 = new Form();
        form18.formName = "Dollu Kunitha";
        form18.originState = "Karnataka";
        form18.approximateOriginYear = 1700;
        form18.traditionalProp = "Large Drum";
        form18.typicalNumberOfPerformers = 12;
        form18.performanceDurationMins = 20.0;
        form18.isClassical = false;
        form18.primaryCostumeColor = "Black and Yellow";
        form18.accompanyingMusicInstrument = "Dollu";
        form18.difficultyLevel = "Medium";
        
        dance18.form = form18;
        dance18.getDanceDetails();

        Dance dance19 = new Dance();
        dance19.eventName = "Local Village Fair";
        dance19.venue = "Panchayat Ground";
        
        Form form19 = new Form();
        form19.formName = "Kamsale";
        form19.originState = "Karnataka";
        form19.approximateOriginYear = 1800;
        form19.traditionalProp = "Brass Cymbals";
        form19.typicalNumberOfPerformers = 5;
        form19.performanceDurationMins = 15.0;
        form19.isClassical = false;
        form19.primaryCostumeColor = "Orange";
        form19.accompanyingMusicInstrument = "Kamsale";
        form19.difficultyLevel = "High";
        
        dance19.form = form19;
        dance19.getDanceDetails();

        Dance dance20 = new Dance();
        dance20.eventName = "Festive Gathering";
        dance20.venue = "Society Compound";
        
        Form form20 = new Form();
        form20.formName = "Dandiya Raas";
        form20.originState = "Gujarat";
        form20.approximateOriginYear = 1200;
        form20.traditionalProp = "Wooden Sticks";
        form20.typicalNumberOfPerformers = 50;
        form20.performanceDurationMins = 180.0;
        form20.isClassical = false;
        form20.primaryCostumeColor = "Vibrant Mix";
        form20.accompanyingMusicInstrument = "Dhol";
        form20.difficultyLevel = "Low";
        
        dance20.form = form20;
        dance20.getDanceDetails();
    }
}