package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_ApachePOIGetAllData {
    public static void main(String[] args) throws IOException {

        String path = "src/main/resources/ApacheExcel1.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Sheet1");

        // Calisma sayfasindaki toplam satir sayisini veriyor.
        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println("Satir sayisi : " + rowCount);

        for (int i = 0; i < rowCount; i++) {
            //  int cellCount = sheet.getRow(i).getPhysicalNumberOfCells();

            Row row = sheet.getRow(i);  // i.Satir alindi
            int cellCount = row.getPhysicalNumberOfCells();  // bu satirdaki toplam hucre sayisi alindi

            for (int j = 0; j < cellCount; j++) {  // i satirindaki hucre sayisi kadar donecek

                Cell cell = row.getCell(j);   // Bu satirdaki siradaki hucreyi aldim

                //   System.out.println(cell+" ");    // bu sekilde karisik gorunuyordu. alt satirda duzenleme yaptik
                System.out.printf("%-5s",cell);    // todo tablo gibi gostermesi icin sola dayali yaptik printf ile

            }
            System.out.println();
        }


    }
}
