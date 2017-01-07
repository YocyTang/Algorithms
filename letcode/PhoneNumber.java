//电话键盘可产生的字符组合
public static List<String> phoneNumber(String digits){
	if(digits == null|| digits.length == 0){
		return null;
	}
	List<String> res = new ArrayList<String>();
	Map<Character, char[]> map = new HashMap<Character, char[]>();
	map.put('2',new char[]{'a','b','c'});
	map.put('3',new char[]{'d','e','f'});
	map.put('4',new char[]{'g','h','i'});
	map.put('5',new char[]{'j','k','l'});
	map.put('6',new char[]{'m','n','o'});
	map.put('7',new char[]{'p','q','r','s'});
	map.put('8',new char[]{'t','u','v'});
	map.put('9',new char[]{'w','x','y','z'});
	help(res, new StringBuilder(), index, map, digits);
	return res;
}
private static void help(List<String> res, StringBuilder sb, int index, 
	Map<Character, char[]> map, String digits){
	if(index>= digits.length()){
		res.add(sb.toString());
		return;
	}
	char a = digits.charAt(index);
	chat[] temp = map.get(a);
	for(int  i = 0; i< temp.length; i++){
		sb.append(temp[i]);
		help(res, sb, index+1, map, digits);
		sb.deleteCharAt(sb.length()-1);
	}
}