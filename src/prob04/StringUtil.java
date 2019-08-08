package prob04;

public class StringUtil {
	public static String a = "";
	
    public static String concatenate(String[] str) {
        //문자열을 결합하여 리턴 하는 메소드 구현
    	for(int i = 0; i < str.length; i++) {
    		a = a + str[i];
    	}	
  	
		return a;
    }
}
