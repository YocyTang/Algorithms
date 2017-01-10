public class Letcode_12{
	public String intToRoman(int num){
		String str ="";
		String[] symbol = {"M", "CM", "D","CD","C","XC", "XL","X","IX","V","IV","I"};
		int[] value={1000, 900, 500,400, 100, 90, 50, 10,9,5,4,1};
		for(int i = 0; num!=0;i++){
			while(num>=value[i]){
				num-=value;
				str+=symbol[i];
			}
		}
		return str;
	}
}