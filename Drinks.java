
public abstract class Drinks extends Order{
	protected int volume;
	protected String size;
	public Drinks(String size) {
		this.size = size;
		container = size + "cup";
		if(size == "Large") {
			this.volume = 800;
			price = 2.69;
		}
		else if(size == "Medium") {
			this.volume = 500;
			price = 1.89;
		}
		else if(size == "Small") {
			this.volume = 300;
			price = 1.19;
		}
	}
	
}