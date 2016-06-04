
public class Q2Solution {
	public boolean isMatch(String s, String p) {
		boolean result=true;
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=p.charAt(i)){
				result=false;
				if(s.charAt(i)=='?'||p.charAt(i)=='?'){
					result=true;
				}
				if(s.charAt(i)=='*'||p.charAt(i)=='*'){
					for(int j=i;j<s.length();j++){
						if(p.charAt(i+1)==s.charAt(j)){
							result=true;
							i=j;
							
						}
						
					}
				}
				
			}
		}
		
		return result;
        
    }

}
