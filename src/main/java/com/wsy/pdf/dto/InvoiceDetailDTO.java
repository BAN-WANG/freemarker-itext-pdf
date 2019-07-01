package com.wsy.pdf.dto;


import java.io.Serializable;
import java.math.BigDecimal;

/****
 * <pre>类名: InvoiceDetailDTO</pre>
 * <pre>描述: 发票中商品明细</pre>
 * <pre>版权: </pre>
 * <pre>日期: 2019-06-28 16:03</pre>
 * @author wangsy
 */

public class InvoiceDetailDTO implements Serializable {
    
    /**商品名称*/
    private String matName;

    /**不含税单价*/
    private BigDecimal price;

    /**不含税金额*/
    private BigDecimal amount;

    /**价税合计*/
    private BigDecimal adValoremTotal;

    /**税额*/
    private BigDecimal taxAmount;

    /**税率*/
    private BigDecimal taxRate;

    /**规格型号*/
    private String spec;

    /**单位*/
    private String unit;

    /**数量*/
    private BigDecimal quantity;

    /**税收编码*/
    private String revenueCode;

    /**税收名称*/
    private String revenueName;

    /**商品全称*/
    private String shortAndMatName;

    /**是否享受优惠政策,0(否);1(是)*/
    private String isPrivilege;

    /**优惠政策类型，享受税收优惠政策内容，也即优惠说明*/
    private String privilegeType;

    /**零税率标志,0(出口退税);1(免税);2(征税);3(普通零税率)*/
    private String zeroTax;

    /**差额*/
    private BigDecimal balance;


}
