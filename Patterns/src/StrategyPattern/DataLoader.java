package StrategyPattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DataLoader {

    protected static String csvFile;
    protected HashMap<String, String> mapOfValues = new HashMap<>();

    public DataLoader(String csv){
        csvFile = csv;
    }

    public void loadData() {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                mapOfValues.put(data[0].toUpperCase(), data[1]);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getGreeting(String value) {
        String greeting = "";
        for (Map.Entry<String, String> entry : mapOfValues.entrySet()) {
            if (entry.getKey().equals(value)) {
                greeting = entry.getValue();
            }
        }
        return greeting;
    }

    public void getValues() {
        System.out.print("[");
        mapOfValues.forEach((key, value) -> System.out.print(key + ","));
        System.out.print("]\n");
    }

    public Boolean isValidType(String key) {
        boolean isValid = false;
        for (Map.Entry<String, String> entry : mapOfValues.entrySet()) {
            if (entry.getKey().equals(key)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }
}
