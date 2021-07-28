package tables;

import annotations.Constraints;
import annotations.DBTable;
import annotations.SQLInteger;
import annotations.SQLString;

@DBTable(name = "TOWN")
public class Town {
    @SQLString(30) String name;
    @SQLInteger Integer age;
    @SQLInteger Integer population;
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
    public Integer getPopulation() {
        return population;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setPopulation(Integer population) {
        this.population = population;
    }
}
