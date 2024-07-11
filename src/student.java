public class student {
    String nombre;
    String cedula;
    Double nota1;
    Double nota2;

    public student() {
    }

    public student(String nombre, String cedula, Double nota1, Double nota2) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

}
