package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.criteria.Criteria;

public class TabletPCCreator implements ApplianceCreator {

	@Override
	public TabletPC create(Criteria parsedCriteria) {
		TabletPC tabletPC = new TabletPC();
		tabletPC.setBatteryCapacity((Integer) parsedCriteria.getCriteria().get("BATTERY_CAPACITY"));
		tabletPC.setDisplayInches((Integer) parsedCriteria.getCriteria().get("DISPLAY_INCHES"));
		tabletPC.setMemoryRom((Integer) parsedCriteria.getCriteria().get("MEMORY_ROM"));
		tabletPC.setFlashMemoryCapacity((Integer) parsedCriteria.getCriteria().get("FLASH_MEMORY_CAPACITY"));
		tabletPC.setColor((String) parsedCriteria.getCriteria().get("COLOR"));
		return tabletPC;
	}

}
