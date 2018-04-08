
public class Stack {

    private int size;
    private Object[] stackArray;
    private int top;
    private BlackList blackList;


    //конструктор, который создает стэк заданного размера
    public Stack(int size, BlackList blackList) {
        this.size = size;
        this.stackArray = new Object[size];
        this.top = -1;
        this.blackList = blackList;
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
        if(!blackList.checkBL(obj)) {
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



}
