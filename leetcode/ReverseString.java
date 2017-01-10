public String reverseStr(String s){
	if(s == null || s.length()== 0){
		return s;
	}
	int n = s.length();
	StringBuilder sb = new StringBuilder();
	for(int i = 0; i< n; i++){
		sb.append(s.charAt(n-i-1));
	}
	return sb.toString();
}