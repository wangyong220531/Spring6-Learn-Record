package dimap;

public class Student {
    private String sid;
    private String sname;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void run() {
        System.out.println(sid + sname);
    }
}
