package exceptions;

public class ElectronicDrive {
	
	private String name;
	private int watt;
	
	public ElectronicDrive(String name, int watt) {
		this.setName(name);
		this.setWatt(watt);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWatt() {
		return watt;
	}

	public void setWatt(int watt) {
		if(watt > 0) {
			this.watt = watt;
		} else {
			throw new IllegalWattException();
		}
	}
}
