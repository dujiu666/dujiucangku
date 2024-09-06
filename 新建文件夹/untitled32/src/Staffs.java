public class Staffs{
    private String  employeenumber;//员工编号
    private String  name;//姓名
    private String  DEPARTMENT;//所属部门
    private String  productnumber;//产品编号
    private String  planA;//任务计划编号
    private String  money;//工资
    private String  EmployeeType;//员工类型
    public Staffs() {
    }
    public Staffs(String employeenumber, String name, String DEPARTMENT, String productnumber, String planA, String money, String employeeType) {
        this.employeenumber = employeenumber;
        this.name = name;
        this.DEPARTMENT = DEPARTMENT;
        this.productnumber = productnumber;
        this.planA = planA;
        this.money = money;
        EmployeeType = employeeType;
    }

    public String getEmployeenumber() {
        return employeenumber;
    }

    public void setEmployeenumber(String employeenumber) {
        this.employeenumber = employeenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public void setDEPARTMENT(String DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT;
    }

    public String getProductnumber() {
        return productnumber;
    }

    public void setProductnumber(String productnumber) {
        this.productnumber = productnumber;
    }

    public String getPlanA() {
        return planA;
    }

    public void setPlanA(String planA) {
        this.planA = planA;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getEmployeeType() {
        return EmployeeType;
    }

    public void setEmployeeType(String employeeType) {
        EmployeeType = employeeType;
    }
    @Override
    public String toString() {
        return "Users{" +
                ",员工编号='" + employeenumber+ '\'' +
                ", 姓名='" + name + '\'' +
                ", 所属部门='" + DEPARTMENT + '\'' +
                ", 产品编号='" + productnumber + '\'' +
                ", 任务计划编号='" + planA+ '\'' +
                ", 工资='" + money + '\'' +
                ", 员工类型='" + EmployeeType + '\'' +
                '}';
    }

}
