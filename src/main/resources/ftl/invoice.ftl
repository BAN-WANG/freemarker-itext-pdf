<html>
<head>
    <meta charset="UTF-8"/>
    <title>Title</title>
    <style>
        body {
            font-family: STSONG;
        }
        .pageNext{
            page-break-after: always;
        }
    </style>
</head>
<body>
    <#list invoiceList as invoice>
        发票代码：${invoice.invoiceCode}<br/>
        发票号码：${invoice.invoiceNumber}<br/>

    <img src="file:///${picPath}/timg.jpg"/>

    <span class="pageNext"></span>
    </#list>
</body>
</html>