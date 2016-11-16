public class Letcode_14{
	public String longestPrefix(String[] strs){
		if(strs==null || strs.length==0){
			return "";
		}
		String key = strs[0];
		int end = key.length();
		int len = strs.length;
		for(int i=1; i<len; i++){
			int j = 0;
			int k= strs[i].length();
			for(;j<k&&j<end;j++){
				if(strs[i].charAt(j)!=key.charAt(j)){
					break;
				}
			}
			end=j;
		}
		return key.substring(0, end);

	}
}