import java.util.*;

 class horoscope 
 {
 
 public static void main(String[] args) 
 {
  String name ;
  String month ; 
  String zodiac ="";
int  day = 0;     
 
  
  Scanner in = new Scanner(System.in);
  System.out.println("What is your name?");
  name = in.nextLine(); // when we take input of more than one word then, we use in.nextLine()
  
  System.out.println("What date were you born?");
  System.out.println("Example: October 30");
  month = in.next();// enters the name of the month  // when we take a single word input, we use in.next() or in.nextLine()
  day = in.nextInt();// enters the date of birth
  
/*

ex:
Enter the month:
  December


code:
if(month.compare("december")==0)....    if(December.compare("december")==0) .. if(1==0)
{
  sign="....";
}


*/




/* 

types of cases:
=================
1.Uppercase - Makes all the letters in capital
2.Lowercase - Makes all the letters small
3.Sentence case - makes the first letter capital and rest small.
4.Capitalise each word - Makes the first letter of each word capital, for ex: Ram Is A Good Boy
5.toggle case- makes alternate capital and small letters, for ex: dEbAmItA


*/ 
// march == march when both same gives output 0
//may == march when different gives output -1

  
        if((month.compareToIgnoreCase("march") == 0)&&( day>=21)||(month.compareToIgnoreCase("april") == 0)&&( day<=20))
  {
   zodiac = "Aries";
   
  }
  else if((month.compareToIgnoreCase("april") == 0)&&( day>=21)||(month.compareToIgnoreCase("may") == 0)&&( day<=21))
  {
   zodiac = "Taurus";
   
  }
  else if((month.compareToIgnoreCase("may") == 0)&&( day>=22)||(month.compareToIgnoreCase("june") == 0)&&( day<=21))
  {
   zodiac = "Gemini";
  
  }
  else if((month.compareToIgnoreCase("june") == 0)&&( day>=22)||(month.compareToIgnoreCase("july") == 0)&&( day<=22))
  {
   zodiac = "Cancer";
   
  }
  else if((month.compareToIgnoreCase("july") == 0)&&( day>=23)||(month.compareToIgnoreCase("august") == 0)&&( day<=23))
  {
   zodiac = "Leo";
 
  }
  else if((month.compareToIgnoreCase("august") == 0)&&( day>=24)||(month.compareToIgnoreCase("september") == 0)&&( day<=23))
  {
   zodiac = "Virgo";
   
  }
  else if((month.compareToIgnoreCase("september") == 0)&&( day>=24)||(month.compareToIgnoreCase("october") == 0)&&( day<=23))
  {
   zodiac = "Libra";
   
  }
  else if((month.compareToIgnoreCase("october") == 0)&&( day>=24)||(month.compareToIgnoreCase("november") == 0)&&( day<=22))
  {
   zodiac = "Scorpio";
   
  }
  else if((month.compareToIgnoreCase("november") == 0)&&( day>=23)||(month.compareToIgnoreCase("december") == 0)&&( day<=21))
  {
   zodiac = "Sagittarius";
   
  }
  else if((month.compareToIgnoreCase("december") == 0)&&( day>=22)||(month.compareToIgnoreCase("january") == 0)&&( day<=20))
  {
   zodiac = "Capricorn";
    
  }
  else if((month.compareToIgnoreCase("january") == 0)&&( day>=21)||(month.compareToIgnoreCase("february") == 0)&&( day<=18))
  {
   zodiac = "Aquarius";
   
  }
  else if((month.compareToIgnoreCase("february") == 0)&&( day>=19)||(month.compareToIgnoreCase("march") == 0)&&( day<=20))
  {
   zodiac = "Pisces";
   
  }
  else
  {
   System.out.println(name+", "+month+" "+ day+" does not seem be a valid date");
   
  }
  
  
  System.out.println(name+", you are a "+ zodiac);
 }
 }
 