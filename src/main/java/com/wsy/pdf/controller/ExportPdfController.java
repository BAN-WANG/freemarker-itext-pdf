package com.wsy.pdf.controller;

import com.itextpdf.text.DocumentException;

import com.wsy.pdf.dto.InvoiceDTO;
import com.wsy.pdf.util.FreemarkerUtils;
import com.wsy.pdf.util.ItextPdfUtils;
import freemarker.template.TemplateException;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/****
 * <pre>类名: ExportPdfController</pre>
 * <pre>描述: 发票pdf</pre>
 * <pre>日期: 2019-07-26 15:41</pre>
 * @author wangsy
 */
@RestController
@RequestMapping
public class ExportPdfController {

    @RequestMapping(method = RequestMethod.GET,value = "download")
    public void download(@RequestParam String fileKey, HttpServletResponse response) throws Exception{
        String fileName = fileKey+".pdf";

        generatePdf(fileName);

        File file = new File(fileName);

        //设置文件名，以及中文名解决
        response.setHeader("Content-Disposition", "attachment; filename="+java.net.URLEncoder.encode(fileName, "UTF-8"));

        //
        OutputStream os = response.getOutputStream();
        FileUtils.copyFile(file,os);

        file.delete();
    }

    private void generatePdf(String fileName) throws IOException, TemplateException, DocumentException {
        Map<String,Object> paramMap = new HashMap();
        InvoiceDTO invoice1 = new InvoiceDTO();
        invoice1.setInvoiceCode("1234567890");
        invoice1.setInvoiceNumber("10000001");

        InvoiceDTO invoice2 = new InvoiceDTO();
        invoice2.setInvoiceCode("1234567890");
        invoice2.setInvoiceNumber("10000002");

        List<InvoiceDTO> invoiceList = new ArrayList();
        invoiceList.add(invoice1);
        invoiceList.add(invoice2);

        String classpath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        paramMap.put("invoiceList",invoiceList);
        paramMap.put("picPath",classpath+ File.separator+"pic");

        String pdfString = FreemarkerUtils.parse(paramMap,"invoice.ftl");

        ItextPdfUtils.createPdf(pdfString,fileName);
    }
}
