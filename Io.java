// All input / output is handled through methods of this static class.
// If we ever want to change the UI, this gives us one single place to do it.

import java.util.Scanner;

public class Io {
static Scanner sc = new Scanner(System.in);
		public static void out(String str){
			System.out.println(str);
		}
		public static String in(){
			return sc.nextLine();
		}
		
		public static String a(String str){
		String r;
		if (str.matches("^[aeiou].*")){r="an "+str;}
		else{r="a "+str;}
		return r;
		}
}