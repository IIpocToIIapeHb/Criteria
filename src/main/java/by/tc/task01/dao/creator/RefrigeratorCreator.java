package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.criteria.Criteria;

public class RefrigeratorCreator implements ApplianceCreator {

	@Override
	public Refrigerator create(Criteria parsedCriteria) {
		Refrigerator refrigerator = new Refrigerator();
		refrigerator.setPowerConsumption((Integer) parsedCriteria.getCriteria().get("POWER_CONSUMPTION"));
		refrigerator.setWeight((Integer) parsedCriteria.getCriteria().get("WEIGHT"));
		refrigerator.setFreezerCapacity((Integer) parsedCriteria.getCriteria().get("FREEZER_CAPACITY"));
		refrigerator.setOverallCapacity((Integer) parsedCriteria.getCriteria().get("OVERALL_CAPACITY"));
		refrigerator.setHeight((Integer) parsedCriteria.getCriteria().get("HEIGHT"));
		refrigerator.setWidth((Integer) parsedCriteria.getCriteria().get("WIDTH"));
		return refrigerator;
	}

}
