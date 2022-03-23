package by.tc.task01.entity;

import java.io.Serializable;

public class VacuumCleaner implements Appliance, Serializable {

	private static final long serialVersionUID = -8760851720391718350L;

	private int powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private int motoRSpeedRegulation;
	private int cleaningWidth;

	public VacuumCleaner() {
	}

	public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType,
			int motoRSpeedRegulation, int cleaningWidth) {
		super();
		this.powerConsumption = powerConsumption;
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motoRSpeedRegulation = motoRSpeedRegulation;
		this.cleaningWidth = cleaningWidth;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	public int getMotoRSpeedRegulation() {
		return motoRSpeedRegulation;
	}

	public void setMotoRSpeedRegulation(int motoRSpeedRegulation) {
		this.motoRSpeedRegulation = motoRSpeedRegulation;
	}

	public int getCleaningWidth() {
		return cleaningWidth;
	}

	public void setCleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
		result = prime * result + cleaningWidth;
		result = prime * result + ((filterType == null) ? 0 : filterType.hashCode());
		result = prime * result + motoRSpeedRegulation;
		result = prime * result + powerConsumption;
		result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		VacuumCleaner other = (VacuumCleaner) obj;
		if (bagType == null) {
			if (other.bagType != null) {
				return false;
			}
		} else if (!bagType.equals(other.bagType))
			return false;
		if (cleaningWidth != other.cleaningWidth) {
			return false;
		}
		if (filterType == null) {
			if (other.filterType != null) {
				return false;
			}
		} else if (!filterType.equals(other.filterType)) {
			return false;
		}
		if (motoRSpeedRegulation != other.motoRSpeedRegulation) {
			return false;
		}
		if (powerConsumption != other.powerConsumption) {
			return false;
		}
		if (wandType == null) {
			if (other.wandType != null) {
				return false;
			}
		} else if (!wandType.equals(other.wandType)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " :powerConsumption=" + powerConsumption + ", filterType=" + filterType
				+ ", bagType=" + bagType + ", wandType=" + wandType + ", motoRSpeedRegulation=" + motoRSpeedRegulation
				+ ", cleaningWidth=" + cleaningWidth + ".";
	}

}
