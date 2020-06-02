package sa.com.me.core.model;

import lombok.Data;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Data
@MappedSuperclass
@JsonIgnoreProperties(value = { "createdBy", "lastModifiedBy", "deletedBy" }, allowGetters = false)
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy.class)
public class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp lastModifiedAt;

    @CreatedBy
    private Long createdBy;

    @LastModifiedBy
    private Long lastModifiedBy;

    private Timestamp deletedAt;

    private Long deletedBy;

}