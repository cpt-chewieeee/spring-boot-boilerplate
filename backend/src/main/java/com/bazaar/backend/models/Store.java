package com.bazaar.backend.models;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "STORES")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "name", nullable = false)
  
    private String Name;
    
    @Column(name = "user_id")
    // @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "users.id")
    private int UserId;

    @NonNull
    @Column(name = "create_date", updatable = false)
    @CreationTimestamp
    private Date CreateDate;


    @Column(name = "last_update")
    private Date LastUpdate;
}
