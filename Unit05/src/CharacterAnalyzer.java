//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public char getChar() {
		return theChar;
	}

	public void setTheChar(char theChar) {
		this.theChar = theChar;
	}

	public CharacterAnalyzer()
	{
		theChar = '\u1000';


	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;


	}


	public boolean isLower( )
	{
		if (theChar > 96 && theChar < 123) {
			return true;
		}
			return false;
	}

	public boolean isUpper( )
	{
		if (theChar > 64 && theChar < 91) {
			return true;
		}



		return false;
	}
	
	public boolean isNumber( )
	{
		if (theChar < 48 && theChar > 57);



		return false;
	}	

	public int getASCII( )
	{
		
		
		return theChar;
	}

	public String toString()
	{




		return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
	}
}