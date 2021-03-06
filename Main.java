public class Main {

    public static void main(String[] args) {
        Worker workerOne = new Worker("Anna", "Samsung");
        Worker workerTwo = new Worker("Bob", "Apple");
        Worker workerThree = new Worker("Anna", "Samsung");

        Student studentOne = new Student("Kevin", "History");
        Student studentTwo = new Student("Bill", "Art");
        Student studentThree = new Student("John", "Technology");

        BlackList<Human> blackList = new BlackList<>();

        Stack stackOne = new Stack(5, blackList);

        //добавляем обьекты в ЧС
        blackList.addToBL(workerOne);
        blackList.addToBL(studentTwo);

        //Добавляем обьекты в стэк
        stackOne.addElement(workerOne);
        stackOne.addElement(workerTwo);
        stackOne.addElement(workerThree);
        stackOne.addElement(studentOne);
        stackOne.addElement(studentTwo);
        stackOne.addElement(studentThree);

        //Чтение верхнего обьекта из стэка
        System.out.println();
        System.out.println("Чтение верхнего обьекта из стэка");
        System.out.println(stackOne.readTop());

        //Чтение и удаление обьекта из стэка
        System.out.println();
        System.out.println("Чтение и удаление обьекта из стэка");
        System.out.println(stackOne.readAndDeleteTop());

        //Чтение верхнего обьекта из стэка
        System.out.println();
        System.out.println("Чтение верхнего обьекта из стэка");
        System.out.println(stackOne.readTop());
    }
}
