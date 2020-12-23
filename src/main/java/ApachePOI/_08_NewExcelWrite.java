package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcelWrite {
    public static void main(String[] args) throws IOException {

        String path = "src/main/resources/NewExcelFile.xlsx";
        // kitap-> sayfalar-> satır-> sutun
        // yeni workbook-> sonra sheet olustur -> sonra row -> sonra cell olustur

        XSSFWorkbook workbook = new XSSFWorkbook();  // hafizada workbook olustur
        XSSFSheet sheet = workbook.createSheet("Calisma Sayfasi");   // hafizada sheet olustur
        Row row = sheet.createRow(0);  // satir olustur
        Cell cell = row.createCell(0);      // hucre olustur

        XSSFSheet sheet1 = workbook.createSheet("Intelij");
        Row row1 = sheet1.createRow(0);
        Cell cell1 = row1.createCell(0);

        cell1.setCellValue("Yine bir proje oncesi gununden Merhaba ...");

        cell.setCellValue("Merhaba Dunya biz geldik.");  // hucreye hafizada yaz

        // dosyayi olusturduk
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);           // icine hafizadaki bilgileri yazdirdik
        workbook.close();                       // hafizayi bosaltmak icin kapattik
        outputStream.close();                   // dosyayi kapattik




    }
}
