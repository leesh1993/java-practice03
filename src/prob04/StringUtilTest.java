package prob04;

class StringUtil {
	public static String a = null;
	
    public static String concatenate(String[] str) {
        //문자열을 결합하여 리턴 하는 메소드 구현
    	for(int i = 0; i < str.length; i++) {
    		a = a + str[i];
    	}	
  	
		return a;
    }
}

public class StringUtilTest {

	public static void main(String[] args) {
        String[] strArr = {"SuperMan", "BatMan", "SpiderMan"}; 
        String resultStr = StringUtil.concatenate( strArr );

        System.out.println( "결과 문자열 : " + resultStr ); 
	}

}
