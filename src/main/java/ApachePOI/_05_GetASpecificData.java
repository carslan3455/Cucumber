package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.Scanner;

public class _05_GetASpecificData {
    /**
     * Verilen Exceldeki password bilgisini bir metoda aracılığı bularak yazdırınız,
     * yani metoda "password" kelimesi gönderilecek, dönen değr password un kendisi olacak.
     *
     */
    public static void main(String[] args)  {


        Scanner sc = new Scanner(System.in);
        System.out.print("Aranacak data nin adini giriniz : ");
        String dataName = sc.nextLine();

        String dataValue = bul(dataName);
        System.out.println(dataValue);


    }

    static String bul(String arananDataName) {

        String dataValue = "";

        String path = "src/main/resources/LoginData.xlsx";
        Workbook workbook = null ;
        try {

            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        Sheet sheet = workbook.getSheet("Login");

        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {

            // i.satirdaki 0 inci hucrenin degeri aranan kelimeye eit mi?
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(arananDataName)) {

                int cellCount = sheet.getRow(i).getPhysicalNumberOfCells();
                for (int j = 0; j < cellCount; j++) {

                    dataValue += sheet.getRow(i).getCell(j).toString() + " ";
                }
                break;  // satirin hucreleri bittikten sonra cik
            }
        }
        return dataValue;
    }
}
/*  todo kontrol et  ufak hatasi var(benim yazdigim kod!

        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {

            Row row = sheet.getRow(i);
            int cellCount = row.getPhysicalNumberOfCells();

            for (int j = 0; j < cellCount; j++) {
                Cell cell = row.getCell(j);

                if (cell.getStringCellValue().contains(dataName)){

                    System.out.println(row.getCell((j+1)));

                }

            }
        }
 */