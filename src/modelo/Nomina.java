
package modelo;

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


    
    
    //calculos de nómina
    public void HorasExtras(){
        
        Double horase = 0.0;
        Double horas = getHoras();
        
        if(horas > 48){
        
            horase = horas - 48;
        }
    setHorasE(horase);
    }
    
    public void pagoExtras(){
        
        double pagoe = 0;
        double horase = getHorasE();
        double valorh = getValorH();
        
        if(horase >= 1){
            
            pagoe = (valorh * horase)*2;
        
        }
    setPagoE(pagoe);
    }
    
    public void pagoantiguedad(){
    double pagoantiguedad= 0;
    int añosantiguedad = getAntiguedad();
    double sueldo = getEmpleado().getSalario(); 
            
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
       
        setPagoA(pagoantiguedad);
    }
    
    public void calculoir(){
    
   double baseImponible = getSalarioB() - getINNS();
   double sueldoAnual = baseImponible*12;
   setSalarioA(sueldoAnual);
    tarifaProgresivaIr();
    }
    
    public void tarifaProgresivaIr(){
    
    double sueldoAnual = getSalarioA();
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
    
    setIR(IrMensual);
    }
    
    public void valorHoras(){
    double horas = (getEmpleado().getSalario()/4.333)/48;
    setValorH(horas);
    }
    
    public void pagoHoras(){
        double factor = getValorH();
        double pagohoras = (getHoras()*factor);
        setPagoH(pagohoras);
    }

    public void salariobruto(){
        double salariobruto = getIncentivo() + getPagoA() + getPagoE()+ getComicion();
        setSalarioB(salariobruto);
    }
    
    public void totaldeducciones(){
    double total = getINNS() + getIR();
        setOtrasD(total);
    }
    
    public void salarioneto ( ){
        double calculo = getSalarioB() - getOtrasD();
        setNetoR(calculo);
    }
    
    public void inss (){
        double inss = getSalarioB() * 0.07;
        setINNS(inss);
    }
    
    public void inssp (){
    double innsp = getEmpleado().getSalario() * 0.23;
    setINNSP(innsp);
    
    }
    
    public void inatec(){
        double inatec = getEmpleado().getSalario() *0.02;
        setInatec(inatec);
    }

}
