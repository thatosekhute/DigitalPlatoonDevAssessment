package com.eohdigital.eohdigital.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "CIC")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cicId;
    private String cicType;
    private String subject;
    private String body;
    private String sourceSystem;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cicTimeStamp;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "entity_fk")
    private com.eohdigital.eohdigital.entities.Entity entity;

    public Cic() {
    }

    public long getCicId() {
        return cicId;
    }

    public void setCicId(long cicId) {
        this.cicId = cicId;
    }

    public String getCicType() {
        return cicType;
    }

    public void setCicType(String cicType) {
        this.cicType = cicType;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public Date getCicTimeStamp() {
        return cicTimeStamp;
    }

    public void setCicTimeStamp(Date cicTimeStamp) {
        this.cicTimeStamp = cicTimeStamp;
    }

    public com.eohdigital.eohdigital.entities.Entity getEntity() {
        return entity;
    }

    public void setEntity(com.eohdigital.eohdigital.entities.Entity entity) {
        this.entity = entity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cic cic = (Cic) o;
        return cicId == cic.cicId &&
                Objects.equals(cicType, cic.cicType) &&
                Objects.equals(subject, cic.subject) &&
                Objects.equals(body, cic.body) &&
                Objects.equals(sourceSystem, cic.sourceSystem) &&
                Objects.equals(cicTimeStamp, cic.cicTimeStamp);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cicId, cicType, subject, body, sourceSystem, cicTimeStamp);
    }

    @Override
    public String toString() {
        return "Cic{" +
                "cicId=" + cicId +
                ", cicType='" + cicType + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", sourceSystem='" + sourceSystem + '\'' +
                ", cicTimeStamp=" + cicTimeStamp +
                ", entity=" + entity +
                '}';
    }
}
