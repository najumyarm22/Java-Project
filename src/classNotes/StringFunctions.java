package classNotes;

import java.util.Arrays;

public class StringFunctions {

	public static void main(String[] args) {
	
			String a = "Afghanistan";
			int strSize = a.length();
			// length
//			System.out.println(strSize);
//			System.out.println(strSize + 100);
		
			//charAt
//			System.out.println(a.charAt(0));
//		    System.out.println(a.charAt(8));
		    // First char
//		    System.out.println(a.charAt(0));
		    // Last char
//		    int maxIndex = a.length() - 1;
//		    System.out.println(a.charAt(a.length() - 1)); //or
//		    System.out.println(a.charAt(maxIndex));
		    
		    //concat
		    String b = "Kabul";
//		    System.out.println(b.concat(a));
//		    System.out.println(b.concat(a).length());
//		    System.out.println(a.concat(b).charAt(9));
//		    System.out.println(a.concat("best").concat(b).concat("beautiful").length());
		    
		    // contains
//		    System.out.println(b.contains("BU"));
		    
		    // stars with 
//		    System.out.println(a.startsWith("A"));
		    
		    // endsWith
//		    System.out.println(b.endsWith("l"));
		    
		    // IsEmpty
//		    System.out.println(b.isEmpty());
		    String c = "";
//		    System.out.println(c.isEmpty());
		    
		    // IndexOff  is opposite of charAt
//		    System.out.println(a.indexOf("g"));
//		    System.out.println(a.indexOf("an"));
		    
		    //toUPPERCase
//		    System.out.println(a.toUpperCase());
//		    System.out.println(a);
//		    a = a.toUpperCase();
//		    System.out.println(a);
//		    System.out.println(a.toLowerCase());
//		    a =a.toLowerCase();
		    
		    //trim
//		    String d = "       doctor";
//		    System.out.println(d.trim());
		    String n = "      nurse        nurse        ";
//		    System.out.println(n.trim()); 
		    
		    //replace
//		    System.out.println(a.replace("a", "A"));
//		    System.out.println(n.trim().replace("        ", " "));
//		    System.out.println(b.replace(b, "Mazar"));
//		    System.out.println(b);
//		    b = b.replace(b, "Mazar");
//		    System.out.println(b);
		    
		    //equals (used for String)
//		    System.out.println("cat".equals("cat"));
//		    System.out.println(a.equals("cat"));
		    
		    //==  compares two sides (used for primitive data type)
//		    System.out.println("tom"=="tome");
//		    System.out.println("tom".length() == "fat".length());
		    
		    //subString
		    a = "I love Afghanistan.";
//		    System.out.println(a.substring(3));
//		    System.out.println(a.substring(2, 13));
		    
		    		
//		    //toCharAarray
//		    char[ ] myChar = a.toCharArray();
//		    System.out.println(myChar[7]);
//		    
//		    //sort Array
//		    Arrays.sort(myChar);
		    
		    
		    //split
//		    String acct = "223321, 68768768, 65454,546546,8789745";
//		    
//		    String[] acctArray = acct.split(",");
//		    System.out.println(acctArray[1]);
//		    System.out.println(acctArray[0]);
//		    System.out.println(acctArray[2]);
//		    
		    
		    
	}

}
