package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.Criteria;

public class VacuumCleanerCreator implements ApplianceCreator {

    @Override
    public VacuumCleaner create(Criteria parsedCriteria) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.setPowerConsumption((Integer) parsedCriteria.getCriteria().get("POWER_CONSUMPTION"));
        vacuumCleaner.setFilterType((String) parsedCriteria.getCriteria().get("FILTER_TYPE"));
        vacuumCleaner.setBagType((String) parsedCriteria.getCriteria().get("BAG_TYPE"));
        vacuumCleaner.setWandType((String) parsedCriteria.getCriteria().get("WAND_TYPE"));
        vacuumCleaner.setMotoRSpeedRegulation((Integer) parsedCriteria.getCriteria().get("MOTOR_SPEED_REGULATION"));
        vacuumCleaner.setCleaningWidth((Integer) parsedCriteria.getCriteria().get("CLEANING_WIDTH"));
        return vacuumCleaner;
    }
}
