package combination;

public class Combination_lib {
	public int getFactorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	
	private int s,r;

	public Combination_lib(int s, int r) {
		super();
		this.s = s;
		this.r = r;
	}
	

}
