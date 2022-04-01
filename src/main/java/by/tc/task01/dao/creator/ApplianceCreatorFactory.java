package by.tc.task01.dao.creator;

import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;

public class ApplianceCreatorFactory {

    public static ApplianceCreator create(String type) {
        switch (type) {
            case "Oven":
                return new OvenCreator();
            case "Laptop":
                return new LaptopCreator();
            case "Refrigerator":
                return new RefrigeratorCreator();
            case "Speakers":
                return new SpeakersCreator();
            case "TabletPC":
                return new TabletPCCreator();
            case "VacuumCleaner":
                return new VacuumCleanerCreator();
            default:
                throw new UnsupportedOperationException("Unknown type=" + type);
        }
    }
}
