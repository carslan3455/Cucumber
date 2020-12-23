package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class _09_Task1 {
    // todo Carpim tablosunu excel e yazdiriniz

    public static void main(String[] args) throws IOException {

        String path = "src/main/resources/CarpimTablosu.xlsx";
        XSSFWorkbook workbook = new XSSFWorkbook();  // hafizada workbook olustur
        XSSFSheet sheet = workbook.createSheet("CarpimTbls");   // hafizada sheet olustur

       int rowCount = 0;

        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                Row row = sheet.createRow(rowCount++);  // her islem icin bir satir acar

                Cell cell = row.createCell(0);  cell.setCellValue(i);
                cell = row.createCell(1); cell.setCellValue("x");
                cell = row.createCell(2); cell.setCellValue(j);
                cell = row.createCell(3); cell.setCellValue(" = ");
                cell = row.createCell(4); cell.setCellValue(i*j);

            }

        }

        // dosyayi olusturduk
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);           // icine hafizadaki bilgileri yazdirdik
        workbook.close();                       // hafizayi bosaltmak icin kapattik
        outputStream.close();                   // dosyayi kapattik




    }
}
