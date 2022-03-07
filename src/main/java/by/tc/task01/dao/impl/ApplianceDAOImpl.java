package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.tc.task01.dao.ApplianceCreator;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.CriteriaParser;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	private CriteriaParser parser = new CriteriaParser();
	private ApplianceCreator appliance = new ApplianceCreator();

	public Appliance find(Criteria criteria) {

		try {

			File file = new File("./src/main/resources/appliances_db.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String lineFromFile;

			while ((lineFromFile = br.readLine()) != null) {

				if (lineFromFile.isEmpty()) {
					continue;
				}

				Criteria criteriaFromLine = parser.parseToCriteria(lineFromFile);

				if (parser.match(criteriaFromLine, criteria)) {
					return appliance.createApplianceFromCriteria(criteriaFromLine);

				}

			}

			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
