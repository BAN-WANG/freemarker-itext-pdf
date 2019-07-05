package com.wsy.pdf.util;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;
import com.itextpdf.tool.xml.XMLWorkerHelper;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;


/****
 * <pre>类名: ItextPdfUtils</pre>
 * <pre>描述: ?</pre>
 * <pre>日期: 2019-06-28 17:26</pre>
 * @author wangsy
 */

public class ItextPdfUtils {

    public static void createPdf(String content, String dest) throws IOException, DocumentException {
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(dest));
        // step 3
        document.open();
        // step 4
        XMLWorkerFontProvider fontImp =
                new XMLWorkerFontProvider(XMLWorkerFontProvider.DONTLOOKFORFONTS);
        fontImp.register("font/STSONG.TTF");
        XMLWorkerHelper.getInstance()
                .parseXHtml(writer, document, new ByteArrayInputStream(content.getBytes()), null,
                        Charset.forName("UTF-8"), fontImp);
        // step 5
        document.close();

    }
}
