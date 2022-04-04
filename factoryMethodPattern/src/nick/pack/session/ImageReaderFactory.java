package nick.pack.session;

import nick.pack.model.BmpReader;
import nick.pack.model.JpgReader;
import nick.pack.model.PngReader;

public class ImageReaderFactory {
    public enum ImageTypes{
        BMP,
        JPG,
        PNG
    }
    public static void readImage(Object obj) throws IllegalAccessException {
        if (obj == ImageTypes.BMP){
            BmpReader reader = new BmpReader();
            System.out.println(reader);
        } else if (obj == ImageTypes.JPG){
            JpgReader reader = new JpgReader();
            System.out.println(reader);
        } else if (obj == ImageTypes.PNG){
            PngReader reader = new PngReader();
            System.out.println(reader);
        } else
            throw new IllegalAccessException("Неизвестный тип картинки");
    }
}
