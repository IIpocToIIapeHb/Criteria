package by.tc.task01.dao;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
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

			criteria.add(key, object);// replace to Object
		}
		return criteria;

	}

	public boolean isInteger(String value) {
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(value);
		boolean b = m.matches();
		return b;
	}

	public boolean isDouble(String value) {
		Pattern p = Pattern.compile("\\d+\\.\\d+");
		Matcher m = p.matcher(value);
		boolean b = m.matches();
		return b;
	}

	public boolean match(Criteria criteriaFromLine, Criteria criteria) {

		for (Map.Entry<String, Object> item : criteria.getCriteria().entrySet()) {

			Object parsedItemValue = criteriaFromLine.getCriteria().get(item.getKey());

			if (item.getValue() instanceof String) {
				String str2 = (String) item.getValue();
				String str = (String) parsedItemValue;
				if (!str2.equalsIgnoreCase(str)) {
					return false;
				}
			} else {

				if (!item.getValue().equals(parsedItemValue)) {
					return false;

				}
			}
		}

		return true;
	}
}
