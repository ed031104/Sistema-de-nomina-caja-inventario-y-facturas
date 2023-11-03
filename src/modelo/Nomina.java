
package modelo;

public class Nomina {

    private Empleado empleado;
    private Double Horas; //Horas laborales 
    private Double ValorH;//Valor de la hora laboral
    private Double PagoH;//Pago por horas laborales
    //Bonos
    private Double HorasE; // Horas extras
    private Double PagoE; //Pago por horas extras
    private int Antiguedad; //Antiguedad
    private Double PagoA; //Pago por antiguedad
    //Otras bonificaciones
    private Double Incentivo; 
    private Double Comicion;
    
    private Double salarioB; //Salario bruto
    private Double NetoR; //Salario neto a recibir
    private Double SalarioA; //Salario anual
    //Otras deducciones
    private Double INNS; //INNS
    private Double IR; //IR
    private Double OtrasD; //Otras deducciones
    //Otros
    private Double INNSP; //INNS Patronal
    private Double Inatec; //Inatec
    //Prestaciones sociales
    private Double Aguinaldo; //Aguinaldo
    private Double Vacaciones; //Vacaciones

    public Nomina(Double Horas, Double ValorH, Double PagoH, Double HorasE, Double PagoE, int Antiguedad, 
            Double PagoA, Double Incentivo, Double Comicion, Double salarioB, Double NetoR, Double SalarioA, 
            Double INNS, Double IR, Double OtrasD, Double INNSP, Double Inatec, Double Aguinaldo, Double Vacaciones, Empleado empleado) {
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


    public Double getHoras() {
        return Horas;
    }

    public void setHoras(Double Horas) {
        this.Horas = Horas;
    }

    public Double getValorH() {
        return ValorH;
    }

    public void setValorH(Double ValorH) {
        this.ValorH = ValorH;
    }

    public Double getPagoH() {
        return PagoH;
    }

    public void setPagoH(Double PagoH) {
        this.PagoH = PagoH;
    }

    public Double getHorasE() {
        return HorasE;
    }

    public void setHorasE(Double HorasE) {
        this.HorasE = HorasE;
    }

    public Double getPagoE() {
        return PagoE;
    }

    public void setPagoE(Double PagoE) {
        this.PagoE = PagoE;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    public Double getPagoA() {
        return PagoA;
    }

    public void setPagoA(Double PagoA) {
        this.PagoA = PagoA;
    }

    public Double getIncentivo() {
        return Incentivo;
    }

    public void setIncentivo(Double Incentivo) {
        this.Incentivo = Incentivo;
    }

    public Double getComicion() {
        return Comicion;
    }

    public void setComicion(Double Comicion) {
        this.Comicion = Comicion;
    }

    public Double getSalarioB() {
        return salarioB;
    }

    public void setSalarioB(Double salarioB) {
        this.salarioB = salarioB;
    }

    public Double getNetoR() {
        return NetoR;
    }

    public void setNetoR(Double NetoR) {
        this.NetoR = NetoR;
    }

    public Double getSalarioA() {
        return SalarioA;
    }

    public void setSalarioA(Double SalarioA) {
        this.SalarioA = SalarioA;
    }

    public Double getINNS() {
        return INNS;
    }

    public void setINNS(Double INNS) {
        this.INNS = INNS;
    }

    public Double getIR() {
        return IR;
    }

    public void setIR(Double IR) {
        this.IR = IR;
    }

    public Double getOtrasD() {
        return OtrasD;
    }

    public void setOtrasD(Double OtrasD) {
        this.OtrasD = OtrasD;
    }

    public Double getINNSP() {
        return INNSP;
    }

    public void setINNSP(Double INNSP) {
        this.INNSP = INNSP;
    }

    public Double getInatec() {
        return Inatec;
    }

    public void setInatec(Double Inatec) {
        this.Inatec = Inatec;
    }

    public Double getAguinaldo() {
        return Aguinaldo;
    }

    public void setAguinaldo(Double Aguinaldo) {
        this.Aguinaldo = Aguinaldo;
    }

    public Double getVacaciones() {
        return Vacaciones;
    }

    public void setVacaciones(Double Vacaciones) {
        this.Vacaciones = Vacaciones;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
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
