import java.util.ArrayList;
import java.util.List;

public class BlackList<T> {
    private List<T> blackList = new ArrayList<T>();

    public BlackList(List<T> blackList) {
        this.blackList = blackList;
    }

    public BlackList() {

    }

    public List<T> getBlackList() {
        return blackList;
    }

    public void setBlackList(List<T> blackList) {
        this.blackList = blackList;
    }

    //проверка обьекта на наличие его в ЧС
    public boolean checkBL(T obj) {
        for (int k = 0; k < blackList.size(); k++) {
            if (blackList.get(k).equals(obj)) {
                return true;
            }
        }
        return false;
    }

    //метод добавления обьекта в блэк-лист
    public void addToBL(T obj) {
        blackList.add(obj);


    }
}
