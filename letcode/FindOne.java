public class FindOne{
	public static int find(int n){
		int count = 0,
			factor = 1,
			lower = 0,
			higher = 0,
			curr= 0;
		while( n / factor !=0){
			lower = n- (n/factor)*factor;
			curr = (n/10)%10;
			higher = n/(factor*10);
			switch (curr) {
				case 0:
					count+= higher*factor;
					break;
				case 1: 
					count+= higher*factor+lower+1;
					break;

				default:
					count+= (higher+1)*factor;
			}
		}
		return count;
	}
}