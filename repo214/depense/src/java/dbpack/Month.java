/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbpack;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "month")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Month.findAll", query = "SELECT m FROM Month m"),
    @NamedQuery(name = "Month.findByMonthId", query = "SELECT m FROM Month m WHERE m.monthId = :monthId"),
    @NamedQuery(name = "Month.findByMonthName", query = "SELECT m FROM Month m WHERE m.monthName = :monthName")})
public class Month implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "month_id")
    private Integer monthId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "month_name")
    private String monthName;

    public Month() {
    }

    public Month(Integer monthId) {
        this.monthId = monthId;
    }

    public Month(Integer monthId, String monthName) {
        this.monthId = monthId;
        this.monthName = monthName;
    }

    public Integer getMonthId() {
        return monthId;
    }

    public void setMonthId(Integer monthId) {
        this.monthId = monthId;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (monthId != null ? monthId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Month)) {
            return false;
        }
        Month other = (Month) object;
        if ((this.monthId == null && other.monthId != null) || (this.monthId != null && !this.monthId.equals(other.monthId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dbpack.Month[ monthId=" + monthId + " ]";
    }
    
}
