package beans;

public class FichasPersonales {
    
    private int id_registro;
    private int id_usuario;
    private int id_libro;
    private int meta_paginas;
    private int progreso_paginas;
    private int meta_semanas;
    private int semana_actual;
    private String reseña;
    private double calificacion;

    public FichasPersonales(int id_registro, int id_usuario, int id_libro, int meta_paginas, int progreso_paginas, int meta_semanas, int semana_actual, String reseña, double calificacion) {
        this.id_registro = id_registro;
        this.id_usuario = id_usuario;
        this.id_libro = id_libro;
        this.meta_paginas = meta_paginas;
        this.progreso_paginas = progreso_paginas;
        this.meta_semanas = meta_semanas;
        this.semana_actual = semana_actual;
        this.reseña = reseña;
        this.calificacion = calificacion;
    }

    public int getId_registro() {
        return id_registro;
    }

    public void setId_registro(int id_registro) {
        this.id_registro = id_registro;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public int getMeta_paginas() {
        return meta_paginas;
    }

    public void setMeta_paginas(int meta_paginas) {
        this.meta_paginas = meta_paginas;
    }

    public int getProgreso_paginas() {
        return progreso_paginas;
    }

    public void setProgreso_paginas(int progreso_paginas) {
        this.progreso_paginas = progreso_paginas;
    }

    public int getMeta_semanas() {
        return meta_semanas;
    }

    public void setMeta_semanas(int meta_semanas) {
        this.meta_semanas = meta_semanas;
    }

    public int getSemana_actual() {
        return semana_actual;
    }

    public void setSemana_actual(int semana_actual) {
        this.semana_actual = semana_actual;
    }

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "FichasPersonales{" + "id_registro=" + id_registro + ", id_usuario=" + id_usuario + ", id_libro=" + id_libro + ", meta_paginas=" + meta_paginas + ", progreso_paginas=" + progreso_paginas + ", meta_semanas=" + meta_semanas + ", semana_actual=" + semana_actual + ", rese\u00f1a=" + reseña + ", calificacion=" + calificacion + '}';
    }
    
    
    
}
