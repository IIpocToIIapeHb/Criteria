package by.tc.task01.entity;

public class Laptop extends Appliance {

	private int batteryCapacity;
	private String OS;
	private int memoryRom;
	private int systemMemory;
	private double CPU;
	private int displayInches;
	
	public Laptop() {};

	public Laptop(int batteryCapacity, String OS, int memoryRom, int systemMemory, double CPU, int displayInches) {
		super();
		this.batteryCapacity = batteryCapacity;
		this.OS = OS;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.CPU = CPU;
		this.displayInches = displayInches;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRoom) {
		this.memoryRom = memoryRoom;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getCPU() {
		return CPU;
	}

	public void setCPU(double cPU) {
		CPU = cPU;
	}

	public int getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(CPU);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((OS == null) ? 0 : OS.hashCode());
		result = prime * result + batteryCapacity;
		result = prime * result + displayInches;
		result = prime * result + memoryRom;
		result = prime * result + systemMemory;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (Double.doubleToLongBits(CPU) != Double.doubleToLongBits(other.CPU))
			return false;
		if (OS == null) {
			if (other.OS != null)
				return false;
		} else if (!OS.equals(other.OS))
			return false;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (displayInches != other.displayInches)
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		if (systemMemory != other.systemMemory)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", OS=" + OS + ", memoryRoom=" + memoryRom
				+ ", systemMemory=" + systemMemory + ", CPU=" + CPU + ", displayInches=" + displayInches + "]";
	}

}
