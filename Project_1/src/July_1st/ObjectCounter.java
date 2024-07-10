package July_1st;

public class ObjectCounter {
	private static int objectCount = 0;

    public ObjectCounter() {
        objectCount++;
    }

    public static int getCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        // Create 5 objects
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();
        ObjectCounter obj4 = new ObjectCounter();
        ObjectCounter obj5 = new ObjectCounter();

        System.out.println("Number of objects created: " + getCount());
    }
}

