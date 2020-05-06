package org.kiracookie.seau.protein_cross_search.bean;

import java.io.Serializable;

/**
 * activitydata
 *
 * @author
 */
public class Activitydata implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 全名
     */
    private String fullName;
    private String noName;
    /**
     * 指标
     */
    private String flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNoName() {
        return noName;
    }

    public void setNoName(String noName) {
        this.noName = noName;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Activitydata other = (Activitydata) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getFullName() == null ? other.getFullName() == null : this.getFullName().equals(other.getFullName()))
                && (this.getNoName() == null ? other.getNoName() == null : this.getNoName().equals(other.getNoName()))
                && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getFullName() == null) ? 0 : getFullName().hashCode());
        result = prime * result + ((getNoName() == null) ? 0 : getNoName().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", fullName=").append(fullName);
        sb.append(", noName=").append(noName);
        sb.append(", flag=").append(flag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}