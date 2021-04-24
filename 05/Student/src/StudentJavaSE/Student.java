package StudentJavaSE;
public class Student implements Comparable{
	private String stdId;
    private String name;
    private String birDate;
    private String gender;
    public Student() {
 
    }
    public Student(String stdId,String name, String birDate, String gender) {
        super();
        this.name = name;
        this.stdId = stdId;
        this.birDate = birDate;
        this.gender = gender;
    }
    public String getStdId() {
        return stdId;
    }
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBirDate() {
        return birDate;
    }
    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
	//学号从小到大排序
    public int compareTo(Object o) {
		return Integer.valueOf(this.getStdId())-Integer.valueOf(((Student)o).getStdId());
    }
}