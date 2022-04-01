package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.Criteria;

public class LaptopCreator implements ApplianceCreator {

	@Override
	public Laptop create(Criteria parsedCriteria) {
		Laptop laptop = new Laptop();
		laptop.setBatteryCapacity((Integer) parsedCriteria.getCriteria().get("BATTERY_CAPACITY"));
		laptop.setOS((String) parsedCriteria.getCriteria().get("OS"));
		laptop.setMemoryRom((Integer) parsedCriteria.getCriteria().get("MEMORY_ROM=4000"));
		laptop.setSystemMemory((Integer) parsedCriteria.getCriteria().get("SYSTEM_MEMORY"));
		laptop.setCPU((Integer) parsedCriteria.getCriteria().get("CPU"));
		laptop.setDisplayInches((Integer) parsedCriteria.getCriteria().get("DISPLAY_INCHS"));
		return laptop;
	}

}
