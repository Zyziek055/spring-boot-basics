package com.zyziek055.spring_boot_basics.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;

@Getter
@Setter
@Table(name = "tags")
@Entity
public class Tag {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;
}
