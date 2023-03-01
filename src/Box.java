public class Box<T extends Fruit> {
    private int quantity;
    private T fruit;

    public void add(T fruit) {
        if (this.fruit == null) {
            this.fruit = fruit;
            ++this.quantity;
        } else if (this.fruit.getClass().equals(fruit.getClass())) {
            ++this.quantity;
        }
    }

    public void add(T fruit, int quantity) {
        if (this.fruit == null) {
            this.fruit = fruit;
            this.quantity += quantity;
        } else if (this.fruit.getClass().equals(fruit.getClass())) {
            this.quantity += quantity;
        }
    }

    public float getWeight() {
        return quantity * (fruit == null ? 0 : fruit.getWeight());
    }

    public boolean compare(Box box2) {
        if (!this.equals(box2)) {
            return box2 != null && ((box2.getWeight()) - this.getWeight()) == 0;
        }
        return false;
    }

    public void merge(Box box2) {
        if (box2.fruit != null && !this.equals(box2) && this.fruit.getClass().equals(box2.fruit.getClass())) {
            this.quantity += box2.quantity;
        }
    }

    @Override
    public String toString() {
        return "[Box of " + fruit.getClass().getName() + "s : quantity " + quantity + "]";
    }
}
