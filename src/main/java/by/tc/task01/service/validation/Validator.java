package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.Map;

public class Validator {

    public static boolean criteriaValidator(Criteria criteria) {

        for (Map.Entry<String, Object> criteriaProperty : criteria.getCriteria().entrySet()) {
            String key = criteriaProperty.getKey();
            switch (key) {
                case "CAPACITY":
                case "MEMORY_ROM":
                case "BATTERY_CAPACITY":
                case "SYSTEM_MEMORY":
                case "DISPLAY_INCHES":
                case "POWER_CONSUMPTION":
                case "WEIGHT":
                case "DEPTH":
                case "FREEZER_CAPACITY":
                case "FLASH_MEMORY_CAPACITY":
                case "NUMBER_OF_SPEAKERS":
                case "CORD_LENGTH":
                    if (!(criteriaProperty.getValue() instanceof Integer)) {
                        return false;
                    }
                    break;
                case "OS":
                case "COLOR":
                case "FREQUENCY_RANGE":
                    if (!(criteriaProperty.getValue() instanceof String)) {
                        return false;
                    }
                    break;
                case "CPU":
                case "HEIGHT":
                case "WIDTH":
                case "OVERALL_CAPACITY":
                    if (!(criteriaProperty.getValue() instanceof Integer) &&
                            !(criteriaProperty.getValue() instanceof Double)) {
                        return false;
                    }
                    break;
                default:
                    throw new RuntimeException("There is no such name of criteria property: " + key);
            }

        }
        return true;
    }

    public static boolean criteriaGroupSearchNameValidator(Criteria criteria) {
        String groupSearchName = criteria.getGroupSearchName();
        switch (groupSearchName) {
            case "Oven":
            case "TabletPC":
            case "Laptop":
            case "Refrigerator":
            case "Speakers":
            case "VacuumCleaner":
                return true;
            default:
                throw new RuntimeException("There is no such name of CriteriaGroup:" + groupSearchName);
        }


    }


}

