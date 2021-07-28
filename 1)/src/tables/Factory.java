package tables;

import annotations.*;

@DBTable(name = "FACTORY")
public class Factory {
    @SQLString(30) String name;
    @SQLInteger Integer age;
    @SQLInteger Integer staff;
    @SQLDouble(name = "profit***") Integer profit;
    @SQLDouble Integer costs;
    @SQLString(value = 30,
            constraints = @Constraints(primaryKey = true))
    String handle;
    static int townCount;
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public Integer getStaff() {
        return staff;
    }
    public Integer getProfit() {
        return profit;
    }
    public Integer getCosts() {
        return costs;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setSaff(Integer staff) {
        this.staff = staff;
    }
}
