### 说明
1.根据freemarker生成String,再根据itext生成pdf。

2.支持中文:指定字体。

3.支持多页： .pageNext{page-break-after: always;}。

4.支持图片。

### 使用
1.运行FreemarkerItextPdfApplicationTests.testGeneratePdfFile方法，会在D盘生成"invoice.pdf"文件。

2.启用FreemarkerItextPdfApplication.main方法，浏览器输入http://127.0.0.1:8080/download?fileKey=xx，会下载"xx.pdf"。

### 参考
https://gitee.com/songxinqiang/BlogExampleCode
