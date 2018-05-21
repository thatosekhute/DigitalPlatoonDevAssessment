package com.eohdigital.eohdigital.entities;

import javax.persistence.*;
import java.util.Objects;

@javax.persistence.Entity
@Table
public class Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long entityId;
    private String entityName;
    private String emailAddress;

    public Entity() {
    }

    public long getEntityId() {
        return entityId;
    }

    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(entityId, entity.entityId) &&
                Objects.equals(entityName, entity.entityName) &&
                Objects.equals(emailAddress, entity.emailAddress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(entityId, entityName, emailAddress);
    }

    @Override
    public String toString() {
        return "Entity{" +
                "entityId=" + entityId +
                ", entityName='" + entityName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
