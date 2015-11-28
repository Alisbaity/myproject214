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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Log.findAll", query = "SELECT l FROM Log l"),
    @NamedQuery(name = "Log.findByLogId", query = "SELECT l FROM Log l WHERE l.logId = :logId"),
    @NamedQuery(name = "Log.findByLogAmount", query = "SELECT l FROM Log l WHERE l.logAmount = :logAmount"),
    @NamedQuery(name = "Log.findByUserId", query = "SELECT l FROM Log l WHERE l.userId = :userId"),
    @NamedQuery(name = "Log.findByMonthId", query = "SELECT l FROM Log l WHERE l.monthId = :monthId"),
    @NamedQuery(name = "Log.findByCatId", query = "SELECT l FROM Log l WHERE l.catId = :catId"),
    @NamedQuery(name = "Log.findByLogInOut", query = "SELECT l FROM Log l WHERE l.logInOut = :logInOut")})
public class Log implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "log_id")
    private Integer logId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "log_amount")
    private float logAmount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "month_id")
    private int monthId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cat_id")
    private int catId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "log_in_out")
    private boolean logInOut;

    public Log() {
    }

    public Log(Integer logId) {
        this.logId = logId;
    }

    public Log(Integer logId, float logAmount, int userId, int monthId, int catId, boolean logInOut) {
        this.logId = logId;
        this.logAmount = logAmount;
        this.userId = userId;
        this.monthId = monthId;
        this.catId = catId;
        this.logInOut = logInOut;
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public float getLogAmount() {
        return logAmount;
    }

    public void setLogAmount(float logAmount) {
        this.logAmount = logAmount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMonthId() {
        return monthId;
    }

    public void setMonthId(int monthId) {
        this.monthId = monthId;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public boolean getLogInOut() {
        return logInOut;
    }

    public void setLogInOut(boolean logInOut) {
        this.logInOut = logInOut;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logId != null ? logId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Log)) {
            return false;
        }
        Log other = (Log) object;
        if ((this.logId == null && other.logId != null) || (this.logId != null && !this.logId.equals(other.logId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dbpack.Log[ logId=" + logId + " ]";
    }
    
}
