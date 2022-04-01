package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;

public class OvenCreator implements ApplianceCreator {

    @Override
    public Oven create(Criteria parsedCriteria) {
        Oven oven = new Oven();
        oven.setPowerConsumption((Integer) parsedCriteria.getCriteria().get("POWER_CONSUMPTION"));
        oven.setWeight((Integer) parsedCriteria.getCriteria().get("WEIGHT"));
        oven.setCapacity((Integer) parsedCriteria.getCriteria().get("CAPACITY"));
        oven.setDepth((Integer) parsedCriteria.getCriteria().get("DEPTH"));

        oven.setHeight(createDoubleFromObjectReferenceInstanceOfDoubleOrInteger(parsedCriteria, "HEIGHT"));

        oven.setWidth(createDoubleFromObjectReferenceInstanceOfDoubleOrInteger(parsedCriteria, "WIDTH"));

        return oven;
    }

    private double createDoubleFromObjectReferenceInstanceOfDoubleOrInteger(Criteria criteria, String keyValue) {
        if (criteria.getCriteria().get(keyValue) instanceof Integer) {
            return (double) ((Integer) criteria.getCriteria().get(keyValue));
        } else {
            return (double) (Double) criteria.getCriteria().get(keyValue);
        }
    }

}
