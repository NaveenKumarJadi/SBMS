package com.naveen.util;

import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class FileUtils {

    // file types that should NOT be compressed
    private static final String[] NON_COMPRESSIBLE = {
            "pdf", "zip", "xlsx", "xls", "docx", "pptx", "mp4", "avi"
    };

    public static boolean isCompressible(String contentType) {
        if (contentType == null) 
        	return false;

        for (String type : NON_COMPRESSIBLE) {
            if (contentType.toLowerCase().contains(type)) {
                return false;
            }
        }
        return true;
    }

    public static byte[] compress(byte[] data) {
        try {
            Deflater deflater = new Deflater(Deflater.BEST_COMPRESSION);
            deflater.setInput(data);
            deflater.finish();

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
            byte[] buffer = new byte[4 * 1024];

            while (!deflater.finished()) {
                int size = deflater.deflate(buffer);
                outputStream.write(buffer, 0, size);
            }
            return outputStream.toByteArray();

        } catch (Exception e) {
            return data; // fallback
        }
    }

    public static byte[] decompress(byte[] data) {
        try {
            Inflater inflater = new Inflater();
            inflater.setInput(data);

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
            byte[] buffer = new byte[4 * 1024];

            while (!inflater.finished()) {
                int count = inflater.inflate(buffer);
                outputStream.write(buffer, 0, count);
            }
            return outputStream.toByteArray();

        } catch (Exception e) {
            return data; // fallback
        }
    }
}
