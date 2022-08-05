package dev.andreamartz.demofullstackspringbootandreact.student;

import lombok.*;

// use Lombok annotations instead of writing out the boilerplate code:
@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
// note that we could replace all of the above Lombok annotations with just @Data IF the properties of Student were FINAL...
    // ...but they can't be final, because we are connecting to a database using Jpa
public class Student {
    private Long id;
    private String name;
    private String email;
    private Gender gender;
}
