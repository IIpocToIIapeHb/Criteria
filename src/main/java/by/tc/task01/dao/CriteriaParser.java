package by.tc.task01.dao;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import by.tc.task01.entity.criteria.Criteria;

public class CriteriaParser {

    public Criteria parseToCriteria(String line) {

        String[] mainParts = line.split(":");
        String groupSearchName = mainParts[0].trim();

        Criteria criteria = new Criteria(groupSearchName);

        String[] mainParts2 = mainParts[1].split(";");
        String[] properties = mainParts2[0].split(",");

        for (String property : properties) {

            String[] keyValue = property.split("=");
            String key = keyValue[0].trim();
            String value = keyValue[1];

            Object object = isInteger(value) ? Integer.parseInt(value)
                    : (isDouble(value) ? Double.parseDouble(value) : value);

            criteria.add(key, object);
        }
        return criteria;

    }

    public boolean isInteger(String value) {
        Pattern integerPattern = Pattern.compile("\\d+");
        Matcher integerMatcher = integerPattern.matcher(value);
        boolean result = integerMatcher.matches();
        return result;
    }

    public boolean isDouble(String value) {
        Pattern doublePattern = Pattern.compile("\\d+\\.\\d+");
        Matcher doubleMatcher = doublePattern.matcher(value);
        boolean result = doubleMatcher.matches();
        return result;
    }

}
