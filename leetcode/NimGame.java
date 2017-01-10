//取石头，只能取1-3块，最后取走的人获胜，求先手是否获胜
//如果最后只剩四块那么一定是先手输，否则都是先手胜


public boolean isWin(int n){
	if(n%4!=0){
		return true;
	}
	return false;
}