package com.wsy.pdf.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/****
 * <pre>类名: InvoiceDTO</pre>
 * <pre>描述: 发票</pre>
 * <pre>版权: </pre>
 * <pre>日期: 2019-06-28 15:50</pre>
 * @author wangsy
 */

public class InvoiceDTO implements Serializable{
    //发票日期
    private Date invoiceDate;

    //发票种类
    private String invType;

    //发票代码开具税控发票号回写
    private String invoiceCode;

    //发票号码(开具税控发票号回写)
    private String invoiceNumber;
    
    //销方名称
    private String saleName;

    //销方纳税人信用代码
    private String saleCreditCode;

    //销方地址
    private String saleAddress;

    //销方开户银行账号
    private String saleBankAccount;

    //销方电话
    private String salePhone;

    //销方开户银行
    private String saleBank;

    //购方名称
    private String custName;

    //购方纳税人信用代码
    private String custCreditCode;

    //购方地址
    private String custAddress;

    //购方电话
    private String custPhone;

    //购方银行账号
    private String custBankAccount;

    //购方开户银行
    private String custBank;

    //购方企业类型,01(企业);02(机关事业单位);03(个人);04(其它)电子发票需要
    private String creditType;

    //合计金额(不含税)
    private BigDecimal totalAmt;

    //合计税额
    private BigDecimal totalTaxamt;

    //价税合计(合计金额+合计税额)
    private BigDecimal adValoremTotal;

    //蓝票代码
    private String blueInvoiceCode;

    //蓝票号码
    private String blueInvoiceNumber;

    //开票备注
    private String remark;

    //复核人
    private String checker;

    //收款人
    private String payee;

    //开具人
    private String openPeople;

    //是否清单,0(否);1(是)
    private String isList;

    //金税盘硬件编号
    private String hardwareNo;

    //校验码
    private String checkCode;

    //已开发票明细列表
    private List<InvoiceDetailDTO> invoiceDetailList;

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvType() {
        return invType;
    }

    public void setInvType(String invType) {
        this.invType = invType;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public String getSaleCreditCode() {
        return saleCreditCode;
    }

    public void setSaleCreditCode(String saleCreditCode) {
        this.saleCreditCode = saleCreditCode;
    }

    public String getSaleAddress() {
        return saleAddress;
    }

    public void setSaleAddress(String saleAddress) {
        this.saleAddress = saleAddress;
    }

    public String getSaleBankAccount() {
        return saleBankAccount;
    }

    public void setSaleBankAccount(String saleBankAccount) {
        this.saleBankAccount = saleBankAccount;
    }

    public String getSalePhone() {
        return salePhone;
    }

    public void setSalePhone(String salePhone) {
        this.salePhone = salePhone;
    }

    public String getSaleBank() {
        return saleBank;
    }

    public void setSaleBank(String saleBank) {
        this.saleBank = saleBank;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustCreditCode() {
        return custCreditCode;
    }

    public void setCustCreditCode(String custCreditCode) {
        this.custCreditCode = custCreditCode;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustBankAccount() {
        return custBankAccount;
    }

    public void setCustBankAccount(String custBankAccount) {
        this.custBankAccount = custBankAccount;
    }

    public String getCustBank() {
        return custBank;
    }

    public void setCustBank(String custBank) {
        this.custBank = custBank;
    }

    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }

    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }

    public BigDecimal getTotalTaxamt() {
        return totalTaxamt;
    }

    public void setTotalTaxamt(BigDecimal totalTaxamt) {
        this.totalTaxamt = totalTaxamt;
    }

    public BigDecimal getAdValoremTotal() {
        return adValoremTotal;
    }

    public void setAdValoremTotal(BigDecimal adValoremTotal) {
        this.adValoremTotal = adValoremTotal;
    }

    public String getBlueInvoiceCode() {
        return blueInvoiceCode;
    }

    public void setBlueInvoiceCode(String blueInvoiceCode) {
        this.blueInvoiceCode = blueInvoiceCode;
    }

    public String getBlueInvoiceNumber() {
        return blueInvoiceNumber;
    }

    public void setBlueInvoiceNumber(String blueInvoiceNumber) {
        this.blueInvoiceNumber = blueInvoiceNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getOpenPeople() {
        return openPeople;
    }

    public void setOpenPeople(String openPeople) {
        this.openPeople = openPeople;
    }

    public String getIsList() {
        return isList;
    }

    public void setIsList(String isList) {
        this.isList = isList;
    }

    public String getHardwareNo() {
        return hardwareNo;
    }

    public void setHardwareNo(String hardwareNo) {
        this.hardwareNo = hardwareNo;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public List<InvoiceDetailDTO> getInvoiceDetailList() {
        return invoiceDetailList;
    }

    public void setInvoiceDetailList(List<InvoiceDetailDTO> invoiceDetailList) {
        this.invoiceDetailList = invoiceDetailList;
    }
}
