
package modelo;

import java.text.DecimalFormat;

public class Nomina {

    private Empleado empleado;
    private double Horas; //Horas laborales 
    private double ValorH;//Valor de la hora laboral
    private double PagoH;//Pago por horas laborales
    //Bonos
    private double HorasE; // Horas extras
    private double PagoE; //Pago por horas extras
    private int Antiguedad; //Antiguedad
    private double PagoA; //Pago por antiguedad
    //Otras bonificaciones
    private double Incentivo; 
    private double Comicion;
    
    private double salarioB; //Salario bruto
    private double NetoR; //Salario neto a recibir
    private double SalarioA; //Salario anual
    //Otras deducciones
    private double INNS; //INNS
    private double IR; //IR
    private double OtrasD; //Otras deducciones
    //Otros
    private double INNSP; //INNS Patronal
    private double Inatec; //Inatec
    //Prestaciones sociales
    private double Aguinaldo; //Aguinaldo
    private double Vacaciones; //Vacaciones
    
    public Nomina(double Horas, double ValorH, double PagoH, double HorasE, double PagoE, int Antiguedad, 
            double PagoA, double Incentivo, double Comicion, double salarioB, double NetoR, double SalarioA, 
            double INNS, double IR, double OtrasD, double INNSP, double Inatec, double Aguinaldo, double Vacaciones, Empleado empleado) {
        this.Horas = Horas;
        this.ValorH = ValorH;
        this.PagoH = PagoH;
        this.HorasE = HorasE;
        this.PagoE = PagoE;
        this.Antiguedad = Antiguedad;
        this.PagoA = PagoA;
        this.Incentivo = Incentivo;
        this.Comicion = Comicion;
        this.salarioB = salarioB;
        this.NetoR = NetoR;
        this.SalarioA = SalarioA;
        this.INNS = INNS;
        this.IR = IR;
        this.OtrasD = OtrasD;
        this.INNSP = INNSP;
        this.Inatec = Inatec;
        this.Aguinaldo = Aguinaldo;
        this.Vacaciones = Vacaciones;
        this.empleado = empleado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double getHoras() {
        return Horas;
    }

    public void setHoras(double Horas) {
        this.Horas = Horas;
    }

    public double getValorH() {
        return ValorH;
    }

    public void setValorH(double ValorH) {
        this.ValorH = ValorH;
    }

    public double getPagoH() {
        return PagoH;
    }

    public void setPagoH(double PagoH) {
        this.PagoH = PagoH;
    }

    public double getHorasE() {
        return HorasE;
    }

    public void setHorasE(double HorasE) {
        this.HorasE = HorasE;
    }

    public double getPagoE() {
        return PagoE;
    }

    public void setPagoE(double PagoE) {
        this.PagoE = PagoE;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    public double getPagoA() {
        return PagoA;
    }

    public void setPagoA(double PagoA) {
        this.PagoA = PagoA;
    }

    public double getIncentivo() {
        return Incentivo;
    }

    public void setIncentivo(double Incentivo) {
        this.Incentivo = Incentivo;
    }

    public double getComicion() {
        return Comicion;
    }

    public void setComicion(double Comicion) {
        this.Comicion = Comicion;
    }

    public double getSalarioB() {
        return salarioB;
    }

    public void setSalarioB(double salarioB) {
        this.salarioB = salarioB;
    }

    public double getNetoR() {
        return NetoR;
    }

    public void setNetoR(double NetoR) {
        this.NetoR = NetoR;
    }

    public double getSalarioA() {
        return SalarioA;
    }

    public void setSalarioA(double SalarioA) {
        this.SalarioA = SalarioA;
    }

    public double getINNS() {
        return INNS;
    }

    public void setINNS(double INNS) {
        this.INNS = INNS;
    }

    public double getIR() {
        return IR;
    }

    public void setIR(double IR) {
        this.IR = IR;
    }

    public double getOtrasD() {
        return OtrasD;
    }

    public void setOtrasD(double OtrasD) {
        this.OtrasD = OtrasD;
    }

    public double getINNSP() {
        return INNSP;
    }

    public void setINNSP(double INNSP) {
        this.INNSP = INNSP;
    }

    public double getInatec() {
        return Inatec;
    }

    public void setInatec(double Inatec) {
        this.Inatec = Inatec;
    }

    public double getAguinaldo() {
        return Aguinaldo;
    }

    public void setAguinaldo(double Aguinaldo) {
        this.Aguinaldo = Aguinaldo;
    }

    public double getVacaciones() {
        return Vacaciones;
    }

    public void setVacaciones(double Vacaciones) {
        this.Vacaciones = Vacaciones;
    }

    @Override
    public String toString() {
        return getEmpleado().getNombres();
    }

    
    
    
    //calculos de nómina
    public void HorasExtras(Nomina empleado){
        
        Double horase = 0.0;
        Double horas = empleado.getHoras();
        
        if(horas > 48){
        
            horase = horas - 48;
        }
    empleado.setHorasE(horase);
    }
    
    public void pagoExtras(Nomina empleado){
       double factor= 240; 
    empleado.setPagoE(Math.round((empleado.empleado.getSalario() / factor) * 2* empleado.getHorasE()));
    }
    
    public void pagoantiguedad(Nomina empleado){
    double pagoantiguedad= 0;
    int añosantiguedad = empleado.getAntiguedad();
    double sueldo = empleado.getEmpleado().getSalario(); 
            
        if (añosantiguedad == 1) {
        pagoantiguedad = sueldo * 0.03;
        } else if (añosantiguedad == 2) {
        pagoantiguedad = sueldo * 0.05;
        } else if (añosantiguedad == 3) {
        pagoantiguedad = sueldo * 0.07;
        } else if (añosantiguedad == 4) {
        pagoantiguedad = sueldo * 0.09;
        } else if (añosantiguedad == 5) {
        pagoantiguedad = sueldo * 0.1;
        } else if (añosantiguedad == 6) {
        pagoantiguedad = sueldo * 0.11;
        } else if (añosantiguedad == 7) {
        pagoantiguedad = sueldo * 0.12;
        } else if (añosantiguedad == 8) {
        pagoantiguedad = sueldo * 0.13;
        } else if (añosantiguedad == 9) {
        pagoantiguedad = sueldo * 0.14;
        } else if (añosantiguedad == 10) {
        pagoantiguedad = sueldo * 0.15;
        } else if (añosantiguedad == 11) {
        pagoantiguedad = sueldo * 0.155;
        } else if (añosantiguedad == 12) {
        pagoantiguedad = sueldo * 0.16;
        } else if (añosantiguedad == 13) {
        pagoantiguedad = sueldo * 0.165;
        } else if (añosantiguedad == 14) {
        pagoantiguedad = sueldo * 0.17;
        } else if (añosantiguedad == 15) {
        pagoantiguedad = sueldo * 0.175;
        } else if (añosantiguedad == 16) {
        pagoantiguedad = sueldo * 0.18;
        } else if (añosantiguedad == 17) {
        pagoantiguedad = sueldo * 0.185;
        } else if (añosantiguedad == 18) {
        pagoantiguedad = sueldo * 0.19;
        } else if (añosantiguedad == 19) {
        pagoantiguedad = sueldo * 0.195;
        } else if (añosantiguedad >= 20) {
        pagoantiguedad = sueldo * 0.20;
     }
       
        empleado.setPagoA(Math.round(pagoantiguedad));
    }
    
    public void calculoir(Nomina empleado){
    
   double baseImponible = empleado.getSalarioB() - empleado.getINNS();
   double sueldoAnual = baseImponible*12;
   
   empleado.setSalarioA(sueldoAnual);
    
    tarifaProgresivaIr(empleado);
    }
    
    public void tarifaProgresivaIr(Nomina empleado){
    
    double sueldoAnual = empleado.getSalarioA();
    double deducible = 0;
    double porcentaje = 0;
    double impuestoBase=0;
    double salarioMenosDeducible=0;
    double IrAnual= 0;
    double IrMensual=0;
    
     if(sueldoAnual >= 1 && sueldoAnual <=100000){
        salarioMenosDeducible= sueldoAnual-deducible;
       IrAnual= (salarioMenosDeducible * porcentaje) + impuestoBase;
       IrMensual = IrAnual/12;
    }
    if(sueldoAnual >= 100001 && sueldoAnual <=200000){
        deducible = 100000;
        porcentaje= 0.15;
        salarioMenosDeducible= sueldoAnual-deducible;
       IrAnual= (salarioMenosDeducible * porcentaje) + impuestoBase;
       IrMensual = IrAnual/12;
    }
    if(sueldoAnual >= 200001 && sueldoAnual <=350000){
        deducible = 200000;
        porcentaje= 0.2;
        impuestoBase = 15000;
        salarioMenosDeducible= sueldoAnual-deducible;
       IrAnual= (salarioMenosDeducible * porcentaje) + impuestoBase;
       IrMensual = IrAnual/12;
    }
    if(sueldoAnual >= 350001 && sueldoAnual <=500000){
        deducible = 350000;
        porcentaje= 0.25;
        impuestoBase = 45000;
        salarioMenosDeducible= sueldoAnual-deducible;
       IrAnual= (salarioMenosDeducible * porcentaje) + impuestoBase;
       IrMensual = IrAnual/12;
    }
    if(sueldoAnual >=500001){
        deducible = 500000;
        porcentaje= 0.3;
        impuestoBase = 82500;
        salarioMenosDeducible= sueldoAnual-deducible;
       IrAnual= (salarioMenosDeducible * porcentaje) + impuestoBase;
       IrMensual = IrAnual/12;
        }
    empleado.setIR(Math.round(IrMensual));
    }
    
    public void valorHoras(Nomina empleado){
    double horas = (empleado.getEmpleado().getSalario()/4.3)/48;
    empleado.setValorH(horas);
    }
    
    public void pagoHoras(Nomina empleado){
        double factor = empleado.getValorH();
        double pagohoras = (empleado.getHoras() * factor);
        empleado.setPagoH(pagohoras);
    }

    public void salariobruto(Nomina empleado){
        double salariobruto = empleado.getIncentivo() + empleado.empleado.getSalario()+ empleado.getPagoE()+ empleado.getComicion()+ empleado.getPagoA();
        empleado.setSalarioB(salariobruto);
    }
    
    public void totaldeducciones(Nomina empleado){
    double total = empleado.getINNS() + empleado.getIR();
        empleado.setOtrasD(total);
    }
    
    public void salarioneto (Nomina empleado){
        double calculo = empleado.getSalarioB() - empleado.getOtrasD();
        empleado.setNetoR(calculo);
    }
    
    public void inss (Nomina empleado){
        double inss = empleado.getSalarioB() * 0.07;
        empleado.setINNS(Math.round(inss));
    }
    
    public void inssp (Nomina empleado){
    double innsp = empleado.getSalarioB() * 0.23;
    empleado.setINNSP(innsp);
    
    }
    
    public void inatec(Nomina empleado){
        double inatec = empleado.getSalarioB() *0.02;
        empleado.setInatec(Math.round(inatec));
    }

    public void calculoVacaciones(Nomina empleado){
   //se crea la constante factor
   double factor= 0.083333;
   //se crea la varible local vacaciones multiplica el salario mensual por el factor
   double vacaciones = empleado.empleado.getSalario() * factor;
   //se registra el calculo en el atributo calculoVacaiones de la clase empelado
   empleado.setVacaciones(Math.round(vacaciones));
    }
    
    public void aguinaldo(Nomina empleado){
    //se crea la constante factor
   double factor= 0.083333;
   //se crea la varible local treceavoMes multiplica el salario mensual por el factor
   double treceavoMes = empleado.empleado.getSalario()* factor;
   //se registra el calculo en el atributo TreceavoMes de la clase empelado
   empleado.setAguinaldo(Math.round(treceavoMes)); 
}
    
}
