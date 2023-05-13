package com.course_manager.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Entity
public class Course {

    @Id
    private long id;
    private String title;
    private String description;


}