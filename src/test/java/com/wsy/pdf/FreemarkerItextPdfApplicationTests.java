package com.wsy.pdf;

import com.wsy.pdf.dto.InvoiceDTO;
import com.wsy.pdf.util.FreemarkerUtils;
import com.wsy.pdf.util.ItextPdfUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FreemarkerItextPdfApplicationTests {

	@Test
	public void testGeneratePdfFile() throws Exception {
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

		paramMap.put("invoiceList",invoiceList);
		String classpath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		paramMap.put("picPath",classpath+ File.separator+"pic");


		String pdfString = FreemarkerUtils.parse(paramMap,"invoice.ftl");

		ItextPdfUtils.createPdf(pdfString,"D:\\invoice.pdf");
	}

}
