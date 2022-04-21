package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes jpg) {
        ImageReader image = null;
        if (jpg == null ) throw new IllegalArgumentException("Неизвестный тип картинки");
        switch (jpg) {
            case BMP:
                image = new BmpReader();
                break;
            case JPG:
                image = new JpgReader();
                break;
            case PNG:
                image = new PngReader();
                break;
            default:
                throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return image;
    }
}
