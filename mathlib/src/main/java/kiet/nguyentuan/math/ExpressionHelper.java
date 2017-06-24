package kiet.nguyentuan.math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionHelper {
	private static HashMap<Integer,Integer> tokens;
	public static ArrayList<Elements> parseToElements(String expression){
		ArrayList<Elements> output=new ArrayList<Elements>();
		tokens=new HashMap<>();
		//Use Regular Expression
		parseReg(expression,"[0-9]*\\.?[0-9]+");
	    parseReg(expression,"\\+|\\-|\\*|\\/|\\^|\\(|\\)");
	    for(int i=0;i<expression.length();i++)
	           if(tokens.containsKey(i))
	               output.add(Elements.parseToElement(expression.substring(i,tokens.get(i))));
	    for(int i=0;i<output.size();i++)
	    	if(output.get(i)==null)
	    		output.remove(i);
		return output;
		
	}
	 private static void parseReg(String raw,String regExpression) {
	        Pattern p = Pattern.compile(regExpression);
	        Matcher m = p.matcher(raw);
	        while (m.find()) {
	            tokens.put(m.start(),m.end());
	        }
	    }
}
