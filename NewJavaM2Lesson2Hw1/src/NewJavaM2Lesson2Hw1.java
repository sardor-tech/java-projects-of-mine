public class NewJavaM2Lesson2Hw1 {

    private Integer hour;
    private Integer minute;
    private Integer second;

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public static void main(String[] args) {
        NewJavaM2Lesson2Hw1 all = new NewJavaM2Lesson2Hw1();
        all.setHour(5);
        all.setMinute(11);
        all.setSecond(43);
        System.out.println("Result: " + (all.getHour() > 9 ? all.getHour() : ("0" + all.getHour())) + "." + (all.getMinute() > 9 ? all.getMinute() : ("0" + all.getMinute())) + "." + all.getSecond());
    }
}
