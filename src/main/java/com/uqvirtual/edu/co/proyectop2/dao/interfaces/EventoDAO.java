package com.uqvirtual.edu.co.proyectop2.dao.interfaces;

import com.uqvirtual.edu.co.proyectop2.Enums.CategoriaEvento;
import com.uqvirtual.edu.co.proyectop2.Enums.EstadoEvento;
import com.uqvirtual.edu.co.proyectop2.Model.Evento;
import java.time.LocalDate;
import java.util.List;

public interface EventoDAO {
    Evento findById(String id);
    List<Evento> findAll();
    List<Evento> findByFiltros(String ciudad, CategoriaEvento categoria, LocalDate fechaInicio, LocalDate fechaFin);
    void save(Evento evento);
    void update(Evento evento);
    void delete(String id);
    void cambiarEstado(String idEvento, EstadoEvento nuevoEstado);
}
