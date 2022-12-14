package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class C04_ExcelMapLoad {
    @Test
    public void test01() {
        String path="src/test/java/resources/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";
        // dosya yolu ve sayfa ismi verilen bir excel sheet'i map olarak kaydeden
        // reusable method olusturalim
        System.out.println(ReusableMethodsExcel.mapOlustur(path, sayfaAdi));
        // olusturdugumuz map'i kullanarak Turkey'in bilgilerini yazdirin
        Map<String,String>ulkelerMap=ReusableMethodsExcel.mapOlustur(path,sayfaAdi);
        System.out.println("=========Turkiye satiri");
        System.out.println(ulkelerMap.get("Turkey"));

        // Listede Netherlands oldugunu test edin
       Assert.assertTrue(ulkelerMap.containsKey("Netherlands"));
    }
}

