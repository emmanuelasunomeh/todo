package com.api.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Drug {
    @Id
    private Long id;
    private String name;
    private String BrandName;
    private Date dateCreated;
    private String status;

    @Override
    public String toString() {
        return "Drug{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", BrandName='" + BrandName + '\'' +
                ", dateCreated=" + dateCreated +
                ", status='" + status + '\'' +
                '}';
    }
}
