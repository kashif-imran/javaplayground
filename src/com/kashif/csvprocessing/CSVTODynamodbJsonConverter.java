package com.kashif.csvprocessing;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.opencsv.CSVReader;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVTODynamodbJsonConverter {

    private static final String CSV_FILE_PATH
            = "D:\\Aadhaar.csv";

    public static void main(String[] args)
    {

        System.out.println("Read Data Line by Line With Header \n");
        readDataLineByLine(CSV_FILE_PATH);
        System.out.println("_______________________________________________");
    }

    public static void readDataLineByLine(String file)
    {

        try {

            // Create an object of filereader
            // class with CSV file as a parameter.
            FileReader filereader = new FileReader(file);

            // create csvReader object passing
            // file reader as a parameter
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

            Map<String, List<Map<String, Map<String, Item>>>> aadhaar = new HashMap<>();
            List<Map<String, Map<String, Item>>> aadhaarList = new ArrayList<>();

            // we are going to read data line by line
            int counter = 0;
            int fileNumber = 1;
            while ((nextRecord = csvReader.readNext()) != null) {

                Item item = new Item(nextRecord[0], nextRecord[1], nextRecord[2], nextRecord[3], nextRecord[4]);
                Map<String, Item> Item = new HashMap<>();
                Item.put("Item", item);
                Map<String, Map<String, Item>> PutRequest = new HashMap<>();
                PutRequest.put("PutRequest", Item);
                aadhaarList.add(PutRequest);
                counter ++;
                if(counter == 25) {
                    counter = 0;
                    aadhaar.put("Aadhaar", aadhaarList);
                    String filePath = "C:\\Users\\Kashif\\Downloads\\Aadhaar" + fileNumber + ".json";
                    fileNumber ++;
                    new ObjectMapper().writeValue(new FileOutputStream(filePath), aadhaar);
                    aadhaarList.clear();
                    aadhaar.clear();
                }
            }
            if(counter > 0) {
                aadhaar.put("Aadhaar", aadhaarList);
                String filePath = "C:\\Users\\Kashif\\Downloads\\Aadhaar" + fileNumber + ".json";
                new ObjectMapper().writeValue(new FileOutputStream(filePath), aadhaar);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Item {
    private Map<String, String> encCipher;
    private Map<String, String> encIv;
    private Map<String, String> identity;
    private Map<String, String> idType;
    private Map<String, String> tenantId;

    public Item(String tenantId, String identity, String encCipher, String encIv, String idType) {
        this.tenantId = getItem(tenantId);
        this.identity = getItem(identity);
        this.encCipher = getItem(encCipher);
        this.encIv = getItem(encIv);
        this.idType = getItem(idType);
    }

    @JsonIgnore
    private Map<String, String> getItem(String encCipher) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("S", encCipher);
        return map;
    }

    public Map<String, String> getEncCipher() {
        return encCipher;
    }

    public Map<String, String> getEncIv() {
        return encIv;
    }

    public Map<String, String> getIdentity() {
        return identity;
    }

    public Map<String, String> getIdType() {
        return idType;
    }

    public Map<String, String> getTenantId() {
        return tenantId;
    }
}
