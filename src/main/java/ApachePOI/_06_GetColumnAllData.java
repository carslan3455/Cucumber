package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _06_GetColumnAllData {
    /**
     * LoginData.xlss i kullanarak, istenilen kolondaki bilgileri
     * ekrana yazdiran  programi method kullanarak yazdiriniz
     * Method kolon numarasi alsin
     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Kolon no giriniz : ");
        int colNo = sc.nextInt();

        List<String> donenList = getColumn(colNo);
        System.out.println(donenList);

    }

    static List<String> getColumn(int colNo) {

        List<String> listCol = new ArrayList<>();

        String path = "src/main/resources/LoginData.xlsx";
        Workbook workbook = null;
        try {

            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Sheet sheet = workbook.getSheet("Login");

        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {

            Row row = sheet.getRow(i);
            int cellCount = row.getPhysicalNumberOfCells();
            // todo mesela cellCount 3 ise  colNo kucuk oldugu surece yazdirilir. buyuk olursa sorun olur

            //todo satirdaki hucre sayisi istenen kolondan buyuk ise
            if (cellCount > colNo) {
                Cell cell = row.getCell(colNo);
                listCol.add(cell.toString());
            }
            /*  2.Yöntem
            if(row.getCell(columnNo)!=null){
                Cell cell = row.getCell(columnNo);
                listCol.add(cell.toString());
            }
             */
        }
        return listCol;
    }
}
