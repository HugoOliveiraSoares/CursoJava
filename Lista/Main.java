import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Main {

    static List<Activity> listActivity = new ArrayList<>();

    public static void main(String[] args) {

        Activity activity1 =  new Activity();
        Activity activity2 =  new Activity();
        Activity activity3 =  new Activity();

        activity1.setTask("A");
        activity1.setInformation("Work1-part1");
        activity1.setTimeSpent("09:00", "10:00");
        
        activity2.setTask("B");
        activity2.setInformation("Work2");
        activity2.setTimeSpent("10:00", "11:00");

        activity3.setTask("A");
        activity3.setInformation("Wor1-part2");
        activity3.setTimeSpent("11:00", "12:00");

        listActivity.add(activity1);
        listActivity.add(activity2);
        listActivity.add(activity3);

        // System.out.println(listActivity.get(1).toString());
        // System.out.println(getListActivity());
        System.out.println(getbyTask("A"));

    }

    public static String getListActivity() {
        String x = "";
        for (int i = 0; i < listActivity.size(); i++ ) {
            x += listActivity.get(i).toString() + "\n";
        }
        return x;
    }

    public static String getbyTask(String id) {
        
        String x = "";
        for (int i = 0; i < listActivity.size(); i++) {
            if (listActivity.get(i).getTask().equals(id)) {
                x += listActivity.get(i).toString() + "\n";
            }
        }
        return x;
    }

    public static void setListActivity(List<Activity> _listActivity) {
        listActivity = _listActivity;
    }
    
}
