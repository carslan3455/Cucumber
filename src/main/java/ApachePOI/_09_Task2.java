package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class _09_Task2 {
    // todo Carpim tablosunu excel e yanyana yazdiriniz

    public static void main(String[] args) throws IOException {

        String path = "src/main/resources/CarpimTablosu2.xlsx";
        XSSFWorkbook workbook = new XSSFWorkbook();  // hafizada workbook olustur
        XSSFSheet sheet = workbook.createSheet("CarpimTbls2");   // hafizada sheet olustur


        int cellCount = 0;
        int rowCount = 0;
        for (int i = 1; i <=10 ; i++) {
            Row row = sheet.createRow(rowCount++);  // her islem icin bir satir acar
            for (int j = 1; j <=10; j++) {

                Cell cell = row.createCell(cellCount);  cell.setCellValue(j);
                cell = row.createCell(cellCount+1); cell.setCellValue("x");
                cell = row.createCell(cellCount+2); cell.setCellValue(i);
                cell = row.createCell(cellCount+3); cell.setCellValue(" = ");
                cell = row.createCell(cellCount+4); cell.setCellValue((i * j));
                cellCount+=6;

            }
            cellCount=0;
        }

        // dosyayi olusturduk
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);           // icine hafizadaki bilgileri yazdirdik
        workbook.close();                       // hafizayi bosaltmak icin kapattik
        outputStream.close();                   // dosyayi kapattik

    }
}
