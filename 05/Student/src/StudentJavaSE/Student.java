package StudentJavaSE;
//26��public class Student implements Comparable
public class Student implements Comparable<Object>{
	private String stdId;
    private String name;
    private String birDate;
    private String gender;
    //12��Student��ʼ��
    public Student() {
 
    }
    public Student(String stdId,String name, String birDate, String gender) {
        super();
        this.name = name;
        this.stdId = stdId;
        this.birDate = birDate;
        this.gender = gender;
    }
    //4��ѧ��
    public String getStdId() {
        return stdId;
    }
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
    //4������
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //4����������
    public String getBirDate() {
        return birDate;
    }
    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }
    //4���Ա�
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    //8��ѧ�ŵ�������
    public int compareTo(Object o) {
		return Integer.valueOf(this.getStdId())-Integer.valueOf(((Student)o).getStdId());
    }
}