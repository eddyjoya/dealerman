package com.dealerman.orders;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author eddie
 */
@Entity
@Table(name = "duedates")
public class Duedates implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dued_id", columnDefinition = "int")
    private Integer duedId;
    @Column(name = "sub_order", columnDefinition = "tinyint", nullable = false)
    private Integer subOrder;
    @Column(name = "days", columnDefinition = "numeric(3)", nullable = false)
    private Integer days;
    @Column(name = "deliver_by", columnDefinition = "smalldatetime", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date deliverBy;
    @Column(name = "visit_by", columnDefinition = "smalldatetime", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date visitBy;
    @Column(name = "total", columnDefinition = "money", nullable = false)
    private BigDecimal total;
    @Column(name = "abono", columnDefinition = "money", nullable = false)
    private BigDecimal abono;
    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @ForeignKey(name = "FK__duedates__order___4A8310C6")
    @JoinColumn(name = "order_id", referencedColumnName = "order_id", updatable = true)
    private Orders order;

    public Duedates() {
    }

    public Integer getDuedId() {
        return duedId;
    }

    public void setDuedId(Integer duedId) {
        this.duedId = duedId;
    }

    public Integer getSubOrder() {
        return subOrder;
    }

    public void setSubOrder(Integer subOrder) {
        this.subOrder = subOrder;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Date getDeliverBy() {
        return deliverBy;
    }

    public void setDeliverBy(Date deliverBy) {
        this.deliverBy = deliverBy;
    }

    public Date getVisitBy() {
        return visitBy;
    }

    public void setVisitBy(Date visitBy) {
        this.visitBy = visitBy;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getAbono() {
        return abono;
    }

    public void setAbono(BigDecimal abono) {
        this.abono = abono;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

}
