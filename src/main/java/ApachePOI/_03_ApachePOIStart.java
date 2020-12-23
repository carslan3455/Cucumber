package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {

        String path = "src/main/resources/ApacheExcel1.xlsx";

        // Dosyayi yani Excel i okumaya actim
        FileInputStream dosyaOkumaYolu = new FileInputStream(path);

        // Bunun uzerinden Calisma Kitabini aliyorum
        Workbook calismaKitabi = WorkbookFactory.create(dosyaOkumaYolu);

        // Istedigim isimdeki calisma sayfasini aliyorum
        Sheet calismaSayfasi = calismaKitabi.getSheet("Sheet1");
        Sheet calismaSayfasiAyni = calismaKitabi.getSheetAt(0);   // index no verebiliriz

        // Istenen satiri aliyorum
        Row satir = calismaSayfasi.getRow(0);

        // Istenen satirdaki istenen hucre aliniyor
       Cell hucre = satir.getCell(0);

        System.out.println("Hucre : " + hucre );






    }
}
