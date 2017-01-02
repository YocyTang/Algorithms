//贪心算法--活动选择问题

//a[] 为活动数组，s[] 为活动开始时间, f[] 为对应活动结束时间,活动按结束时间升序排列
//求某一资源最大化利用的活动选择

public static List<Integer> activitySelect(int[] a, int[] s, int f[]){
	List<Integer> res = new ArrayList<Integer>();
	int n = a.length;
	int key = 0;
	for(int i = 1; i< n; i++){
		if(s[i]>=f[k]){
			res.add(a[i]);
			key = i;
		}
	}
	return res;
}