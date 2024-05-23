package br.com.arthur.todolist.task;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;
/*
*
*ID
* Usuario (ID_USUARIO)
* Descricao
* Titulo
* Data de Início
* Data de Termino
* Prioridade
*
*
*/

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;



@Data
@Entity(name = "tb_tasks")
public class TaskModel {
    

@Id
@GeneratedValue(generator = "UUID")
private UUID id;
private String description;

@Column(length = 50)
private String title;
private LocalDateTime startAt;
private LocalDateTime endAt;
private String priority;

private UUID idUser;


@CreationTimestamp
private LocalDateTime createdAt;



public void setTitle(String title) throws Exception {
    if(title.length()>50){
        throw new Exception("O campo title deve conter no maximo 50 caracteres");
    }
    this.title = title;
}

}
