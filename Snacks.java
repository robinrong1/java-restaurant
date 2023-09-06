
public abstract class Snacks extends Order{
	int count;
	public Snacks(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

}
