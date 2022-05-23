
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marta
 */
public class Excel {
    public static void main(String[] args) {
        //crearExcelNuevo();
        leerExcel();
    }
    
    public static void crearExcelAntiguo() {
        Workbook libro = new HSSFWorkbook();
        Sheet hoja = libro.createSheet("Hola");
        
        
        try {
            FileOutputStream archivo = new FileOutputStream("./files/Excel.xls");
            libro.write(archivo);
            archivo.close();
        }catch(Exception ex) {
            System.err.println("Error - " + ex);
        }
    }
    
    public static void crearExcelNuevo() {
        Workbook libro = new XSSFWorkbook();
        Sheet hoja = libro.createSheet("Hola");
        
        
        /*for (int i=0; i<5; i++) { // Meter valores en las celdas
            Row fila = hoja.createRow(i);
            for (int j=0; j<4; j++) {
                fila.createCell(j).setCellValue(1);
            }
        }*/
        
        
        Row fila = hoja.createRow(0);
        fila.createCell(0).setCellValue(1);
        fila.createCell(1).setCellValue(1);
        
        Cell celda = fila.createCell(3);
        celda.setCellFormula(String.format("A%o+B%o", 1, 1));
        
        try {
            FileOutputStream archivo = new FileOutputStream("./files/Excel_nuevo.xlsx");
            libro.write(archivo);
            archivo.close();
        }catch(Exception ex) {
            System.err.println("Error - " + ex);
        }
    }
    
    public static void leerExcel() {
        try {
            FileInputStream archivo = new FileInputStream(new File ("./files/leer_datos.xlsx"));
            XSSFWorkbook libro = new XSSFWorkbook(archivo);
            XSSFSheet hoja = libro.getSheetAt(0);
            
            int numFilas = hoja.getLastRowNum();
            
            for (int i=1;i<=numFilas;i++) {
                Row fila = hoja.getRow(i);
                for (int j=0; j<fila.getLastCellNum(); j++) {
                    Cell celda = fila.getCell(j);
                    
                    String tipo = celda.getCellTypeEnum().toString();
                    
                    if (tipo.equals("NUMERIC")) {
                        System.out.println(celda.getNumericCellValue() + " ");
                    }
                    else if (tipo.equals("STRING")) {
                        System.out.println(celda.getStringCellValue() + " ");
                    }
                }
                System.out.println("");
                
            }
            
        }catch(Exception ex) {
            System.err.println("Error - " + ex);
        }
    }
}
