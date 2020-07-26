class TwelveDays {
    
    String[] days = {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
    
    String[] verse = {"a Partridge in a Pear Tree.","two Turtle Doves, ",
                      "three French Hens, ","four Calling Birds, ",
                      "five Gold Rings, ","six Geese-a-Laying, ",
                      "seven Swans-a-Swimming, ","eight Maids-a-Milking, ",
                      "nine Ladies Dancing, ","ten Lords-a-Leaping, ",
                      "eleven Pipers Piping, ","twelve Drummers Drumming, "};
    
    String verse(int verseNumber) {
        
        String result = "On the "+days[verseNumber-1] + " day of Christmas my true love gave to me: ";
        for(int index = verseNumber-1; index >= 0;index--)
        {
            if(verseNumber != 1 && index == 0)
                result += "and ";
            result += verse[index];
        }
        return result+"\n";
    }

    String verses(int startVerse, int endVerse) {
       
        String result = "";
        for(int index = startVerse; index <= endVerse;index++)
        {
            result += verse(index);
            if(index < endVerse)
                result += "\n";
        }
        return result;
    }
    
    String sing() {
       String result = "";
       for(int index = 1 ; index <= 12;index++){
            result += verse(index);
            if(index < 12)
                result += "\n";
       }
       return result;
    }
}
