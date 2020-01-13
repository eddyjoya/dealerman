/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.entityOrders;

import com.dealerman.entityGeneral.Brands;
import com.dealerman.entityGeneral.Colors;
import com.dealerman.entityGeneral.Types;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author eddie
 */
@Entity
@Table(name = "vehicles")
public class Vehicles implements Serializable {

    @Id
    @Column(name = "vehicle_id", columnDefinition = "char(17)")
    private String vehicleId;
    @Column(name = "line_id", columnDefinition = "char(1)", nullable = false)
    private String lineId;
    @Column(name = "machine_id", columnDefinition = "char(2)", nullable = false)
    private String machineId;
    @JoinColumn(name = "brand_id", referencedColumnName = "brand_id")
    @ManyToOne
    @ForeignKey(name = "FK__vehicles__brand___3864608B")
    private Brands brand;
    @Column(name = "model_id", columnDefinition = "char(6)", nullable = false)
    private String modelId;
    @Column(name = "aplicacion", columnDefinition = "char(1)", nullable = false)
    private String aplicacion;
    @Column(name = "customer_id", columnDefinition = "char(13)", nullable = false)
    private String customerId;
    @JoinColumn(name = "color_id", referencedColumnName = "color_id")
    @ManyToOne
    @ForeignKey(name = "FK__vehicles__color___3587F3E0")
    private Colors color;
    @JoinColumn(name = "type_id", referencedColumnName = "type_id")
    @ManyToOne
    @ForeignKey(name = "FK__vehicles__type_i__3493CFA7")
    private Types type;

    @Column(name = "discontinued", columnDefinition = "bit", nullable = false)
    private Boolean discontinued;
    @Column(name = "added", columnDefinition = "bit", nullable = false)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = false)
    private Boolean modified;

    public Vehicles() {
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }

    public Boolean getAdded() {
        return added;
    }

    public void setAdded(Boolean added) {
        this.added = added;
    }

    public Boolean getModified() {
        return modified;
    }

    public void setModified(Boolean modified) {
        this.modified = modified;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

}
