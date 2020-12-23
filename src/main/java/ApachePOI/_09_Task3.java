package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class _09_Task3 {
    // todo Carpim tablosunu excel e 1 den 5 e, 6 dan 10 a iki parca olarak yazdiriniz

    public static void main(String[] args) throws IOException {

        String path = "src/main/resources/CarpimTablosu3.xlsx";
        XSSFWorkbook workbook = new XSSFWorkbook();  // hafizada workbook olustur
        XSSFSheet sheet = workbook.createSheet("CarpimTbls");   // hafizada sheet olustur


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
                if (j==5 ){
                    break;
                }
            }
            cellCount=0;
            if (rowCount==10) rowCount++;


        }
        System.out.println(rowCount);
        // dosyayi olusturduk
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);           // icine hafizadaki bilgileri yazdirdik
        workbook.close();                       // hafizayi bosaltmak icin kapattik
        outputStream.close();                   // dosyayi kapattik


    }
}

/*
 Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        int count = 0;
        int x=0;


        for(int k = 0; k < 2; k++){
            for (int i = 1; i < 11; i++) {
                row = sheet.createRow(i - 1+11*k);
                for (int j = 1+x; j < 6+x; j++) {

                    cell = row.createCell(0 + count);
                    cell.setCellValue(j);

                    cell = row.createCell(1 + count);
                    cell.setCellValue("x");

                    cell = row.createCell(2 + count);
                    cell.setCellValue(i);

                    cell = row.createCell(3 + count);
                    cell.setCellValue("=");

                    cell = row.createCell(4 + count);
                    cell.setCellValue(j * i);

                    count += 6;
                }
                count = 0;
            }
            x=5;
        }
 */
