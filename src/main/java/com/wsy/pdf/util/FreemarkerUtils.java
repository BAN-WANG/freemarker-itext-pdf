package com.wsy.pdf.util;


import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

/****
 * <pre>类名: FreemarkerUtils</pre>
 * <pre>描述: </pre>
 * <pre>版权: </pre>
 * <pre>日期: 2019-06-28 16:53</pre>
 * @author wangsy
 */

public class FreemarkerUtils {
    private static final Logger LOG = LoggerFactory.getLogger(FreemarkerUtils.class);


    public static String parse(Map<String,Object> paramMap, String ftlName)throws IOException,TemplateException{
        Configuration freemarkerCfg = new Configuration(Configuration.VERSION_2_3_26);
        String classpath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        LOG.info("classpath:{}",classpath);
        freemarkerCfg.setDirectoryForTemplateLoading(new File(classpath+File.separator+"ftl"));


        Writer out = new StringWriter();

        // 获取模板,并设置编码方式
        Template template = freemarkerCfg.getTemplate(ftlName);
        // 合并数据模型与模板，将合并后的数据和模板写入到流中，这里使用的字符流
        template.process(paramMap, out);
        out.flush();
        return out.toString();
    }

}
