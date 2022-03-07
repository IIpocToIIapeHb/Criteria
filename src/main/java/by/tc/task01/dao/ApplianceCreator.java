package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceCreator {
	public Appliance createApplianceFromCriteria(Criteria parsedCriteria) {
		
		switch (parsedCriteria.getGroupSearchName()) {
		case "Oven":
			Oven oven = new Oven();
			oven.setPowerConsumption((int) parsedCriteria.getCriteria().get("POWER_CONSUMPTION"));
			oven.setWeight((int) parsedCriteria.getCriteria().get("WEIGHT"));
			oven.setCapacity((int) parsedCriteria.getCriteria().get("CAPACITY"));
			oven.setDepth((int) parsedCriteria.getCriteria().get("DEPTH"));
			oven.setHeight((double) parsedCriteria.getCriteria().get("HEIGHT"));
			oven.setWidth((double) parsedCriteria.getCriteria().get("WIDTH"));
			return oven;
		case "Laptop":
			Laptop laptop = new Laptop();
			laptop.setBatteryCapacity((int) parsedCriteria.getCriteria().get("BATTERY_CAPACITY"));
			laptop.setOS((String) parsedCriteria.getCriteria().get("OS"));
			laptop.setMemoryRom((int) parsedCriteria.getCriteria().get("MEMORY_ROM=4000"));
			laptop.setSystemMemory((int) parsedCriteria.getCriteria().get("SYSTEM_MEMORY"));
			laptop.setCPU((int) parsedCriteria.getCriteria().get("CPU"));
			laptop.setDisplayInches((int) parsedCriteria.getCriteria().get("DISPLAY_INCHS"));
			return laptop;
		case "Refrigerator":
			Refrigerator refrigerator = new Refrigerator();
			refrigerator.setPowerConsumption((int) parsedCriteria.getCriteria().get("POWER_CONSUMPTION"));
			refrigerator.setWeight((int) parsedCriteria.getCriteria().get("WEIGHT"));
			refrigerator.setFreezerCapacity((int) parsedCriteria.getCriteria().get("FREEZER_CAPACITY"));
			refrigerator.setOverallCapacity((int) parsedCriteria.getCriteria().get("OVERALL_CAPACITY"));
			refrigerator.setHeight((int) parsedCriteria.getCriteria().get("HEIGHT"));
			refrigerator.setWidth((int) parsedCriteria.getCriteria().get("WIDTH"));
			return refrigerator;
		case "Speakers":
			Speakers speakers = new Speakers();
			speakers.setPowerConsumption((int) parsedCriteria.getCriteria().get("POWER_CONSUMPTION"));
			speakers.setNumberOfSpeakers((int) parsedCriteria.getCriteria().get("NUMBER_OF_SPEAKERS"));
			speakers.setFrequencyRange((String) parsedCriteria.getCriteria().get("FREQUENCY_RANGE"));
			speakers.setCordLength((int) parsedCriteria.getCriteria().get("CORD_LENGTH"));
			return speakers;
		case "TabletPC":
			TabletPC tabletPC = new TabletPC();
			tabletPC.setBatteryCapacity((int) parsedCriteria.getCriteria().get("BATTERY_CAPACITY"));
			tabletPC.setDisplayInches((int) parsedCriteria.getCriteria().get("DISPLAY_INCHES"));
			tabletPC.setMemoryRom((int) parsedCriteria.getCriteria().get("MEMORY_ROM"));
			tabletPC.setFlashMemoryCapacity((int) parsedCriteria.getCriteria().get("FLASH_MEMORY_CAPACITY"));
			tabletPC.setColor((String) parsedCriteria.getCriteria().get("COLOR"));
			return tabletPC;
		}
		return null;
	}

}
