
package hospital;

public class Hospital {

    private int numeroDeHabitaciones;
    private int numeroDeTrabajadores;
    private int numeroDeEspecialistas;
    private int pacientesConEnfermedadesTerminales;
    private date fechaDeApertura;
    private int numeroDeEspecialista;
       
    public Hospital (int numeroDeHabitaciones,int numeroDeTrabajadores, int numeroDeEspecialistas, boolean pacientesConEnfermedadesTerminales, int numeroDeBaños) {
            this.numeroDeHabitaciones = numeroDeHabitaciones;
            this.numeroDeTrabajadores = numeroDeTrabajadores;
            this.numeroDeEspecialistas = numeroDeEspecialistas;
            this.pacientesConEnfermedadesTerminales = pacientesConEnfermedadesTerminales;
            this.fechaDeApertura = fechaDeApertura;
    }

public void agregarHabitaciones() {
    this.numeroDeHabitaciones +=1;
}

public void agregarHabitaciones(int habitaciones) {
    if (habitaciones < this.numeroDeHabitaciones) {
        system.out.println("tiene mas habitaciones de las que se agregaron");
       
    }
    else {
        system.out.println("se agregaron habitaciones");
        numeroDeHabitaciones = habitaciones;
    }
    
public void contratarTrabajadores() {
    this.numeroDeTrabajadores +=1;
}

public void contratarTrabajadores(int trabajadores) {
    if (trabajadores < this.numeroDeTrabajadores) {
        system.out.println("tiene mas trabajadores de los contratados");
       
    }
    else {
        system.out.println("se contrataron trabajadores");
        numeroDeTrabajadores = trabajadores;
}
    
public void contratarEspecialistas() {
    this.numeroDeEspecialistas +=1;
}

public void contratarEspecialistas(int especialistas) {
    if (especialistas < this.numeroDeEspecialistas) {
        system.out.println("tiene mas especialistas de los contratados");
       
    }
    else {
        system.out.println("se contrataron especialistas");
        numeroDeEspecialistas = especialistas;
    }       
    
public void pacientesConEnfermedadesTerminales() {
    this.pacientesConEnfermedadesTerminales += 0;
    }
   
public void aumentoDePacientesConEnfermedadesTerminales(int nuevoNumeroDePacientesConEnfermedadesTerminales){
    if (nuevoNumeroDePacientesConEnfermedadesTerminales<=this.pacientesConEnfermedadesTerminales)(
            system.out.println("los pacientes con enfermedades terminales no han aumentado"´);
    }else{
        this.pacientesConEnfermedadesTerminales= pacientesConEnfermedadesTerminales;
        system.out.println("el nuevo numero de pacientes con enfermedades terminales es: "+
                string.valueOf(nuevonumerodepacientesconenfermedadesterminales) + "pacientes");
        }  
    
    }
    public int getNumeroDeHabitaciones() {
        return numeroDeHabitaciones;
    }
    
    public void setNumeroDeHabitaciones(int numeroDeHabitaciones) {
        this.numeroDeHabitaciones = numeroDeHabitaciones;
    }
    
    public int getNumeroDeTrabajadores() {
        return numeroDeTrabajadores;
    }
    
    public void setNumeroDeTrabajadores(int numeroDeTrabajadores) {
        this.numeroDeTrabajadores = numeroDeTrabajadores;
    }
    
    public int getNumeroDeEspecialistas() {
        return numeroDeEspecialistas;
    }
    
    public void setNumeroDeEspecialistas(int numeroDeEspecialistas) {
        this.numeroDeEspecialistas = numeroDeEspecialistas;
    }
    
    public boolean getPacientesConEnfermedadesTerminales() {
        return pacientesConEnfermedadesTerminales;
    }
    
    public void setPacientesConEnfermedadesTerminales (boolean pacientesConEnfermedadesTerminales ) {
        this.pacientesConEnfermedadesTerminales = pacientesConEnfermedadesTerminales;
    }
    
    public date getFechaDeApertura() {
        return fechaDeApertura;
    }
    
    public void setFechaDeApertura (date fechaDeApertura) {
        this.fechaDeApertura = fechaDeApertura;
    }
}