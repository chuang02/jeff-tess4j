
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;


public class Demo {
    public static void main(String[] args){

        try {
            File imageFile = new File("C:\\Users\\JHou20\\IdeaProjects\\tess4j\\test\\resources\\test-data\\reading2.jpg");//图片位置
            ITesseract instance = new Tesseract();
            instance.setDatapath("C:\\Users\\JHou20\\IdeaProjects\\tess4j\\tessdata");
            instance.setLanguage("eng");//选择字库文件（只需要文件名，不需要后缀名）
            String result = instance.doOCR(imageFile);//开始识别
            System.out.println(result);//打印图片内容
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }
}