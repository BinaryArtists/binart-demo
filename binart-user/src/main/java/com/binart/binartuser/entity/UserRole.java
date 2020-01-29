package com.binart.binartuser.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="t_user_role")
public class UserRole implements Serializable {
    private static final long serialVersionUID = -3166012934498268403L;

    private Long userId;

    private Long roleId;
}
