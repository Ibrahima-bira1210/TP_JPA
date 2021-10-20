package com.example.tp_jpa.metier;
import com.example.tp_jpa.entities.Employe;
import jakarta.ejb.Remote;
import java.util.List;

@Remote
public interface EmployeeRemote {
    List<Employe> findAll();
}
