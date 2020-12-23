package Utilities;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtility {

    public static List<List<String>> getListData(String path, String sheetName, int columnCount) {

        List<List<String>> donecekList = new ArrayList<>();
        Workbook workbook = null;

        try {

            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Sheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {
            List<String> rowList = new ArrayList<>();
            Row row = sheet.getRow(i);
            int cellCount = row.getPhysicalNumberOfCells();
            if (columnCount > cellCount)
                columnCount = cellCount;  // column cellCountdan fazla ise en sonda cellCount daki verileri dondur
            for (int j = 0; j < columnCount; j++) {

                rowList.add(row.getCell(j).toString());
            }
            donecekList.add(rowList);
        }

        return donecekList;
    }

    public static void exceleYaz(Scenario scenario, String time, String browser) {

        String path = "src/main/resources/ScenarioResults.xlsx";
        String sheetName = "Sonuclar";

        File file = new File(path);
//        if (file.exists()) {   // dosya varsa demek
//
//        }

        if (!file.exists()) {  //  todo dosya hafizada kayitli degilse yapilacak islemler
            XSSFWorkbook workbook = new XSSFWorkbook();         // hafizada workbook olustur
            XSSFSheet sheet = workbook.createSheet(sheetName);  // hafizada sheet olustur

            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getId());
            cell = row.createCell(1);
            cell.setCellValue(scenario.getStatus());
            cell = row.createCell(2);
            cell.setCellValue(time);
            cell = row.createCell(3);
            cell.setCellValue(browser);

            // Dosyayi olusturduk
            FileOutputStream outputStream = null;
            try {
                outputStream = new FileOutputStream(path);
                workbook.write(outputStream);           // icine hafizadaki bilgileri yazdirdik
                workbook.close();                       // hafizayi bosaltmak icin kapattik
                outputStream.close();                   // dosyayi kapattik

            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {   // todo dosya hafizada kayitli ise yapilacak islemler
            FileInputStream inputStream = null;
            Sheet sheet = null;
            Workbook workbook = null;
            try {
                inputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(inputStream);
                sheet = workbook.getSheet(sheetName);

            } catch (IOException e) {
                e.printStackTrace();
            }
            int numberOfRows = sheet.getPhysicalNumberOfRows();
            Row row = sheet.createRow(numberOfRows);
            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getId());
            cell = row.createCell(1);
            cell.setCellValue(scenario.getStatus());
            cell = row.createCell(2);
            cell.setCellValue(time);
            cell = row.createCell(3);
            cell.setCellValue(browser);

            // Dosyayi olusturduk
            FileOutputStream outputStream = null;
            try {
                outputStream = new FileOutputStream(path);
                workbook.write(outputStream);           // icine hafizadaki bilgileri yazdirdik
                workbook.close();                       // hafizayi bosaltmak icin kapattik
                outputStream.close();                   // dosyayi kapattik

            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

    public static void main(String[] args) {

        List<List<String>> gelenList = getListData("src/main/resources/ApacheExcel1.xlsx", "testCitizen", 2);
        System.out.println(gelenList);

        gelenList = getListData("src/main/resources/ApacheExcel1.xlsx", "testCitizen", 4);
        System.out.println(gelenList);

        gelenList = getListData("src/main/resources/ApacheExcel1.xlsx", "testCitizen", 10);
        System.out.println(gelenList);

    }
}
