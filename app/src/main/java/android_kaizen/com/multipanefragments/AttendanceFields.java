package android_kaizen.com.multipanefragments;

/**
 * Created by GAURAV on 10/15/2017.
 */

public class AttendanceFields {
    String srNo;
    String teacherName;
    String Gender;
    String Attendance;

    public AttendanceFields(String srNo, String teacherName, String gender, String attendance) {
        this.srNo = srNo;
        this.teacherName = teacherName;
        Gender = gender;
        Attendance = attendance;
    }

    public String getSrNo() {
        return srNo;
    }

    public void setSrNo(String srNo) {
        this.srNo = srNo;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAttendance() {
        return Attendance;
    }

    public void setAttendance(String attendance) {
        Attendance = attendance;
    }
}
