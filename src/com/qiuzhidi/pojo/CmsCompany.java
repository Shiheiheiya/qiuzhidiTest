package com.qiuzhidi.pojo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CmsCompany implements Serializable {
    private Long id;

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "公司logo")
    private String companyLogo;

    @ApiModelProperty(value = "公司地址")
    private String companyAddress;

    @ApiModelProperty(value = "公司介绍")
    private String companyIntro;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyIntro() {
        return companyIntro;
    }

    public void setCompanyIntro(String companyIntro) {
        this.companyIntro = companyIntro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyName=").append(companyName);
        sb.append(", companyLogo=").append(companyLogo);
        sb.append(", companyAddress=").append(companyAddress);
        sb.append(", companyIntro=").append(companyIntro);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}