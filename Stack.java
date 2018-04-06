import java.util.ArrayList;


public class Stack {

    private int size;
    private Object [] stackArray;
    private int top;
    private ArrayList blackList=new ArrayList();

    //констуктор, который создает стэк заданного размера
    public Stack(int size) {
        this.size = size;
        this.stackArray = new Object[size];
        this.top = -1;
    }

    public Stack(int size, Object[] stackArray, int top) {
        this.size = size;
        this.stackArray = stackArray;
        this.top = top;
    }

    public Stack() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getStackArray() {
        return stackArray;
    }

    public void setStackArray(Object[] stackArray) {
        this.stackArray = stackArray;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }



    public void addElement(Object obj) {
        if(!checkBL(obj)) {
            stackArray[++top] = obj;
            System.out.println(obj);
        }
        else {
            System.out.println("Добавляемый обьект в черном списке!");
        }
    }

    public Object deleteElement() {
        return stackArray[top--];
    }

    public Object readTop() {
        return stackArray[top];
    }

    public Object readAndDeleteTop() {
        Object obj = readTop();
        deleteElement();
        return obj;
    }

    //проверка обьекта на наличие его в ЧС
    public boolean checkBL(Object obj) {
        for (int k = 0; k < blackList.size(); k++) {
            if (blackList.get(k).equals(obj)) {
                return true;
            }
        }
        return false;
    }

    //метод добавления обьекта в блэк-лист
    public void addToBL (Object obj) {
        blackList.add(obj);


    }

}
