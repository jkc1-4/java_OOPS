package sunw.demo.EmployeeBean;

import java.beans.*;
import java.awt.*;
import java.io.*;

public class EmployeeBean extends Canvas implements Serializable {
    private int id;
    private String name;
    private String deptName;
    private int yearOfJoin;

    public EmployeeBean() {
        setSize(100, 100);
        name = "";
        id = 0;
        deptName = "";
        yearOfJoin = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getYearOfJoin() {
        return yearOfJoin;
    }

    public void setYearOfJoin(int yearOfJoin) {
        this.yearOfJoin = yearOfJoin;
    }

    public void paint(Graphics g) {
        String nameMsg = "Hello " + name;
        g.drawString(nameMsg, 10, 10);
        String idMsg = "Id No. is " + id;
        g.drawString(idMsg, 10, 20);
        String deptMsg = "Department is " + deptName;
        g.drawString(deptMsg, 10, 30);
        String yearMsg = "Year of join is " + yearOfJoin;
        g.drawString(yearMsg, 10, 40);
    }

}
